package collections

import declaration.Car

fun main() {
    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        17 to Car("red", "BMW", 2015),
        8 to Car("green", "Ford", 2010)
    )

    println( immutableMap.asSequence().filter { it.value.model == "Ford" }.map { it.value.color }.toList())

    listOf("Joe", "Mary", "Jane").asSequence()
        .filter {println("filtering $it"); it[0] == 'J'}
        .map {println("mapping $it"); it.uppercase()}
        .toList()
}

