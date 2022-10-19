package chap04

fun main() {
    val num = 3
//    val str = num.stringPlus("eunji")
    val str = num stringPlus "eunji"
    println(str)

}

infix fun Int.stringPlus(x: String): String {
    return "$x : $this"
}