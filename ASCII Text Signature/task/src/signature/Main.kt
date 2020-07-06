package signature

fun main() {
    val name = readLine()
    val numberOfLetters = name?.length
    generateStars(numberOfLetters!!)
    println("* $name *")
    generateStars(numberOfLetters!!)
}

fun generateStars (quantity: Int) {
    var stars = "****"
    repeat(quantity) {
        stars += "*"
    }
    println(stars)
}