package chap02

fun main() {

    var str1: String?
    str1 = "eunji"
    println("str1 길이 : ${str1?.length}")

    var str2: String?
    str2 = null
    println("str2 길이 : ${str2?.length}")

}