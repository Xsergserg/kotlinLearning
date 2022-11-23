package features

fun main() {
    val x = 0x01010101
    val y = 0x10101010

    println ("$x | $y = ${x or y}")
    println ("$x & $y = ${x and y}")
}