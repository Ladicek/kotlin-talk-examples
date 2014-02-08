package _02classes

public data class Person4(public val name: String,
                          public val age: Int) {
    fun toString() = "$name"
}

fun main(args: Array<String>) {
    val person = Person4("Ladislav Thon", 31)
    println(person)

    val (name, age) = person
    println("$name: $age years")
}
