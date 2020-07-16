package signature

val four = listOf("a", "b", "c", "d", "e", "f", "g", "h", "k", "l", "m", "n", "o", "p", "q", "r", "s", "u", "v", "x", "z", " ")
val five = listOf("w", "y")

val letters = mapOf(
        ("a" to listOf("____", "|__|", "|  |")),
        ("b" to listOf("___ ", "|__]", "|__]")),
        ("c" to listOf("____", "|   ", "|___")),
        ("d" to listOf("___ ", "|  \\", "|__/")),
        ("e" to listOf("____", "|___", "|___")),
        ("f" to listOf("____", "|___", "|   ")),
        ("g" to listOf("____", "| __", "|__]")),
        ("h" to listOf("_  _", "|__|", "|  |")),
        ("i" to listOf("_", "|", "|")),
        ("j" to listOf(" _", " |", "_|")),
        ("k" to listOf("_  _", "|_/ ", "| \\_")),
        ("l" to listOf("_   ", "|   ", "|___")),
        ("m" to listOf("_  _", "|\\/|", "|  |")),
        ("n" to listOf("_  _", "|\\ |", "| \\|")),
        ("o" to listOf("____", "|  |", "|__|")),
        ("p" to listOf("___ ", "|__]", "|   ")),
        ("q" to listOf("____", "|  |", "|_\\|")),
        ("r" to listOf("____", "|__/", "|  \\")),
        ("s" to listOf("____", "[__ ", "___]")),
        ("t" to listOf("___", " | ", " | ")),
        ("u" to listOf("_  _", "|  |", "|__|")),
        ("v" to listOf("_  _", "|  |", " \\/ ")),
        ("w" to listOf("_ _ _", "| | |", "|_|_|")),
        ("x" to listOf("_  _", " \\/ ", "_/\\_")),
        ("y" to listOf("_   _", " \\_/ ", "  |  ")),
        ("z" to listOf("___ ", "  / ", " /__")),
        (" " to listOf("    ", "    ", "    "))
)

var charLength = 0
var name = ""
var status = ""
var charNameTop = mutableListOf<Char>()
var charNameCenter = mutableListOf<Char>()
var charNameDown = mutableListOf<Char>()
var allLengthStr = 0

fun main() {
    println("Enter name and surname:")
    name = readLine().toString().trim()
    println("Enter person's status:")
    status = readLine().toString().trim()

    for (i in name.indices) {
        val l = name[i].toString().toLowerCase()
        charLength += characterCount(l)
    }

    val charQuantityInName = charLength + name.length - 1
    allLengthStr = charQuantityInName + 4

    if (charQuantityInName > status.length) {

        generateStars(charQuantityInName)

        print("*  ")
        for (i in name.indices) {
            val l = name[i].toString().toLowerCase()
            print("${letters[l]?.get(0)} ")
        }
        print(" *")
        println()
        print("*  ")
        for (j in name.indices) {
            val l = name[j].toString().toLowerCase()
            print("${letters[l]?.get(1)} ")
        }
        print(" *")
        println()
        print("*  ")
        for (k in name.indices) {
            val l = name[k].toString().toLowerCase()
            print("${letters[l]?.get(2)} ")
        }
        print(" *")
        println()

        formatOnCenterStatus(allLengthStr)

        generateStars(charQuantityInName)

    } else {

        generateStars(status.length)

        formatOnCenterName(allLengthStr)

        print("*  $status  *")

        println()

        generateStars(status.length)
    }
}

fun generateStars(quantity: Int) {
    var stars = "******"
    repeat(quantity) {
        stars += "*"
    }
    println(stars)
}

fun characterCount(str: String): Int {
    var counter = 0
    when (str) {
        "i" -> counter = 1
        "j" -> counter = 2
        "t" -> counter = 3
        in four -> counter = 4
        in five -> counter = 5
    }
    return counter
}

fun findCenterStr(quantity: Int): Int {
    return if (quantity % 2 == 0) {
        quantity / 2
    } else {
        (quantity - 1) / 2
    }
}

fun formatOnCenterStatus(quantity: Int) {
    val centerStrName = findCenterStr(quantity)
    val centerStrStatus = findCenterStr(status.length)
    val point = centerStrName - 2

    if (allLengthStr % 2 == 0 && status.length % 2 != 0) {
        var count = 0
        print("*  ")
        for (i in 0..point - 2 - centerStrStatus) {
            print(" ")
            count++
        }
        for (j in status) {
            print(j)
        }
        for (k in 0..count + 1) {
            print(" ")
        }
        print(" *")
        println()
    } else if (allLengthStr % 2 == 0 && status.length % 2 == 0) {
        var count = 0
        print("*  ")
        for (i in 0..point - 1 - centerStrStatus) {
            print(" ")
            count++
        }
        for (j in status) {
            print(j)
        }
        for (k in 0 until count + 1) {
            print(" ")
        }
        print(" *")
        println()
    } else if (allLengthStr % 2 != 0 && status.length % 2 == 0) {
        var count = 0
        print("*  ")
        for (i in 0..point - 1 - centerStrStatus) {
            print(" ")
            count++
        }
        for (j in status) {
            print(j)
        }
        for (k in 0..count + 1) {
            print(" ")
        }
        print(" *")
        println()
    } else if (allLengthStr % 2 != 0 && status.length % 2 != 0) {
        var count = 0
        print("*  ")
        for (i in 0..point - 1 - centerStrStatus) {
            print(" ")
            count++
        }
        for (j in status) {
            print(j)
        }
        for (k in 0..count) {
            print(" ")
        }
        print(" *")
        println()
    }
}

