package Declarations

class Employee (var name: String, val id: Int) {
	override fun equals (obj: Any?) : Boolean {
		if (obj is Employee) {
			return name == obj.name && id == obj.id
		}
		return false;
	}
}