package lambdas

fun main() {
    println(countTo100())
}

/*  Java style:
    fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()*/

//  Kotlin Style:
fun countTo100() = with(StringBuilder()) {
    for (i in 1..99)
        append("$i, ")
    append(100)
    toString()
}

fun countTo100var2() = StringBuilder().apply {
    for (i in 1..99)
        append("$i, ")
    append(100)
    toString()
}