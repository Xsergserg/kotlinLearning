package conditions

fun main() {
    var num: Int

    if (true) {
        num = 50
    } else {
        num = 592
    }

    val num2 = if (true) 50 else 23

    val num3 = if (true) {
        println("something")
        50
    } else {
        println("something else")
        23
    }

    println ("The value is ${if (true) {
        println("something")
        50
    } else {
        println("something else")
        23
    }}")
}