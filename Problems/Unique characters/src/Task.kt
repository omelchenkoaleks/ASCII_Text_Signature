fun main() {
    val str = readLine()
    var numberOfSingles = 0
    if (str != null) {
        for (i in str) {
            val a = str.substringAfter(i)
            val b = str.substringBefore(i)
            if (a.contains(i) || b.contains(i)) {
                continue
            } else {
                numberOfSingles++
            }
        }
    }
    print(numberOfSingles)
}