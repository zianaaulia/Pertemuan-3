package Enkapsulasi
/*
Enkapsulasi adalah konsep OOP yang memungkinkan untuk menyembunyikan informasi dari
suatu kelas sehingga data-data kelas tersebit tidak bisa diakses dari luar.
 */

class Employee(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    get() = field

    var name: String = _name
    get() = field
    set(value) {
        field = value
    }

    var age: Int = _age
    get() = field
    set(value) {
        field = value
    }
}

fun main() {
    val emp = Employee(1101, "Ziana", 19)
    println("Id : ${emp.id}, Name : ${emp.name}, Umur : ${emp.age}")
}
/*
Inisialisasi sintaks getter dan setter di Kotlin bersifat opsional, karena secara default
Kotlin telah men-generate method getter dan setter untuk property yang mutable(var) dan getter property read-only/immutable(val).
 */
