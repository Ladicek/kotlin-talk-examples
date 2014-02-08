package _08lambdas

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun locked<T>(l: Lock, compute: () -> T): T {
    l.lock()
    try {
        return compute()
    } finally {
        l.unlock()
    }
}

fun Lock.locked<T>(compute: () -> T): T {
    this.lock()
    try {
        return compute()
    } finally {
        this.unlock()
    }
}

fun demo(args: Array<String>) {
    val l = ReentrantLock()

    val result = locked(l) {
        1
    }

    val result2 = l.locked {
        2
    }
}
