package _02functions

fun p(message: String, prefix: String = "") {
    println("[$prefix] $message")
}

fun add(a: Int, b: Int) = a + b

fun main() {
    p("Hello, world!")
    p("Hello named args", prefix = "[INFO] ")

    println(add(1, 2))
}
