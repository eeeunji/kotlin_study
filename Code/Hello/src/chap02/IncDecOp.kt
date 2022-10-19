package chap02

fun main() {
    var a = 10
    var b = 10

    var re1 = ++a
    var re2 = b++

    println("re1: ${re1}, re2: ${re2}")
    println("a: ${a}, b: ${b}")
}