fun formatOnCenterName(quantity: Int) {
    val centerStrStatus = findCenterStr(status.length)
    val centerStrName = findCenterStr(quantity)
    val point = (centerStrStatus + 4) - 2

    if (allLengthStr % 2 == 0 && status.length % 2 != 0) {
        var count = 0
        print("* ")
        for (i in 0..point - centerStrName) {
            print(" ")
            count++
        }
        for (j in name.indices) {
            charNameTop.add(name[j])
        }
        for (k in charNameTop.indices) {
            val l = name[k].toString().toLowerCase()
            print("${letters[l]?.get(0)} ")
        }
        for (l in 0..count) {
            print(" ")
        }
        print("*")
        println()

        count = 0
        print("* ")
        for (i2 in 0..point - centerStrName) {
            print(" ")
            count++
        }
        for (j2 in name.indices) {
            charNameCenter.add(name[j2])
        }
        for (k2 in charNameCenter.indices) {
            val l = name[k2].toString().toLowerCase()
            print("${letters[l]?.get(1)} ")
        }
        for (l2 in 0..count) {
            print(" ")
        }
        print("*")
        println()

        count = 0
        print("* ")
        for (i3 in 0..point - centerStrName) {
            print(" ")
            count++
        }
        for (j3 in name.indices) {
            charNameDown.add(name[j3])
        }
        for (k3 in charNameDown.indices) {
            val l = name[k3].toString().toLowerCase()
            print("${letters[l]?.get(2)} ")
        }
        for (l3 in 0..count) {
            print(" ")
        }
        print("*")
        println()
    } else if (allLengthStr % 2 == 0 && status.length % 2 == 0) {
        var count = 0
        print("* ")
        for (i in 0..point - centerStrName) {
            print(" ")
            count++
        }
        for (j in name.indices) {
            charNameTop.add(name[j])
        }
        for (k in charNameTop.indices) {
            val l = name[k].toString().toLowerCase()
            print("${letters[l]?.get(0)} ")
        }
        for (l in 0 until count) {
            print(" ")
        }
        print("*")
        println()

        count = 0
        print("* ")
        for (i2 in 0..point - centerStrName) {
            print(" ")
            count++
        }
        for (j2 in name.indices) {
            charNameCenter.add(name[j2])
        }
        for (k2 in charNameCenter.indices) {
            val l = name[k2].toString().toLowerCase()
            print("${letters[l]?.get(1)} ")
        }
        for (l2 in 0 until count) {
            print(" ")
        }
        print("*")
        println()

        count = 0
        print("* ")
        for (i3 in 0..point - centerStrName) {
            print(" ")
            count++
        }
        for (j3 in name.indices) {
            charNameDown.add(name[j3])
        }
        for (k3 in charNameDown.indices) {
            val l = name[k3].toString().toLowerCase()
            print("${letters[l]?.get(2)} ")
        }
        for (l3 in 0 until count) {
            print(" ")
        }
        print("*")
        println()
    } else if (allLengthStr % 2 != 0 && status.length % 2 == 0) {
        var count = 0
        print("* ")
        for (i in 0..point - 1 - centerStrName) {
            print(" ")
            count++
        }
        for (j in name.indices) {
            charNameTop.add(name[j])
        }
        for (k in charNameTop.indices) {
            val l = name[k].toString().toLowerCase()
            print("${letters[l]?.get(0)} ")
        }
        for (l in 0..count) {
            print(" ")
        }
        print("*")
        println()

        count = 0
        print("* ")
        for (i2 in 0..point - 1 - centerStrName) {
            print(" ")
            count++
        }
        for (j2 in name.indices) {
            charNameCenter.add(name[j2])
        }
        for (k2 in charNameCenter.indices) {
            val l = name[k2].toString().toLowerCase()
            print("${letters[l]?.get(1)} ")
        }
        for (l2 in 0..count) {
            print(" ")
        }
        print("*")
        println()

        count = 0
        print("* ")
        for (i3 in 0..point - 1 - centerStrName) {
            print(" ")
            count++
        }
        for (j3 in name.indices) {
            charNameDown.add(name[j3])
        }
        for (k3 in charNameDown.indices) {
            val l = name[k3].toString().toLowerCase()
            print("${letters[l]?.get(2)} ")
        }
        for (l3 in 0..count) {
            print(" ")
        }
        print("*")
        println()
    } else if (allLengthStr % 2 != 0 && status.length % 2 != 0) {
        var count = 0
        print("* ")
        for (i in 0..point - centerStrName) {
            print(" ")
            count++
        }
        for (j in name.indices) {
            charNameTop.add(name[j])
        }
        for (k in charNameTop.indices) {
            val l = name[k].toString().toLowerCase()
            print("${letters[l]?.get(0)} ")
        }
        for (l in 0 until count) {
            print(" ")
        }
        print("*")
        println()

        count = 0
        print("* ")
        for (i2 in 0..point - centerStrName) {
            print(" ")
            count++
        }
        for (j2 in name.indices) {
            charNameCenter.add(name[j2])
        }
        for (k2 in charNameCenter.indices) {
            val l = name[k2].toString().toLowerCase()
            print("${letters[l]?.get(1)} ")
        }
        for (l2 in 0 until count) {
            print(" ")
        }
        print("*")
        println()

        count = 0
        print("* ")
        for (i3 in 0..point - centerStrName) {
            print(" ")
            count++
        }
        for (j3 in name.indices) {
            charNameDown.add(name[j3])
        }
        for (k3 in charNameDown.indices) {
            val l = name[k3].toString().toLowerCase()
            print("${letters[l]?.get(2)} ")
        }
        for (l3 in 0 until count) {
            print(" ")
        }
        print("*")
        println()
    }
}