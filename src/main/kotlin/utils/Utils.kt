package utils

fun Collection<*>.printCollection (label: String? = null) {
    this.toTypedArray().printArray(label)
}

fun Array<*>.printArray (label: String? = null) {
    printLabel(label)
    printAnyObjects(*this)
}

fun printLabel(label: String?) {
    if (!label.isNullOrEmpty()) {
        print("$label")
        if (!label.last().isWhitespace())
            print(' ');
    }
}

fun printAnyObjects(vararg objects: Any?) {
    objects.forEach { print("$it ") }
    println()
}

fun CharSequence.upperFirstAndLast(): CharSequence {
    if (isEmpty())
        return this
    return first().uppercaseChar() + substring(1, length - 1) + last().uppercaseChar()
}
