package _02classes

public class Person3(public val name: String,
                     public val age: Int)

fun _main(args: Array<String>) {
    val person = Person3("Ladislav Thon", 31)
    println(person)
}
