package declaration

import javacode.DummyClass

fun main() {
    var myInt  = 10 //Int - default for numbers
    val myLong = 10L //L suffix for long
    //val anotherLong: Long = myInt //Hidden convert int to long or long to int doesn't work
    val myByte:Byte = 111

    myInt = myLong.toInt()
    var myShort:Short = myByte.toShort()
    val myDouble = 65.984
    println("myDouble is double: $myDouble")
    val myFloat = 65.984f
    println("myFloat is float: $myFloat")

    var myChar = 'b'
    myChar = 65.toChar()
    println("65 char is '$myChar'")

    val myBoolean = true


    println(DummyClass.trueOrFalsePrimitive(myBoolean))
    println(DummyClass.trueOrFalseWrap(myBoolean))
}