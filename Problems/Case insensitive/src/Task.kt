import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word1 = scanner.nextLine()
    val word2 = scanner.nextLine()

    print(word1.toUpperCase() == word2.toUpperCase())
}