package Utils

fun printArray (someList: Any) {
    if (someList is Array<*>) {
        for (element in someList)
            print("$element ")
        println()
    }
    else {
        println("Object is not list")
    }
}