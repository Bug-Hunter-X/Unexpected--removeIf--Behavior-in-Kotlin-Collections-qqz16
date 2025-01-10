fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.toMutableList() // Create a copy to avoid modifying the original
    newList.removeIf { it > 2 }
    println(list) // Output: [1, 2, 3, 4, 5] (original list unchanged)
    println(newList) // Output: [1, 2] 

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.toMutableSet() // Create a copy to avoid modifying the original
    newSet.removeIf { it > 2 }
    println(set) // Output: [1, 2, 3, 4, 5] (original set unchanged)
    println(newSet) // Output: [1, 2]
} 