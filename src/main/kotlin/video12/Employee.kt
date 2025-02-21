package video12

data class Employee(
    val name: String,
    val salary: Int,
    val position: Position = Position.STAFF
)
