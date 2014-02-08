package _09delegation

import kotlin.properties.Delegates

class LazyString {
    val value: String by Delegates.lazy {
        println("heavy computation")
        "the string!"
    }
}

fun _main(args: Array<String>) {
    val lazy = LazyString()
    println(lazy.value)
    println(lazy.value)
}
