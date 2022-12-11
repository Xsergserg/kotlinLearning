package codewars.buddyPairs
import java.lang.Math.sqrt
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@OptIn(ExperimentalTime::class)
fun main () {
    val time = measureTimedValue {
        println(buddy(10, 50))
        println(buddy(1071625, 1103735))
        println(buddy(2382, 3679))
        println(buddy(381, 4318))
    }
    println("Time of executing ${time.duration.inWholeSeconds} seconds")
}

fun buddy(start: Long, limit: Long): String {
    for (n in start..limit) {
        var m = nDivisorsSum(n) - 1
        if (m > n && nDivisorsSum(m) - 1 == n) return "($n $m)"
    }
    return "Nothing"
}

fun nDivisorsSum(num: Long): Long {
    var divisorsSum = 0L
    for (i in 1 .. kotlin.math.sqrt(num.toDouble()).toLong()) {
        if (num % i == 0L) {
            divisorsSum += i
            if (num / i != i) {
                divisorsSum += num / i
            }
        }
    }
    return divisorsSum - num
}