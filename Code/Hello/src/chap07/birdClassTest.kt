package chap07

class Bird(var name: String, val wing: Int, var beak: String) {

//    constructor(_name: String, _wing: Int, _beak: String) {
//        name = _name
//        wing = _wing
//        beak = beak
//    }

    init {
        println("-------init-------")
        name = name.capitalize()
        println("name: $name, wing: $wing, beak: $beak")
        println("------------------")
    }

    fun fly() {
        println("Fly")
    }
}

fun main() {
    val coco = Bird("coco", 2, "short")

    coco.fly()
    println(coco.name)
    println(coco.wing)
    println(coco.beak)

}