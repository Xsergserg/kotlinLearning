package accessModifiers

//class is public by default
//classes and file names are not connects
//internal is able for module


fun main() {
    val emp = Employee("John")
    val emp2 = Employee2("John")
    val emp3 = Employee2("John")
    val emp4 = Employee4("John")
    val emp5 = Employee5("John")

    print(emp.firstName)
    print(emp2.firstName)
    print(emp3.firstName)
    print(emp4.fullTime)
    print(emp5.fullTime)

}

//private is usable for any structures in file
class Employee (val firstName: String) {
}
class Employee2 constructor(firstName: String) {
    val firstName: String = firstName
}
class Employee3 constructor(firstName: String) {
    private val firstName: String
    init {
        this.firstName = firstName
    }
}

class Employee4 (val firstName: String) {

    var fullTime: Boolean = true
    constructor(firstName: String, fullTime: Boolean): this(firstName) {
        this.fullTime = fullTime
    }
}

class Employee5 (val firstName: String, var fullTime: Boolean = true) {
}