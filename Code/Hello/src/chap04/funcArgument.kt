package chap04

fun sum (a: Int, b: Int) = a+b

fun mul (a: Int, b: Int): Int {
    return a*b
}

fun funcFunc(a:Int, b:Int) = sum(a, b) //함수에 함수가 들어있는 상태

fun main() {

    val re = sum(10, 20)
    val re2 = mul(sum(10,5), 20)
    val re3 = funcFunc(2, 5)

    println(re)
    println(re2)
    println(re3)

}