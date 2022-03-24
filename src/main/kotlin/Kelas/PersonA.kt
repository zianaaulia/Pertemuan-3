package Kelas

class PersonA (_firstName: String, _lastName: String, _age:Int){
    var firstName: String
    var lastName: String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
/*
Parameter dari konstruktor utama dapat digunakan dalam blok inisialisasi serta
dapat digunakan untuk menginisialisasi property yang di deklarasikan di dalam tubuh kelas.
 */
fun main() {
    val ziana = PersonA("Ziana","Aulia", 19)
    println("Name : ${ziana.firstName} ${ziana.lastName}")
    println("Age: ${ziana.age}")
}