package challenges.challengesRoundTwo.secondPart.oochallenge

import utils.printCollection

fun main() {
    val bicycle = KotlinBicycle(10, 3)
    bicycle.printDescription()

    val mountainBicycle = KotlinMountainBike(15, 10, 3)
    mountainBicycle.printDescription()

    val roadBicycle = KotlinRoadBike(15, 10, 3, 10)
    roadBicycle.printDescription()

    val mountainBicycle2 = KotlinMountainBike("Yellow", 15, 10, 3)
    mountainBicycle2.printDescription()

    KotlinMountainBike.availableColors.printCollection("Available colors:")
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }
    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println(
            "Bike is in gear $gear with a cadence of $cadence " +
                    "travelling at a speed of $speed."
        )
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) :
    KotlinBicycle(cadence, speed, gear) {
    constructor( color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 20) : this(seatHeight, cadence, speed, gear) {
        println("Bike color: $color")
    }
    companion object {
        val availableColors = listOf("blue", "red", "black", "green", "brown")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10) :
    KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}


