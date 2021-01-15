package _07collections

fun p(nums: Collection<Number>) {
    println(nums)
}

fun add(nums: MutableCollection<Int>) {
    nums.add(4)
}

fun main() {
    val a = listOf(1, 2, 3)
    p(a)

    val b = arrayListOf(1, 2, 3)
    add(b)
    for (i in 0..3) {
        println(b[i])
    }

    val c = mapOf("1" to 1, "2" to 2, "3" to 3)
    println(c)
    println(c["2"])
}
