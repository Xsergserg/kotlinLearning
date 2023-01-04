package inheritance

class SpecialLaserPrinter(modelName: String): LaserPrinter(modelName) {
    //Override is no working because LaserPrinter.printModel() is final
    //override fun printModel() = println("Special model")
}