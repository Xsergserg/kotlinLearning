package utils

fun printCollection (someCollection: Any) {
    if (someCollection is Collection<*>) {
        for (element in someCollection)
            print("$element ")
        println()
        return
    }
    println("Object is not list")
}