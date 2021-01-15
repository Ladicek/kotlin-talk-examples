package _03classes

class Person3(val name: String, val age: Int) {
    override fun toString() = "$name, $age"
}

fun main() {
    val person = Person3("Ladicek", 38)
    println(person)
}
