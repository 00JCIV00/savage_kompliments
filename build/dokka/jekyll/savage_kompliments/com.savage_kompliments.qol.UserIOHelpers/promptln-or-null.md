---
title: promptlnOrNull
---
//[savage_kompliments](../../index.html)/[com.savage_kompliments.qol.UserIOHelpers](index.html)/[promptlnOrNull](promptln-or-null.html)



# promptlnOrNull



[common]\
fun [promptlnOrNull](promptln-or-null.html)(prompt: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?



Reads in nullable input from stdin after displaying the given [prompt](promptln-or-null.html) to stdout.



## Samples

```kotlin
import com.savage_kompliments.qol.UserIOHelpers.*
fun main() { 
   //sampleStart 
   // Displays "What's your favorite color?" to stdout, then returns the next line from stdin as a String
// or "I don't really have one" if there is no input.
val color = promptlnOrNull("What's your favorite color?") ?: "I don't really have one" 
   //sampleEnd
}
```



