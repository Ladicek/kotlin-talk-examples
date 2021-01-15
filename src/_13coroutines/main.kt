package _13coroutines

import kotlinx.coroutines.*

suspend fun waitAndSee() {
    delay(5000)
    println("Hello, world!")
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
            waitAndSee()
        }
    }

    println("The answer is ${answer.await()}... but what is the question?")
}
