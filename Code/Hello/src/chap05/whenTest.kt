package chap05

fun main() {

    print("score 입력: ")
    val score = readLine()!!.toDouble()

    var grade: Char = 'F'

    when (score) {
        in 90.0 .. 100.0 -> grade = 'A'
        in 80.0 .. 90.0 -> grade = 'B'
        in 70.0 .. 80.0 -> grade = 'C'
        else -> grade = 'F'
    }

    println(grade)
}