package declaration

import utils.printCollection
import javacode.DummyClass

fun main() {
    val names = arrayOf("John", "Sergey", "pam")
    val longs = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)
    val fakeLongs3 = arrayOf(1, 2, 4)

    println(longs[2])

    val evenNumbers = Array(16) { i -> i * 2 }
    for (number in evenNumbers)
        print("$number ")

    val lotsOfNumbers = Array(10000) { i -> i + 1 }
    val zeroArray = Array(100) { 0 }

    var intArray = arrayOf(1, 2, 3, 4)
    printCollection(intArray)

    intArray = Array(6) { i -> (i + 1) * 10 }
    printCollection(intArray)

    val mixedArray = arrayOf("John", 15, Employee("John Doe", 100))
    printCollection(mixedArray)

    DummyClass.printNumbers(intArray.toIntArray())
    DummyClass.printIntegers(intArray.toMutableList())

    //var otherArray = Array<Int>(5) Can't make array of 5 values without inizialization
    val otherArray = IntArray(5) // Primitive int array. Can make array of 5 values without inizialization
    val convertIntArray = otherArray.toTypedArray()
}