package id.ac.polbeng.supriyanto.test_kelas

// Interface dasar
interface Named {
    val name: String
}

// Interface turunan
interface Person : Named {
    val firstName: String
    val lastName: String
    override val name: String
        get() = "$firstName $lastName"   // hasil gabungan
}

// Data class implementasi
data class EmployeeB(
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person

fun main() {
    val pegawai = EmployeeB("Ucok", "Baba", "Programmer")
    println(pegawai.name)       // otomatis panggil getter dari interface
    println(pegawai.position)   // tambahan: posisi kerja
}
