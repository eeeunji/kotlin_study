package chap03

fun normalVarargs(vararg a: Int) {
    for (num in a) {
        print("${num}")
    }
}

fun main() {
    normalVarargs(1)
    println()
    normalVarargs(1,2,3,4,5,6,7)
}