package inheritance

//Data cass cant be extended or abstract
abstract class Printer(val modelName: String) {
    open fun printModel() = println("Printer model is $modelName")
    abstract fun bestSellingPrice(): Double;
}