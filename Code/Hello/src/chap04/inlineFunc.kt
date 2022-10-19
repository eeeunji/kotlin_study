package chap04

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Hello")
    out(a)
    println("Bye")
}
fun main() {
    shortFunc(3) { println("a = $it") }
}