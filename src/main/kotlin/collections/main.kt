package collections

fun main() {
    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val notNullList = listOfNotNull("Hello", null, "goodbye");
    println(notNullList)

    var arrayList = arrayListOf(1, 2, 4)
    println(arrayList.javaClass)

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(5)
    println(mutableList.javaClass)

    val colors = arrayOf("black", "white", "green")
    val colorList = listOf(*colors)
    println(colorList)


}