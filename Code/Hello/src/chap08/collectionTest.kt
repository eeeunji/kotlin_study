package chap08

fun main() {
    val list1 = listOf("one", "two", "three")
    val list2 = listOf(1,2,3)

    println(list1 + "four")
    println(list2 + 4)
    println(list2 - 1) // 실제로 지워지는건 아님
    println(list2)
    println(list1 - "one")

    println(list1 + listOf("abc", "def"))
}