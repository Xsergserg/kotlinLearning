package nullManagement

import Utils.printCollection

fun main() {
    val nullableInts = arrayOfNulls<Int?>(5);
    printCollection(nullableInts)

    val nullableString = listOf<String?>()
    printCollection(nullableString)


}