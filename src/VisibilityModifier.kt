// 1. PUBLIC → bisa diakses dari mana saja
class BarangElektronikPublic {
    val nama = "Laptop"          // public (default)
    val harga = 7000000          // public (default)
}

// 2. PRIVATE → hanya bisa diakses di dalam kelas
class BarangElektronikPrivate {
    private val stok = 20        // hanya bisa diakses di dalam kelas

    fun tampilkanStok() {        // method public untuk akses stok
        println("Stok barang saat ini: $stok unit")
    }
}

// 3. PROTECTED → bisa diakses di kelas induk & subclass
open class BarangElektronikProtected {
    protected val garansi = 2    // garansi dalam tahun
}

class Laptop : BarangElektronikProtected() {
    fun infoGaransi() {
        println("Laptop ini bergaransi $garansi tahun")
    }
}

// 4. INTERNAL → hanya bisa diakses dalam 1 modul/proyek
internal class BarangElektronikInternal {
    internal val diskon = 10     // persen
}

// ---------------- MAIN FUNCTION ----------------
fun main() {
    // Public
    val pub = BarangElektronikPublic()
    println("Nama barang: ${pub.nama}, Harga: Rp${pub.harga}")

    // Private
    val pri = BarangElektronikPrivate()
    pri.tampilkanStok()      // bisa lewat method
    // println(pri.stok)     // ERROR kalau langsung diakses

    // Protected
    val laptop = Laptop()
    laptop.infoGaransi()
    // println(laptop.garansi)  // ERROR kalau langsung diakses

    // Internal
    val inter = BarangElektronikInternal()
    println("Diskon barang elektronik: ${inter.diskon}%")
}