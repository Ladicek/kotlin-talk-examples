package _11delegation

class MyData<T>(vararg values: T) : List<T> by listOf(*values)

fun main() {
    val data = MyData("a", "b", "c")
    data.map { it.toUpperCase() }.forEach { println(it) }
}
