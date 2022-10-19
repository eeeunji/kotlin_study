package chap05

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a,b)
}

fun retFunc() {
    println("시작")
    inlineLambda(4,3) lit@{ a,b ->
        val re = a+b
        if(re > 10) return@lit
        println("re : $re")
    } // 이 부분으로 빠져나간다!
    println("끝")
}