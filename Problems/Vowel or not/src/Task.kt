import java.util.Scanner

fun isVowel(ch: Char): Boolean {
    for (char in 'a'..'z') {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
    }
    return false
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter.toLowerCase()))
}