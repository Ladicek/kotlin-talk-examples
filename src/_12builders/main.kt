package _12builders

import java.util.ArrayList
import java.util.Random

data class Value(val value: String)

data class Item(private val values: MutableList<Value> = ArrayList<Value>()) {
    fun value(value: String) {
        values.add(Value(value))
    }

    fun value(value: Int) {
        values.add(Value("$value"))
    }
}

data class Data(private val items: MutableList<Item> = ArrayList<Item>()) {
    fun item(build: Item.() -> Unit) {
        val result = Item()
        result.build()
        items.add(result)
    }
}

fun data(build: Data.() -> Unit): Data {
    val result = Data()
    result.build()
    return result
}

fun main() {
    val d = data {
        item {
            value("foo")
            value("bar")
            value("baz")
        }

        item {
            for (i in 1..10) {
                value(i)
            }
            //value(1.0)
        }

        item {
            val r = Random().nextBoolean()
            if (r) value("true") else value("false")
        }
    }

    println(d)
}
