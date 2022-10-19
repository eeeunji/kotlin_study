package chap05

fun main() {

    var total = 0

    for (num in 1..100 step 2) { //홀수 합
        total += num
    }
    println(total)
}