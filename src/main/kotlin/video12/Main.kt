package video12

fun main() {
    // Functional Programming
    // f(x) => x + 10
    // Functional Interface & Lambda expression
    // Higher order functions
    example1()
    example2()
    example3()
    example4()
    example5()
}

// Iteration => Basic FP
fun example1() {
    val nums = listOf(1, 2, 3, 4, 5)
    // Iteration
    var sum1 = 0
    for (n in nums) {
        if (n % 2 != 0) {
            sum1 += n * n
        }
    }
    println(sum1)
    // Functional Programming
    // Map => Process Input => Produce Output
    // Filter => Selected element based on condition
    val sum2 = nums
        .filter { it % 2 != 0 }
        .map { n -> n * n }
        .sum()
    println(sum2)
}

fun example2() {
    val salaryThreshold = 30_000
    val employees = listOf(
        Employee("A", 25_000),
        Employee("B", 28_000),
        Employee("C", 27_000),
        Employee("D", 29_000),
        Employee("E", 26_000),
    )
    // Raise salary 10%
    // Pick who has salary >= threshold
    val result = employees
        .map { it.copy(salary = (it.salary.toDouble() * 1.1).toInt()) }
        .filter { it.salary >= salaryThreshold }
    println(result)
}

fun example3() {

    fun register(names: List<String>, transformPosition: (Employee) -> Employee): List<Employee> {
        return names
            .map { Employee(it, 0) }
            .map { transformPosition(it) }
    }

    val candidates = listOf("Mart", "Mary", "Leon", "Harry", "James")
    // Candidates to Employee
    // Each employee => Transform depending on arg function
    val result = register(candidates) { e -> e.copy(position = Position.MANAGER) }
    println(result)
}

fun interface TransformPosition {
    fun transform(employee: Employee): Employee
}

fun example4() {

    fun register(names: List<String>, transformPosition: TransformPosition): List<Employee> {
        return names
            .map { Employee(it, 0) }
            .map { transformPosition.transform(it) }
    }
    val candidates = listOf("Mart", "Mary", "Leon", "Harry", "James")
    // Candidates to Employee
    // Each employee => Transform depending on arg function
    val result1 = register(candidates) { e -> e.copy(position = Position.MANAGER) }
    println(result1)
    val developerTransform = TransformPosition { e -> e.copy(position = Position.DEVELOPER) }
    val result2 = register(candidates, developerTransform)
    println(result2)
}

fun example5() {
    val candidates = listOf("Mart", "Mary", "Leon", "Harry", "James")
    val groupCandidate = candidates
        .groupBy { it.first() }
    println(groupCandidate)
}