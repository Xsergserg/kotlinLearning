import enums.Department.*
import inheritance.CompanyCommunication
import inheritance.CompanyCommunication as Comm
import inheritance.topLevel
import utils.upperFirstAndLast

fun main() {
    println(topLevel())
    println(Comm.getTagLine())
    println(HR.getDepartmentInfo())
    println("lowercase".upperFirstAndLast())

    //privateTopLevel() //error, private access modifier to top level function
    //CompanyCommunication.getCopyrightLine() //error, internal modifier in another package

}