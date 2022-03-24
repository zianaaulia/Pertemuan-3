package Kelas
/*
Untuk lebih ringkas, deklarasi dan inisialisasi propert dapat dilakukan
hanya di dalam parameter konstruktor utama.
 */
class PersonC(var firstName: String, var lastName: String, var age: Int) {}

fun main() {
    val ziana = PersonC("Ziana", "Aulias", 19)
    println("Name : ${ziana.firstName} ${ziana.lastName}")
    println("Age : ${ziana.age}")
}