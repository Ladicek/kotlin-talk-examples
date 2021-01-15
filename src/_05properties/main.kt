package _05properties

interface Sized {
    val isEmpty: Boolean

    var size: Int
}

class MyList(private var data: ArrayList<String>) : Sized {
    override val isEmpty: Boolean
        get() = data.isEmpty()

    override var size: Int
        get() = data.count()
        set(value) {
            while (data.count() > value) {
                data.removeAt(value)
            }
        }

    override fun toString() = "$data"
}

fun main() {
    val list = MyList(arrayListOf("a", "b", "c", "d"))
    println(list)
    println(list.isEmpty)
    println(list.size)

    list.size = 2
    println(list)
    println(list.isEmpty)
    println(list.size)

    list.size = 0
    println(list)
    println(list.isEmpty)
    println(list.size)
}
