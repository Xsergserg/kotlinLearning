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
    val setInts = setOf(10, 15, 19,5,4,3,-22)

    println(setInts.filter { it % 2 != 0 })
    println(immutableMap.filter { it.value.year == 2016 })

    val mutableMap = mutableMapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        17 to Car("red", "BMW", 2015),
        8 to Car("green", "Ford", 2010)
    )

    println(immutableMap.filter { it.value.color == "silver" })
    val ints = arrayOf(1,2,3,4,5)

    val add10List = ints.map { it + 10}
    println(add10List + add10List.javaClass)

    println(immutableMap.map { it.value.color })
    println(immutableMap.filter {it.value.model == "Ford"}.map {it.value.color})
    println(immutableMap.all { it.value.year != null && it.value.year!! > 2017 })
    println(immutableMap.any { it.value.year != null && it.value.year!! > 2015 })
    println(immutableMap.count { it.value.year != null && it.value.year!! > 2015 })
    println(immutableMap.toSortedMap())

    val cars = immutableMap.values
    println(cars.find{it.color == "red"})
    println(cars.groupBy { it.color })
    println(cars.sortedBy { it.year })
}