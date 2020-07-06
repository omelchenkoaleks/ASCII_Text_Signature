import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()

    val arrayNum = IntArray(size)
    for (i in arrayNum.indices) {
        arrayNum[i] = scanner.nextInt()
    }

    val separator = scanner.nextInt() % size
    var tmp = 0

    repeat(separator) {
        tmp = arrayNum[arrayNum.lastIndex]
        for (i in arrayNum.size - 2 downTo 0) {
            arrayNum[i + 1] = arrayNum[i]
        }
        arrayNum[0] = tmp
    }

    for (n in arrayNum) {
        print("$n ")
    }
}