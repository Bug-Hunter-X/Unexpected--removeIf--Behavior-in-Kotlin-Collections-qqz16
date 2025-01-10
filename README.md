# Kotlin `removeIf` Gotcha: In-Place Modification

This example demonstrates a potential source of confusion when using the `removeIf` function on mutable collections in Kotlin.  The `removeIf` function modifies the collection *in-place*, meaning it directly alters the original collection rather than creating a new one.

The `bug.kt` file shows that this behavior can lead to unexpected results if you aren't aware that the original list or set is being directly modified.

The `bugSolution.kt` file doesn't provide a direct solution, as in-place modification is the intended behavior of `removeIf`. The goal is to highlight the behavior and improve awareness.

**Key takeaway:** When using `removeIf`, be mindful that you are modifying the original collection. If you need to preserve the original collection, create a copy first before calling `removeIf`.