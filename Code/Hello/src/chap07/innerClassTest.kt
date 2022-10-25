package chap07

class Smartphone(val model: String) {

    private val cpu = "Ex"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = println("$model : Installed on $cpu with $size Gb")
    }

    fun powerOn(): String {
        class Led(val color: String) {  // 지역 클래스 선언
            fun blink(): String = "Blinking $color on $model"  // 외부의 프로퍼티는 접근가능
        }
        val powerStatus = Led("Red") // 여기에서 지역 클래스가 사용된다
        return powerStatus.blink()
    }
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(128)
    mySdcard.getInfo()
    println(Smartphone("S8").powerOn())
}