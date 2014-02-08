package _10builders

import java.util.ArrayList
import java.util.Random

fun data(build: Data.() -> Unit): Data {
    val result = Data()
    result.build()
    return result
}

class Value(val value: String)

class Item {
    private val values: MutableList<Value> = ArrayList<Value>()

    fun value(value: String) {
        values.add(Value(value))
    }

    fun value(value: Int) {
        values.add(Value("$value"))
    }
}

class Data {
    private val items: MutableList<Item> = ArrayList<Item>()

    fun item(build: Item.() -> Unit) {
        val result = Item()
        result.build()
        items.add(result)
    }
}

fun main(args: Array<String>) {
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
            if (r) value("done 1") else value("done 2")
        }
    }
    println(d)
}
