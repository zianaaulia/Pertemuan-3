package DataKelas
//Data Classes and Destructuring Declarations: The componentN() method
fun main() {
    val meri = Student("Meri", 20)
// Destructuring Declaration
    val(name, age) = meri
    println("Name = $name")
    println("Age = $age")
}
/*
Kita dapat mendestruksi data kelas sebuah objek kedalam sejumlah variabel menggunakan
destructing declarations.
 */