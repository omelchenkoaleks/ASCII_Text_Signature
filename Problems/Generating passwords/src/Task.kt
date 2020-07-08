import java.util.*

val scanner = Scanner(System.`in`)
var uppercaseLetters = 0
var lowercaseLetters = 0
var digits = 0
var symbols = 0
var iterator = 0
val randomString = mutableListOf<Char>()

fun main() {
    uppercaseLetters = scanner.nextInt()
    lowercaseLetters = scanner.nextInt()
    digits = scanner.nextInt()
    symbols = scanner.nextInt()

    val allSymbolsFromUser = uppercaseLetters + lowercaseLetters + digits

    if (allSymbolsFromUser <= symbols) {

        repeat(uppercaseLetters) {
            randomString.add(('A'..'Z').random())
        }

        repeat(lowercaseLetters) {
            randomString.add(('a'..'z').random())
        }

        repeat(digits) {
            randomString.add(('0'..'9').random())
        }

        repeat(symbols - allSymbolsFromUser) {
            randomString.add(('A'..'Z').random())
        }
    }

    for (i in 0..randomString.size - 2) {
        if (randomString[i] == randomString[i + 1]) {
            when (randomString[i]) {
                in 'a'..'z' -> randomString[i] = ('a'..'z').random()
                in 'A'..'Z' -> randomString[i] = ('A'..'Z').random()
                in '0'..'9' -> randomString[i] = ('0'..'9').random()
            }
        }
    }

    for (i in 0..randomString.size - 2) {
        if (randomString[i] == randomString[i + 1]) {
            when (randomString[i]) {
                in 'a'..'z' -> randomString[i] = ('a'..'z').random()
                in 'A'..'Z' -> randomString[i] = ('A'..'Z').random()
                in '0'..'9' -> randomString[i] = ('0'..'9').random()
            }
        }
    }

    for (ch in randomString) {
        print("$ch")
    }
}