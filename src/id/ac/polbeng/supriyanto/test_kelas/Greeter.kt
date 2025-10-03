package id.ac.polbeng.supriyanto.test_kelas

/*class Greeter {
    fun greet() {
        println("Hello object world!")
    }
}*/

class  Greeter {
    var text: String = ""
    fun greet(){
        println("Hello object world!")

    }
    fun greet( name: String){
        println("$text $name")

    }
    fun with_ret_val(name: String): String{
        return "$text $name"

    }
}