package inheritance

fun main() {
    val child = MyChild(25)
    println(child.number2)
}


//Interfaces are extendable by default
interface  MyInterface {

    val number: Int
    val number2: Int
        get() = number * 100
    fun myFunction(str: String): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(str: String): String
}

class MyChild(override val number: Int) : MySubInterface {
    override fun mySubFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

}