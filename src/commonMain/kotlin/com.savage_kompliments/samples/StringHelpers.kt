package com.savage_kompliments.samples

import com.savage_kompliments.qol.StringHelpers.*

fun sampleSplice() {
	val baseString = "Aibohphobia, it’s the fear of palindromes."

	// Normal Splice: Prints "phobia"
	println(baseString.splice(5, 10))

	// Reversed Splice: Prints "it's the fear"
	println(baseString.splice(25, 13))
}

fun sampleGet() {
	val baseString = "Bruce Wayne is Batman!"

	// Normal Get: Prints "Bruce Wayne"
	println(baseString[0, 11])

	// Negative Indexing: Prints "Batman!"
	println(baseString[-1, -7])
}

fun main() {
	sampleSplice()
}


