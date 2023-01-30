package maps

import declaration.Car

fun main() {
    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = mutableMapOf(
        "Jane's car" to Car("green", "Toyota", 2015),
        "John's car" to Car("red", "Ford", 2016)
    )
    println(mutableMap.javaClass)
    println(mutableMap)

    //    mutableMap.put("Mary's car", Car("red", "Corvette", 1965))
    mutableMap["Mary's car"] = Car("red", "Corvette", 1965)

    val pair = Pair(10, "ten")
    val (firstVal, secondVal) = pair;

    for (entry in mutableMap)
        println("${entry.key}: ${entry.value.model}")

    for ((key, value) in mutableMap)
        println("$key: ${value.model}")

    val car = Car("blue", "Lamborghini", 2023)
    val (color, model, year) = car
    println("$color, $model, $year")
}