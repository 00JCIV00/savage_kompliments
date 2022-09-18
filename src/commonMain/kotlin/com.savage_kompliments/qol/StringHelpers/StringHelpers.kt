/*
Author:     Jake Crawford
Created:    04 JUN 2022
Updated:    16 SEP 2022
Version:	0.0.1a

Details:    Helpers for the String class.
 */

package com.savage_kompliments.qol.StringHelpers

/**
 * String Helpers
 *
 * A series of functions meant to compliment the String class.
 */

/**
 * Splices the String from index [a] to index [b]. If [allowIndexReverse] is true, the splice can be made from a
 * larger index [a] to a smaller index [b]. This also allows for negative indexing.
 *
 * @sample com.savage_kompliments.samples.sampleSplice
 */
fun String.splice(a: Int, b: Int, allowIndexReverse: Boolean = true): String {
	val indices: List<Int> = listOf(a, b).map { index ->
		if (index < 0) lastIndex + 2 + index else index
	}
	if (indices[1] < indices[0] && allowIndexReverse) return substring(indices[1], indices[0])
	return substring(indices[0], indices[1])
}

/**
 * Allows slice to be called in a more Pythonic way, same as can be done with a Collection.
 *
 * @sample com.savage_kompliments.samples.sampleGet
 */
operator fun String.get(i: Int, j: Int): String {
	return splice(i, j)
}
