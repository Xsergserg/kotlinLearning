package nullManagement

fun main() {
    //val str: String = null impossible
    val str: String? = "This in not null"
    val nullStr: String? = null

    if (str != null)
        str.uppercase();
    println("Uppercase: " + str?.uppercase())
    println("Null uppercase: ${nullStr?.uppercase()}")

    val someVal: String? = nullStr?.uppercase()?.lowercase()?.replace('a', 'b')
    val notNullStr:String = nullStr ?: "Default value"

    val someArr: Any = arrayOf(1, 2, 3, 4)
    val str3 = someArr as? String

    println(str3)

    val str4 = notNullGenerator()!!.uppercase()
    val str5 = nullGenerator()!!.uppercase()

    //uselessFunction(notNullGenerator()) impossible put String? as argument of type String

    if (str4 != null) {
        uselessFunction(str4)
    }

    str4?.let { uselessFunction(it) }



}

fun notNullGenerator(): String? {
    return "absolutely not null"
}

fun nullGenerator(): String? {
    return null
}

fun uselessFunction(test: String) {}