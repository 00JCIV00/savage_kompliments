/*
Author:     Jake Crawford
Created:    04 JUN 2022
Updated:    16 SEP 2022
Version:	0.0.1a

Details:    Helpers for the User Input/Output.
 */
package com.savage_kompliments.qol.UserIOHelpers

/**
 * User Input/Output Helpers
 *
 * A series of functions meant to compliment User Input/Output functions.
 */

/**
 * Reads in non-nullable input from stdin after displaying the given [prompt] to stdout.
 *
 * @sample com.savage_kompliments.samples.UserIOHelpers.samplePromptln
 */
fun promptln(prompt: String): String {
    println(prompt)
    return readln()
}

/**
 * Reads in nullable input from stdin after displaying the given [prompt] to stdout.
 *
 * @sample com.savage_kompliments.samples.UserIOHelpers.samplePromptlnOrNull
 */
fun promptlnOrNull(prompt: String): String? {
    println(prompt)
    return readlnOrNull()
}
