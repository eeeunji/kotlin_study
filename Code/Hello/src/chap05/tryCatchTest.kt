package chap05

import java.lang.Exception

fun main() {

    val a= 5
    val b = 0
    val c: Int

    try {
        c = a / b

    } catch (e: Exception) {
        println("Exception")

    } finally {
        println("finally")
    }
}