package codewars.camelConvetrter

import java.util.*

fun main() {
    println(toCamelCase("the_stealth_warrior"))
    println(toCamelCase("The_stealth_warrior"))
}

fun toCamelCase(str:String):String =
    str.split('-', '_').mapIndexed { i, it -> if (i != 0) it.capitalize() else it }.joinToString("")
