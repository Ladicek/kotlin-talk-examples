package _10lambdas

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun <T> withLock(l: Lock, compute: () -> T): T {
    l.lock()
    try {
        return compute()
    } finally {
        l.unlock()
    }
}

fun <T> Lock.with(compute: () -> T): T {
    this.lock()
    try {
        return compute()
    } finally {
        this.unlock()
    }
}

fun main() {
    val lock = ReentrantLock()

    val result1 = withLock(lock) {
        1
    }

    val result2 = lock.with {
        2
    }
}
