package chap05

fun main() {

    print("score 입력: ")
    val score = readLine()!!.toDouble()

    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score in 80.0..89.9) {
        grade = 'B'
    } else if (score in 70.0..79.9) {
        grade = 'C'
    }

    println(grade)
}