package chap07

class LazyTest {
    init {
        println("init block")
    }

    val subject by lazy {
        println("lazy")
        "Kotlin"
    }
    fun flow() {
        println("not Initialized")
        println("subject one: $subject")
        println("subject two: $subject")
    }
}

fun main() {
    val test = LazyTest()
    test.flow()
}