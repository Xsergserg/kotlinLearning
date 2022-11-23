package features

fun main() {
    val someList: Any = listOf(1,2,3)

    println("Some list: $someList is instance of List: ${someList is List<*>}")
    println("Some list: $someList is instance of Int: ${someList is Int}")
}
