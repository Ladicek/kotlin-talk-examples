package _06generics

trait Producer<out T> {
    fun produce(): T
}

trait Consumer<in T>{
    fun consume(t: T)
}

trait Holder<T> {
    fun produce(): T
    fun consume(t: T)
}

fun use(h: Holder<out String>) {
    h.produce()
    //h.consume("")
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

    use(e)
    //use(f)
}
