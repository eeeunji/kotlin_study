package chap08

import kotlinx.coroutines.*

fun main() = runBlocking {

    launch{
        delay(1200L)
        println("Task from run---")
    }

    coroutineScope {
        launch {
            delay(1500L)
            println("Task from nested launch")
        }
        delay(200L)
        println("task from cor--")
    }

    println("end")
}
