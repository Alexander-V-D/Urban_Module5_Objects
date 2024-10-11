fun main() {

    //Задача 1
    val strokeArray = arrayOf("123", "1234", "12345")
    var longestStroke = ""
    strokeArray.forEach { if (it.length > longestStroke.length) longestStroke = it }
    println(
        "Ответ к задаче 1:\n" +
                "Самая длинная строка: $longestStroke\n" +
                "Его длина: ${longestStroke.length}"
    )

    //Задача 2
    val matrix = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 6, 7, 8),
        arrayOf(9, 1, 2, 3),
        arrayOf(4, 5, 6, 7)
    )
    var sum = 0
    for (i in matrix.indices) {
        sum += matrix[i][matrix.size - i - 1]
    }
    println("Ответ к задаче 2: $sum")

    //Задача 3
    val printer1 = object : Printer("*") {
        override fun printStroke(stroke: String) {
            print("$strokeBeginning $stroke")
        }

        override fun printStrokeLn(stroke: String) {
            println("$strokeBeginning $stroke")
        }

        override fun printStrokeNTimes(stroke: String, n: Int) {
            repeat(n) {
                println("$strokeBeginning $stroke")
            }
        }
    }
    val printer2 = object : Printer("|", "----------") {
        override fun printStroke(stroke: String) {
            print("$strokeBeginning $stroke")
        }

        override fun printStrokeLn(stroke: String) {
            print("$strokeBeginning $stroke\n$emptyLine\n")
        }

        override fun printStrokeNTimes(stroke: String, n: Int) {
            repeat(n) {
                print("$strokeBeginning $stroke\n$emptyLine\n")
            }
        }
    }
    val printer3 = object : Printer(emptyLine = "**********") {
        override fun printStroke(stroke: String) {
            print(stroke)
        }

        override fun printStrokeLn(stroke: String) {
            print("$stroke\n$emptyLine\n")
        }

        override fun printStrokeNTimes(stroke: String, n: Int) {
            repeat(n) {
                print("$stroke\n$emptyLine\n")
            }
        }
    }
}

abstract class Printer(val strokeBeginning: String = "", val emptyLine: String = "\n") {
    abstract fun printStroke(stroke: String)
    abstract fun printStrokeLn(stroke: String)
    abstract fun printStrokeNTimes(stroke: String, n: Int)
}