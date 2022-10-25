package chap07

import org.omg.CORBA.portable.Delegate
import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("Noname") {
        property, oldValue, newValue ->
        println("old: $oldValue, new: $newValue")
    }
}

fun main() {
    val user = User()

    user.name = "eunji"
    user.name = "dongji"
}