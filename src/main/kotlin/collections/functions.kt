package collections

fun main() {
    val strings = listOf("spring", "summer", "fall", "winter", "summer")
    val colors = listOf("black", "white", "green", "black")

    println(strings.last())
    println(strings.reversed())

    if (strings.size > 5)
        println(strings[5])
    println(strings.getOrNull(5))

    var ints = listOf(1, 2, 3, 4, 5)
    println(ints.max())

    println(colors.zip(strings))


    val mergedList = colors + strings
    println(mergedList)
    val noDuplicates = colors.union(strings)
    println(noDuplicates)

    val colorsNoDups = colors.distinct()
    println(colorsNoDups)
}