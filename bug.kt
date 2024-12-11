```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.size) //This will print 2 which is correct.
    val evenNumbers2 = list.filter { it % 2 == 0 }.toMutableList()
    evenNumbers2.add(6)
    println(evenNumbers2.size) // This will print 3, which is also correct, but...
    println(list.size) //This will print 5, which is expected.
    println(list.filter { it % 2 == 0 }.size) //This will print 2, which is expected.
}
```