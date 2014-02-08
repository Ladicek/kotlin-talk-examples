package _04nullSafety

fun answer(): Int? {
    return 0b101010 // 0x2A
}

fun question(answer: Int) = "6 * 7 = $answer"

fun main(args: Array<String>) {
    val answer = answer()
    if (answer != null) {
        val question = question(answer)
        println("$answer -> $question")
    }

    answer?.times { println("Hi!") }

    val doubleAnswer = answer?.let { it * 2 }
    println(doubleAnswer)

    val question = answer ?: 42
    println(question)
}
