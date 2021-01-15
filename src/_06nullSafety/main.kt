package _06nullSafety

fun answer(): Int? {
    return 0b101010 // 0x2A
}

fun questionForAnswer(answer: Int) = "6 * 7 = $answer"

fun main() {
    val answer = answer()
    if (answer != null) {
        val question = questionForAnswer(answer)
        println("$answer -> $question")
    }

    val doubleAnswer = answer?.let { it * 2 }
    println(doubleAnswer)

    val question = answer ?: 42
    println(question)
}
