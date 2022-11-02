package test

    fun main() {

        var a = Book("은지책", 10000).apply{
            name = "<할인 중> $name"
            discount()
        }

//        var bookCost = a.run{
//            println("상품명: ${a.name}, 가격: ${a.price}")
//            price + 2000
//        }
//        println("원가는 $bookCost 원")

        a.run{
            println("상품명: ${a.name}, 가격: ${a.price}")
        }
    }

    class Book(var name: String, var price: Int){
        fun discount() {
            price -= 2000
        }
    }