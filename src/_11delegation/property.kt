package _11delegation

class LazyString(value: String) {
    val value: String by lazy {
        println("heavy computation")
        value.toUpperCase()
    }
}

fun main() {
    val lazy = LazyString("hello")
    println(lazy.value)
    println(lazy.value)
}
