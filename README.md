# Kotlin Immutable List Behavior

This example highlights a common misunderstanding regarding immutability in Kotlin.  While Kotlin's `List` is immutable, operations like `filter` create *new* lists. Modifying the new list does not change the original.

This repository contains two files:

- `bug.kt`: Demonstrates the unexpected behavior.
- `bugSolution.kt`: Shows how to correctly handle list modifications when needed.

Understanding the distinction between creating a new list versus modifying an existing one is crucial for writing correct and predictable Kotlin code.