package declaration

data class CarData(var color: String? = null, var model: String? = null, var year: Int? = null) {

    override fun toString(): String {
        return """Color: ${color?:"undefined"}
            |Model: ${model?:"undefined"}
            |year: ${year?:"undefined"}
        """.trimMargin()
    }
}