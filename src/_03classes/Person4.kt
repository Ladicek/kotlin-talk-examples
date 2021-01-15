package _03classes

data class Person4(val name: String, val age: Int)

fun main() {
    val person = Person4("Ladicek", 38)
    println(person)

    val (name, age) = person
    println("$name: $age years")
}
