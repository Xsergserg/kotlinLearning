package features

import declaration.CarData
import utils.upperFirstAndLast

fun main() {
    println(multiply2(x = 3, y = 5, "3 * 5 = "))
    val car1 = CarData("red")
    val car2 = CarData("green")
    val car3 = CarData()
    printCarColors(car1, car2, car3, label = "Color")
    printCarColors("Color", car1)
}

fun printCarColors(label: String, vararg cars: CarData) {
    for (car in cars)
        println("$label: ${car.color?.upperFirstAndLast()}")
}

fun printCarColors(vararg cars: CarData, label: String) {
    printCarColors(label, *cars)
}

fun multiply (x: Int, y: Int): Int {
  return  x * y
}
fun multiply1 (x: Int, y: Int): Int = x * y

fun multiply2 (x: Int, y: Int, label: String = "The answer is: ") = "$label ${x * y}"