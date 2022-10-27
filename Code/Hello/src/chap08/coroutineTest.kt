package chap08

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {

        val job = GlobalScope.launch {
            delay(1000L)
            println("World")
            doSomething()
        }
        println("Hello")
        println("job: ${job.isActive}, ${job.isCompleted}")
        job.join()
//    Thread.sleep(2000L)
        println("job: ${job.isActive}, ${job.isCompleted}")
    }
}

suspend fun doSomething() {
    println("Do Something")
}