import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val letter = input.next()
    for (i in 'a'..'z') {
        if (i.toString() == letter) {
            return
        }
        print(i)
    }
}