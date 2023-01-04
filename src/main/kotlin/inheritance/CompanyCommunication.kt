package inheritance

import java.time.Year

fun main() {
    println(CompanyCommunication.getTagLine())
    println(CompanyCommunication.getCopyrightLine())

    SomeClass.accessPrivateVar()

    val tmp = SomeClass.upperOrLowerCase("Hello", false)
    println(tmp.str)

    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(str: String): String {
            return str + str + str
        }
    })
}
object CompanyCommunication {
    private val currentYear = Year.now().value
    fun getTagLine() = "Our company rocks!"
    internal fun getCopyrightLine() = "Copyright \u00A9 $currentYear"
}

class SomeClass private constructor(val str: String) {
    companion object SomeCompanion {
        private var privateVar = 6;
        fun accessPrivateVar() = println("Var: $privateVar")
        fun upperOrLowerCase(str: String, lowerCase: Boolean) : SomeClass {
            return if (lowerCase) {
                SomeClass(str.lowercase())
            } else {
                SomeClass(str.uppercase())
            }
        }
    }
}

interface SomeInterface {
    fun mustImplement(str: String): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing mustImplement: ${si.mustImplement("Hi")}")
}

fun topLevel() = "I'm top level function"

private fun privateTopLevel() = "I'm private top level";