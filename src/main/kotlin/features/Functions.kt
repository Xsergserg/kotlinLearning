package features

import declaration.Car
import utils.upperFirstAndLast

fun main() {
    println(multiply2(x = 3, y = 5, "3 * 5 = "))
    val car1 = Car("red")
    val car2 = Car("green")
    val car3 = Car()
    printCarColors(car1, car2, car3, label = "Color")
    printCarColors("Color", car1)
}

fun printCarColors(label: String, vararg cars: Car) {
    for (car in cars)
        println("$label: ${car.color?.upperFirstAndLast()}")
}

fun printCarColors(vararg cars: Car, label: String) {
    printCarColors(label, *cars)
}

fun multiply (x: Int, y: Int): Int {
  return  x * y
}
fun multiply1 (x: Int, y: Int): Int = x * y

fun multiply2 (x: Int, y: Int, label: String = "The answer is: ") = "$label ${x * y}"