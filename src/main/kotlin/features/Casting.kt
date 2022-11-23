package features

import Declarations.Employee

fun main() {
    val employee1 = Employee("John Galt", 1000)
    val employee2 = Employee("Francisco d'Anconia", 100)

    val john: Any = employee1
    val francisco: Any = employee2

    val john2 = john as Employee
    println(john2.name)

    if (francisco is Employee) {
        //val francisco2 = francisco
        //println(francisco2.name)
        println(francisco.name)
    }
}
