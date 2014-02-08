package _03traits

trait Foo {
    fun foo(): String
}

trait Bar {
    fun bar(): String {
        return "bar"
    }
}

trait Baz {
    fun baz() = "baz"
}

class Fubar : Foo, Bar, Baz {
    override fun foo() = "foo"

    fun fubar() {
        println("${foo()}-${bar()}-${baz()}")
    }
}

fun main(args: Array<String>) {
    Fubar().fubar()
}
