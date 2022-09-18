---
title: splice
---
//[savage_kompliments](../../index.html)/[com.savage_kompliments.qol.StringHelpers](index.html)/[splice](splice.html)



# splice



[common]\
fun [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).[splice](splice.html)(a: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), b: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), allowIndexReverse: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)



Splices the String from index [a](splice.html) to index [b](splice.html). If [allowIndexReverse](splice.html) is true, the splice can be made from a larger index [a](splice.html) to a smaller index [b](splice.html). This also allows for negative indexing.



## Samples

```kotlin
import com.savage_kompliments.qol.StringHelpers.*
fun main() { 
   //sampleStart 
   val baseString = "Aibohphobia, it’s the fear of palindromes."

// Normal Splice: Prints "phobia"
println(baseString.splice(5, 10))

// Reversed Splice: Prints "it's the fear"
println(baseString.splice(25, 13)) 
   //sampleEnd
}
```



