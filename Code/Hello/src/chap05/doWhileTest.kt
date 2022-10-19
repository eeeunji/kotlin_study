package chap05

fun main() {

    do {
        println("입력해!")
        val input = readLine()!!.toInt()

        for (i in 0 until input) {
            for (j in 0 until input) {
                print((i+j)%input +1)
            }
            println()
        }
    } while (input != 0) // 0이면 종료

}