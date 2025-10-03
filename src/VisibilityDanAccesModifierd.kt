// OPEN = class ini boleh diwariskan
open class Employee(
    private val name: String,     // PRIVATE = hanya bisa diakses di dalam class Employee
    protected val salary: Int     // PROTECTED = bisa diakses oleh class anak (Manager)
) {

    // PUBLIC = bisa dipanggil dari luar
    fun showInfo() {
        println("Employee Name: $name") // name bisa diakses karena masih di dalam class
    }

    // OPEN = boleh dioverride oleh anak class
    protected open fun calculateBonus(): Int {
        return salary * 10 / 100  // Bonus 10%
    }

    // Fungsi untuk menampilkan bonus ke luar class
    fun showBonus() {
        println("Bonus: ${calculateBonus()}")
    }
}

// FINAL (default) = class ini tidak bisa diwariskan lagi
class Manager(
    name: String,
    salary: Int,
    private val teamSize: Int   // PRIVATE = hanya di class Manager
) : Employee(name, salary) {

    // OVERRIDE = mengganti perhitungan bonus khusus manager
    override fun calculateBonus(): Int {
        return salary * 20 / 100  // Bonus 20% karena Manager
    }

    // PUBLIC = bisa dipanggil dari luar
    fun showTeamInfo() {
        println("Managing $teamSize employees")
    }
}

fun main() {
    val staff = Employee("Budi", 5000000)
    staff.showInfo()
    staff.showBonus()

    println()

    val boss = Manager("Andi", 10000000, 5)
    boss.showInfo()
    boss.showBonus()
    boss.showTeamInfo()
}
