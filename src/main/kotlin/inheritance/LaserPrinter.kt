package inheritance

open class LaserPrinter(modelName: String): Printer(modelName) {
    final override fun printModel() = println("Laser printer model is $modelName")
    override fun bestSellingPrice(): Double = 129.99
}