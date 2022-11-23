package features

import declaration.Employee

private class InnerClass  {

}

fun main() {
    val someObject = InnerClass()
    val change = 4.22
    val numerator = 10.99
    val denominator = 20.002
    val employee = Employee("John Doe", 1)
    val filePath = """c:\dir\dir2"""
    val filePath2 = "c:\\dir\\dir2"
    val fewLines = """One,
        two,
        three"""
    val fewLines2 = """One,
        |two,
        |three
    """.trimMargin()
    val fewLines3 = """One,
        *two,
        *three
    """.trimMargin("*")

    println(someObject)
    println(employee)
    println("With escaping \$change")
    println("Without escaping $change")
    println("Without escaping $$change")
    println("$numerator / $denominator = ${numerator / denominator}")
    println(numerator / denominator)
    println("Employee's id is ${employee.id}")
    println("Employee's id is (without curly brackets) $employee.id")
    println(fewLines)
    println(fewLines2)
    println(fewLines3)
}