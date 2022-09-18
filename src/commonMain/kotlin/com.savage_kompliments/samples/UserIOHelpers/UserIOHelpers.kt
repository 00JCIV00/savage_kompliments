package com.savage_kompliments.samples.UserIOHelpers

import com.savage_kompliments.qol.UserIOHelpers.*

/**
 * Sample of the [promptln] extension function from User IO Helpers.
 */
fun samplePromptln() {
	// Displays "Please enter your name:" to stdout, then returns the next line from stdin as a String.
	val name = promptln("Please enter your name:")
}

/**
 * Sample of the [promptlnOrNull] extension function from User IO Helpers.
 */
fun samplePromptlnOrNull() {
	// Displays "What's your favorite color?" to stdout, then returns the next line from stdin as a String
	// or "I don't really have one" if there is no input.
	val color = promptlnOrNull("What's your favorite color?") ?: "I don't really have one"
}