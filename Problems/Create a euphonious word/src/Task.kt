import java.util.*

val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
var vowelsCounter = 0
var consonantsCounter = 0
var discordant = 0

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.nextLine()

    for (i in 0..word.length - 3) {
        if (vowels.contains(word[i])) {
            vowelsCounter++
        } else {
            consonantsCounter++
        }
        if (vowels.contains(word[i + 1])) {
            vowelsCounter++
        } else {
            consonantsCounter++
        }
        if (vowels.contains(word[i + 2])) {
            vowelsCounter++
        } else {
            consonantsCounter++
        }

        if (vowelsCounter == 3 || consonantsCounter == 3) {
            discordant++
            continue
        }

        vowelsCounter = 0
        consonantsCounter = 0
    }

    print(discordant)
}