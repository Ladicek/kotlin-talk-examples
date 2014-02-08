package _09delegation

class MyList<T>(val list: List<T>)
    : List<T> by list

fun main(args: Array<String>) {
    val list = MyList<String>(listOf("a, b, c"))
    list.forEach { println(it) }
}
