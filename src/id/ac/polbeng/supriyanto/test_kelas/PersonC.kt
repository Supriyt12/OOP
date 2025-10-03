package id.ac.polbeng.supriyanto.test_kelas

class PersonC( var firsfName: String, var lastName: String, var age: Int) {}

fun main (){
    val budi = PersonC("Budi", "Gunawan", 21)
    println("Name : ${budi.firsfName} ${budi.lastName}")
    println("Age : ${budi.age}")
}
