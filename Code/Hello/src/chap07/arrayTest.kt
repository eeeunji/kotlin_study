package chap07

import java.util.Arrays

fun main() {
    val arr = arrayOf(1,2,3,4,5)

    println(arr.get(2))
    println(arr[2])

    println(arr.size)
    for (ele in arr) {
        print(ele)
    }

    println(Arrays.toString(arr))
    println(arr.sum())

    arr.set(1, 8)
    println(Arrays.toString(arr))

    println(arr.contains(2)) //2가 있는지
    println(5 in arr) //5가 있는지

}