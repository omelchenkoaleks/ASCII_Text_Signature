import java.util.*

val letters = printAlphabet()
val scanner = Scanner(System.`in`)
//var uppercaseLetters = 0
//var lowercaseLetters = 0
var digits = 0
var symbols = 0
var tmp = ""

fun main() {
//    uppercaseLetters = scanner.nextInt()
//    lowercaseLetters = scanner.nextInt()
    digits = scanner.nextInt()
    symbols = scanner.nextInt()

    val randomString = (1..symbols)
            .map (letters::get)
            .toCharArray()


    print(randomString)
}

fun printAlphabet() = buildString {
    for (letter in 'a'..'z')
        append(letter)
}