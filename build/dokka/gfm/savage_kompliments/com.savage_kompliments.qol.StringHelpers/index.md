//[savage_kompliments](../../index.md)/[com.savage_kompliments.qol.StringHelpers](index.md)

# Package com.savage_kompliments.qol.StringHelpers

## Functions

| Name | Summary |
|---|---|
| [get](get.md) | [common]<br>operator fun [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).[get](get.md)(i: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), j: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Allows [splice](splice.md) to be called in a more Pythonic way using square brackets 'string[]', same as can be done with a Collection. |
| [splice](splice.md) | [common]<br>fun [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).[splice](splice.md)(a: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), b: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), allowIndexReverse: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Splices the String from index [a](splice.md) to index [b](splice.md). If [allowIndexReverse](splice.md) is true, the splice can be made from a larger index [a](splice.md) to a smaller index [b](splice.md). This also allows for negative indexing. |
