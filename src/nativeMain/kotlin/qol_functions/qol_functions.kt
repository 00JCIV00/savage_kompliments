package savagej.qol_functions

fun String.slice(a: Int, b: Int, allowIndexReverse: Boolean = true): String {
    val indices: List<Int> = listOf(a, b).map { index ->
        if (index < 0) lastIndex + 2 + index else index
    }
    if (indices[1] < indices[0] && allowIndexReverse) return substring(indices[1], indices[0])
    return substring(indices[0], indices[1])
}

operator fun String.get(i: Int, j: Int): String {
    return slice(i, j)
}

fun readLinePrompt(prompt: String): String? {
    println(prompt)
    return readLine()
}

