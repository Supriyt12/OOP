// FINAL → tidak bisa diwarisi
final class FinalClass {
    fun show() = println("Ini kelas FINAL → tidak bisa diwarisi")
}

// ABSTRACT → wajib diwarisi, method abstract harus dioverride
abstract class AbstractClass {
    abstract fun run()
}

// Subclass dari AbstractClass → override method run()
class SubAbstract : AbstractClass() {
    override fun run() = println("Implementasi run() di SubAbstract")
}

// OPEN → bisa diwarisi dan method bisa dioverride
open class Hewan {
    open fun suara() = println("Hewan umum bersuara")
}

// Subclass dari Hewan → override method suara()
class Kucing : Hewan() {
    override fun suara() = println("Meow meow")
}

// ---------------- MAIN FUNCTION ----------------
fun main() {
    // FINAL
    FinalClass().show()
    println("-----")

    // ABSTRACT
    SubAbstract().run()
    println("-----")

    // OPEN + OVERRIDE
    Hewan().suara()       // Hewan umum bersuara
    Kucing().suara()      // Meow meow
}
