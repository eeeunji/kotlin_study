package chap03

fun sum(a: Int, b: Int): Int {
    return a+b
}

fun main() { //최상위 함수
    val re = sum(1,2)

    val a = 3
    val b = 5
    val re2 = max(a,b)

    println(re)
    println(re2)
    out("eunji")
}

fun max(a: Int, b: Int): Int {
    return if (a>b) a else b
}

fun out(name: String): Unit {
    println("name = ${name}")
}