package loops

fun main() {
    val range = 1..5

    // val backwardRange = 5..1 //doesn't worrk, cause 5 <= x <= 1

    val backwardRange = 5.downTo(1).step(2)
    for (i in backwardRange)
        println(i)

    for (num in 5 until 20 step 5)
        println(num)

    val seasons = arrayOf("spring", "summer","fall", "winter")

    for (season in seasons)
        println(season)

    for (i in seasons.indices)
        println("${seasons[i]} has an index $i")

    seasons.forEachIndexed { i, season ->  println("${seasons[i]} has an index $i") }

    iloop@ for (i in 1..5) {
        for (n in 1..5) {
            println("$i $n")
            if (n == 3)
                break@iloop
        }
    }

}