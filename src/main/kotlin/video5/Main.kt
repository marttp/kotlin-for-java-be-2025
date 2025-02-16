package video5

import java.util.PriorityQueue

fun main() {
    arrayExample()
    println("=========")
    collectionExample()
}

data class Employee(val id: Int, val name: String)

internal fun arrayExample() {
    // Array - 1D
    // int[] intArray = new int[n];
    val n = 5
    val intArray1 = IntArray(n)
//    for (i in intArray1) {
//        println(i)
//    }
    // Object[] objArray = new Object[n];
    val objArray = Array<Employee?>(n) {
        null
    }
    objArray[2] = Employee(1, "Mart")
    for (emp in objArray) {
        println(emp)
    }

    // Array - 1D - Initial Value
    val intArray2 = IntArray(n) {
        Int.MIN_VALUE
    }
//    for (i in intArray2) {
//        println(i)
//    }

    // Array - 2D
    // int[][] intArray = new int[3][3];
    val table = Array<IntArray>(3) {
        IntArray(3)
    }
    table.printGrid()
    // Array - 2D - Initial Value
    val table1 = Array<IntArray>(3) {
        IntArray(3) {
            9
        }
    }
    table1.printGrid()
}

fun Array<IntArray>.printGrid() {
    for (r in this.indices) {
        for (c in this[r].indices) {
            print("${this[r][c]}")
        }
        println()
    }
}

internal fun collectionExample() {
    // Immutable
    println("===Immutable===")
    // Collections - ArrayList
    val immutableList = listOf(1, 3)
    // immutableList.add(2) // Cannot Add
    println(immutableList)
    // Collections - HashMap
    val immutableMap: Map<Int, Employee> = mapOf<Int, Employee>(
        1 to Employee(1, "Mart"),
        3 to Employee(3, "Mart3")
    )
    println(immutableMap)
    // Collections - HashSet
    val seen = setOf(1, 2, 3)
    println(seen)

    // Mutable
    println("===Mutable===")
    // Collections - ArrayList
    val mutableList = mutableListOf(1, 3)
    mutableList.add(2) // Can add
    println(mutableList)
    // Collections - HashMap
    // val mutableMap: HashMap<Int, Employee> = hashMapOf<Int, Employee>(
    val mutableMap: MutableMap<Int, Employee> = mutableMapOf<Int, Employee>(
        1 to Employee(1, "Mart"),
        3 to Employee(3, "Mart3")
    )
    mutableMap[2] = Employee(2, "Mart")
    println(mutableMap)
    // Collections - HashSet
    val seenMutable = mutableSetOf(1, 2, 3)
    seenMutable.add(5)
    println(seenMutable)

    // Collections - PriorityQueue
    val minHeap = PriorityQueue<Employee> {
        a, b -> a.id.compareTo(b.id)
    }
    minHeap.add(Employee(7, "7"))
    minHeap.add(Employee(5, "5"))
    minHeap.add(Employee(6, "6"))
    minHeap.add(Employee(1, "1"))

    while (minHeap.isNotEmpty()) {
        val nextEmp = minHeap.poll()
        println(nextEmp)
    }
}