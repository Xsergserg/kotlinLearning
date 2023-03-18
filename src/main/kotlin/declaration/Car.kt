package declaration

data class Car(var color: String? = null, var model: String? = null, var year: Int? = null) {
    override fun toString(): String {
        return "color: ${color?:"undefined"}, model: ${model?:"undefined"}, year: ${year?:"undefined"}"
    }
}