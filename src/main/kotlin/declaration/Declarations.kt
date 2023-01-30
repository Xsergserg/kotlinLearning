package declaration

fun main() {
/*	val number1: Int
	val number2 = 25
	val number3: Short = 25

	val names = listOf("John", "Sergey")

	println("${names[0]} $names")

	val employee1 = Employee("Francisco d'Anconia", 1000)
	employee1.name = "John Galt"

	val employee2 = Employee("Francisco d'Anconia", 100)
	val employee3 = Employee("Francisco d'Anconia", 100)

	println (employee2 == employee3)
	println(employee2.equals(employee3))
	println(employee2 === employee3)*/

	val myCar = Car("Deep blue", "Bentyago", 2023)
	val someBodyCar = Car("Deep blue", "Bentyago", 2023)
	val carOtherColor = myCar.copy(color = "red")
	val myCar2 = Car("Black");
	println(myCar)
	println(carOtherColor)
	println("someBodyCar == myCar? ${someBodyCar == myCar}")
	println(myCar2)
}