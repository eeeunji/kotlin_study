package chap07

class ltPerson {

    lateinit var name: String

    fun test() {
        if(!::name.isInitialized) {
            println("not Initialized")
        } else {
            println("Initialized")
        }
    }
}

fun main() {
    val person = ltPerson()

    person.test()
    person.name = "eunji"
    person.test()
}