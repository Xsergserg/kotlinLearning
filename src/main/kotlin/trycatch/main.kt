package trycatch

fun main() {
    val str = "22.0"

    println(getNumFromStr(str) ?: "Sheet happens, can't parse String")
    notImplementedYet("something")
}

fun getNumFromStr(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    }
}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me")
}