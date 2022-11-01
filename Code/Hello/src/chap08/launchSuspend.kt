package chap08

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

private fun worksInSerial(): Job {
    //순차적 실행
    val job = GlobalScope.launch {
        val one = doWork1() //1초 지나고
        val two = doWork2() //3초 지나서 밑 실행 (총 4초)
        println("Kotlin One: $one")
        println("Kotlin Two: $two")
    }
    return job
}

private fun worksInParallel(): Job {
    val one = GlobalScope.async {
        doWork1()
    }
    val two = GlobalScope.async {
        doWork2()
    }

    val job = GlobalScope.launch {
        val combined = one.await() + "_" + two.await()
        println("Kotlin Combined: $combined") //따로따로 실행되기때문에 (제일 긴 시간인) 3초가 걸린다.
    }
    return job
}

fun main() = runBlocking{
    val time = measureTimeMillis {
        //val job = worksInSerial()
        //readLine() //(4초 기다려야하는데) 바로 종료되는거 방지하기 위해 삽입
        //job.join()
        val job = worksInParallel()
        job.join()
    }
    println("time: $time") //블록 안 얼마나 걸리는지 체크
}