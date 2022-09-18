//[savage_kompliments](../../index.md)/[com.savage_kompliments.qol.UserIOHelpers](index.md)/[promptlnOrNull](promptln-or-null.md)

# promptlnOrNull

[common]\
fun [promptlnOrNull](promptln-or-null.md)(prompt: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

Reads in nullable input from stdin after displaying the given [prompt](promptln-or-null.md).

## Samples

```kotlin
import com.savage_kompliments.qol.UserIOHelpers.*
fun main() { 
   //sampleStart 
   // Displays "What's your favorite color?" to stdout, then returns the next line from stdin as a String
// or "I don't really have one" if there is no input.
val color = promptln("What's your favorite color?") ?: "I don't really have one" 
   //sampleEnd
}
```
