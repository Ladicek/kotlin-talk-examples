package _13coroutines

import kotlinx.coroutines.*

suspend fun waitAndSee(i: Int) {
    delay(5000)
    println("Hello, world! $i")
}

suspend fun deepThought() = coroutineScope {
    async {
        delay(1000)
        42
    }
}

fun main() = runBlocking {
    val answer = deepThought()

    for (i in 1..100_000) {
        launch {
            waitAndSee(i)
        }
    }

    println("The answer is ${answer.await()}... but what is the question?")
}
