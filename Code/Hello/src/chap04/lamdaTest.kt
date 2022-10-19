package chap04

fun main() {

    val re: Int
    val multi = {a:Int, b:Int -> a + b}

    re = multi(10,20) //함수처럼 사용 가능
    println(re)
}