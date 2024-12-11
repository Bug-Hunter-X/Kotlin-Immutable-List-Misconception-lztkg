```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.size) // Prints 2
    list.add(6) // Modifies the original mutable list
    println(list.size) // Prints 6
    println(list.filter { it % 2 == 0 }.size) //Prints 3
}
```