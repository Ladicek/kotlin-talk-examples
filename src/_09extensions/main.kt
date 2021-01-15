package _09extensions

fun String.pirateStyle() = "Arrr! ${this.capitalize()}"

fun main() {
    println("hello, world".pirateStyle())
}
