import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val numArray = IntArray(size)
    for (i in numArray.indices) {
        numArray[i] = scanner.nextInt()
    }

    var index = 0
    for ((i, value) in numArray.withIndex()) {
        if (value == numArray.max()) {
            index = i
            break
        }
    }

    print(index)
}