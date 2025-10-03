package id.ac.polbeng.supriyanto.test_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()              // Output: Hello
    greeter.text = "Hi"
    greeter.greet("Anton")       // Output: Hi Anton
    greeter.greet("Budi")        // Output: Hi Budi
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono")) // Output: Hello programmer Dono
}
