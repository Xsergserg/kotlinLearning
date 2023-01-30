package lambdas

fun main () {
    //run { println ("I'm in a lambda") }
    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
    )
    println(employees.minBy (Employee::startYear))

    findByLastName(employees, "Smith")
    findByLastName(employees, "asd")

    "Some String".apply someStringBlock@ {
        "Another string".apply {
            println(uppercase())
            println(this@someStringBlock.uppercase())
        }
    }
}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@{
        if (it.lastName == lastName) {
            println("Employee with last name $lastName found")
            return@returnBlock
        }
    }
    println("Nobody with last name $lastName")
}

data class Employee (val firstName: String, val lastName: String, val startYear: Int ) {
}