package _05collections

import java.util.ArrayList

fun print(nums: Collection<Number>) {
    println(nums)
}
fun add(nums: MutableCollection<Int>) {
    nums.add(4)
}

fun main(args: Array<String>) {
    val a = listOf(1, 2, 3)
    print(a)

    val b = arrayListOf(1, 2, 3)
    add(b)
    print(b)
}
