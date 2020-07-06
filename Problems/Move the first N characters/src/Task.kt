import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.next()
    val num = scanner.nextInt()
    val lengthStr = str.length
    if (lengthStr >= num) {
        val lineSegmentBefore = str.substring(0, num)
        val lineSegmentAfter = str.substring(num)
        print("$lineSegmentAfter$lineSegmentBefore")
    } else {
        print(str)
    }
}