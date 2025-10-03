package id.ac.polbeng.supriyanto.test_kelas

class EmployeeA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() {
            return field.uppercase()   // gunakan uppercase() (toUpperCase sudah deprecated)
        }
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = if (value > 0) value
            else throw IllegalArgumentException("Age must be greater than zero")
        }
}

fun main() {
    val emp = EmployeeA(1101, "Jono", 25)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")

    try {
        emp.age = -1   // ini akan error
    } catch (e: IllegalArgumentException) {
        println("⚠️ Error: ${e.message}")
    }

    println("Umur setelah percobaan ubah: ${emp.age}") // tetap 25
}
