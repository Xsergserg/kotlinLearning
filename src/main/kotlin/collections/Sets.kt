package collections

fun main() {
    val setInts = setOf(10, 15, 19,5,4,3,-22)
    println(setInts)
    println(setInts.plus(20))
    println(setInts.plus(10))
    println(setInts.minus(19))
    println(setInts.minus(-1))
    println(setInts.average())
    println(setInts.drop(3))


    val mutableSet = mutableSetOf(1,2,3,4,5)

    mutableSet.plus(10);
    println(mutableSet)
}