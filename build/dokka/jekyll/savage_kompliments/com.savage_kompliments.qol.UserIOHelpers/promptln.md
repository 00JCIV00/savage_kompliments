---
title: promptln
---
//[savage_kompliments](../../index.html)/[com.savage_kompliments.qol.UserIOHelpers](index.html)/[promptln](promptln.html)



# promptln



[common]\
fun [promptln](promptln.html)(prompt: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)



Reads in non-nullable input from stdin after displaying the given [prompt](promptln.html) to stdout.



## Samples

```kotlin
import com.savage_kompliments.qol.UserIOHelpers.*
fun main() { 
   //sampleStart 
   // Displays "Please enter your name:" to stdout, then returns the next line from stdin as a String.
val name = promptln("Please enter your name:") 
   //sampleEnd
}
```



