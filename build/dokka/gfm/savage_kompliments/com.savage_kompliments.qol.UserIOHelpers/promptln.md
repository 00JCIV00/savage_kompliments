//[savage_kompliments](../../index.md)/[com.savage_kompliments.qol.UserIOHelpers](index.md)/[promptln](promptln.md)

# promptln

[common]\
fun [promptln](promptln.md)(prompt: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Reads in non-nullable input from stdin after displaying the given [prompt](promptln.md).

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
