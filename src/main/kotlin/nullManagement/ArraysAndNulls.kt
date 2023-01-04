package nullManagement

import utils.printArray
import utils.printCollection

fun main() {
    val nullableInts = arrayOfNulls<Int?>(5);
    nullableInts.printArray()

    val nullableString = listOf<String?>()
    nullableString.printCollection()
}