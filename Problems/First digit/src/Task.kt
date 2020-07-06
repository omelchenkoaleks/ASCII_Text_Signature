fun main() {
    val wordWithNum = readLine()
    if (wordWithNum != null) {
        for (n in wordWithNum) {
            if (n in '1'..'9') {
                print(n)
                return
            }
        }
    }
}