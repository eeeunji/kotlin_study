package chap03

fun highFunc(a: Int, b: Int, sum: (Int, Int) -> Int): Int {
    return sum(a, b)
}

fun main() {
    var re = highFunc(1, 5) {x, y -> x+y}
    println(re)
}