package _10lambdas

val String.numberOfUpperCaseChars: Int
    get() = this.filter { it.isUpperCase() }.length

class Compute<T>(val compute: () -> T) {
    fun get(): T = compute()
}

fun main() {
    println("HelLo, WorLd!".numberOfUpperCaseChars)

    val nums = arrayListOf(1, 2, 3, 4, 5, 6, 7)
            .filter { it % 2 == 0 }
            .flatMap { listOf(it, it * 2, it * 3) }
            .takeWhile { it < 10 }
    println(nums)

    val c = Compute {
        println("computing")
        "foo"
    }
    println(c.get())
    println(c.get())
}
