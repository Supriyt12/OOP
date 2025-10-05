// 1. PUBLIC → bisa diakses dari mana saja

class PublicExample {
    val name = "Saya Public" // public (default), bisa diakses dari luar class
}

// 2. PRIVATE → hanya bisa diakses di dalam kelas ini
class PrivateExample {
    private val secret = "Rahasia" // hanya bisa dipakai di dalam class ini

    fun showSecret() {
        // method public (default), bisa dipanggil dari luar class
        println(secret) // ✅ boleh, karena masih di dalam class yang sama
    }
}

// 3. PROTECTED → bisa diakses di kelas dan subclass
open class ProtectedExample {
    protected val data = "Data Protected" // hanya bisa diakses di class ini + subclass
}

class SubProtected : ProtectedExample() {
    fun accessData() {
        println(data) // ✅ boleh, karena subclass mewarisi dari ProtectedExample
    }
}

// 4. INTERNAL → hanya bisa diakses dalam satu modul/proyek
internal class InternalExample {
    internal val info = "Hanya untuk 1 modul" // bisa diakses di semua file asal masih dalam modul yang sama
}

// ---------------- MAIN FUNCTION ----------------
fun main() {
    // Public
    val pub = PublicExample()
    println(pub.name) // ✅ bisa diakses langsung karena public

    // Private
    val pri = PrivateExample()
    pri.showSecret()    // ✅ bisa, karena lewat method public
    // println(pri.secret) ❌ ERROR: tidak bisa, secret bersifat private

    // Protected
    val sub = SubProtected()
    sub.accessData()    // ✅ bisa, karena lewat subclass
    // println(sub.data) ❌ ERROR: tidak bisa langsung akses data (protected)

    // Internal
    val inter = InternalExample()
    println(inter.info) // ✅ bisa, karena kita masih di modul yang sama
}
