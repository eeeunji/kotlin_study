package chap04

var global = 10

fun main() {
    global = 15
    val local = 15
    println("main에서는 $global")
    userFunc()
    println("마지막 $global")

}

fun userFunc() {
    global = 20
    val local = 20
    println("userFunc에서는 $global")

}