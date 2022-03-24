package Kelas

class PersonB(_firstName: String, _lastName: String, _age: Int) {
    var firstName: String = _firstName
    var lastName: String = _lastName
    var age: Int = _age
}
/*
Agar lebih ringkas di kode program kelas Person maka dapat menggabungkan
proses deklarasi dan menginisialisasi sebuah variabel pada blok inisialisasi ke dalam
statement.
 */
fun main() {
    val ziana = PersonB("Ziana", "Aulia", 19)
    println("Name : ${ziana.firstName} ${ziana.lastName}")
    println("Age : ${ziana.age}")
}