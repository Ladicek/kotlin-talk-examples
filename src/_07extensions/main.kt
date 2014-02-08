package _07extensions

fun String.pirateStyle()
        = "Arrr! ${this.capitalize()}"

fun main(args: Array<String>) {
    println("hello, world".pirateStyle())
}
