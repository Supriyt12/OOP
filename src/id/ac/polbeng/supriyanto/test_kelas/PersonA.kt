package id.ac.polbeng.supriyanto.test_kelas
class PersonA(_firsName : String, _lastName: String, _age: Int) {
    var firsName: String
    var lastName: String
    var age: Int

    init {
        firsName = _firsName
        lastName = _lastName
        age = _age

    }
}
fun  main() {
    val budi = PersonA("Budi", "Gunawan", 21)
    println("Name : ${budi.firsName} ${budi.lastName}")
    println("Age : ${budi.age}")
}