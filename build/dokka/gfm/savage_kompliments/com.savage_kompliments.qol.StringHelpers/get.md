//[savage_kompliments](../../index.md)/[com.savage_kompliments.qol.StringHelpers](index.md)/[get](get.md)

# get

[common]\
operator fun [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).[get](get.md)(i: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), j: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Allows [splice](splice.md) to be called in a more Pythonic way using square brackets 'string[]', same as can be done with a Collection.

## Samples

```kotlin
import com.savage_kompliments.qol.StringHelpers.*
fun main() { 
   //sampleStart 
   val baseString = "Bruce Wayne is Batman!"

// Normal Get: Prints "Bruce Wayne"
println(baseString[0, 11])

// Negative Indexing: Prints "Batman!"
println(baseString[-1, -7]) 
   //sampleEnd
}
```
