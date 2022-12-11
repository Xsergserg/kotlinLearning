package codewars.twoSum

fun main() {
    val twoSum = TwoSum
    println (twoSum.twoSum(intArrayOf(1,2,3), 4))
}
object TwoSum {
    fun twoSum(numbers: IntArray, target: Int): Pair<Int,Int> {
        for (i in numbers.indices) {
            for (n in numbers.indices.drop(i + 1)) {
                if (numbers[i] + numbers[n] == target)
                    return Pair(i, n)
            }
        }
        return Pair(0, 0)
    }
}