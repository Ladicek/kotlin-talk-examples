package _04interfaces

interface Foo {
    fun foo(): String
}

interface Bar {
    fun bar(): String {
        return "bar"
    }
}

interface Baz {
    fun baz() = "baz"
}

class Fubar : Foo, Bar, Baz {
    override fun foo() = "foo"

    fun fubar() {
        println("${foo()}-${bar()}-${baz()}")
    }
}

fun main() {
    Fubar().fubar()
}
