package enums

fun main() {
    println(Department.HR.getDepartmentInfo())
}
enum class Department (private val fullName: String, private val numEmployees: Int) {
    HR("Human resources", 5),
    IT("Information technology", 10),
    ACCOUNTING("Acconting", 3),
    SALES("Sales", 20);

    fun getDepartmentInfo() = "The $fullName department has $numEmployees emplooyees"
}