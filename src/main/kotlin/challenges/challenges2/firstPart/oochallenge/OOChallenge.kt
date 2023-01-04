package challenges.challenges2.firstPart.oochallenge

open class Bicycle(
    var cadence: Int,
    var speed: Int,
    var gear: Int
) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }
}

class MountainBike(
    var seatHeight: Int,
    cadence: Int,
    speed: Int,
    gear: Int
) : Bicycle(cadence, speed, gear)

class RoadBike(
    cadence: Int,
    speed: Int,
    gear: Int,
    val tireWidth: Int,
) : Bicycle(cadence, speed, gear)




