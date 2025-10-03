package id.ac.polbeng.supriyanto.test_kelas

class Greeter {
    var text: String = "Hello object world"


    fun greet() {
        println(text)
    }


    fun greet(name: String) {
        println("$text $name")
    }


    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}
