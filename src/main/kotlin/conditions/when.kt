package conditions

enum class Seasons {
    SPRING, SUMMER, FALL, WINTER
}
fun main() {

    val timeOfTheYear = Seasons.FALL
    println(
        when (timeOfTheYear) {
            Seasons.FALL -> "It's gtting cooler"
            else -> "Just FALL defined"
        }
    )


    var num = 300
    when {
        num in 100 until 200 -> println("100..199")
        num in 200 until 300 -> println("200..299")
        num >= 300-> println("more or equal than 300")
        else -> println("Doesn't match anything")
    }
    num -= 100
    when (num) {
        in 100 until 200 -> println("100..199")
        in 200 until 300 -> println("200..299")
        else -> println("Doesn't match anything")
    }

    val difObjectsList = listOf("12", 12, 12.0, 12L)

    difObjectsList.forEach {
        when (it) {
            is String -> println("String")
            is Int -> println("Int")
            is Double -> println("Double")
            else -> println("Undefined type")
        }
    }
}