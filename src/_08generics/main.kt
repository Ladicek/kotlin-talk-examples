package _08generics

interface Producer<out T> {
    fun produce(): T
}

interface Consumer<in T>{
    fun consume(t: T)
}

interface Holder<T> {
    fun produce(): T
    fun consume(t: T)
}

fun useOut(h: Holder<out String>) {
    val x = h.produce()
    //h.consume(x)
}

fun useIn(h: Holder<in String>) {
    val x = h.produce()
    //h.consume(x)
}

fun demo(a: Producer<String>, b: Producer<Any>,
         c: Consumer<String>, d: Consumer<Any>,
         e: Holder<String>,   f: Holder<Any>) {
    val j: Producer<Any> = a
    //val k: Producer<String> = b
    //val l: Consumer<Any> = c
    val m: Consumer<String> = d
    //val n: Holder<Any> = e
    //val o: Holder<String> = f

    useOut(e)
    useIn(f)
}
