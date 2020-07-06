import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    val lengthString = str.length
    if (lengthString % 2 == 0) {
        val pointForDelete = lengthString / 2
        val beforePoint = str.substring(0, pointForDelete - 1)
        val afterPoint = str.substring(pointForDelete)
        print("$beforePoint$afterPoint")
    } else {
        val pointForDelete = lengthString / 2 + 1
        val beforePoint = str.substring(0, pointForDelete - 1)
        val afterPoint = str.substring(pointForDelete)
        print("$beforePoint$afterPoint")
    }
}