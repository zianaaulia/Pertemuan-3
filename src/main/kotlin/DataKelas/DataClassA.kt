package DataKelas

data class Student(val name: String, val age: Int)

fun main() {
    val boni = Student("Boni", 21)
    val meri = Student("Meri", 20)
    println("Student Name is: ${boni.name}")
    println("Student Age is: ${boni.age}")
    println("Student Name is: ${meri.name}")
    println("Student Age is: ${meri.age}")
}
/*
Kotlin memiliki solusi yang lebih baik untuk menangani data yaitu dengan menggunakan data
kelas.
Kotlin telah men-generate secara otomatis fungsi Getter dan Setter pada setiap anggota
kelas. Selain itu, ia juga menurunkan implementasi fungsi standar seperti equals(), hashCode()
dan toString() dari property yang dideklarasikan didalam data kelas kontruktor utama.

 */