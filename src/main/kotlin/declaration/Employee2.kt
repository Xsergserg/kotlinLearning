package declaration

class Employee2 (var firstName: String, fullTime: Boolean = true) {
	var fullTime = fullTime
		get() {
			println("Custom the fullTime getter")
			return field
		}
		set(value) {
			println("Custom the fullTime setter")
			field = value
		}
}