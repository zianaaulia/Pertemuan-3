package Interfaces

interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String
    override val name: String get() = "$firstName $lastName"
}
data class EmployeeB(
// implementing 'name' is not required
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person
fun main(){
    val pegawai = EmployeeB("Ucok", "Baba", "Programmer")
    println(pegawai.name)
}
/*
Antarmuka dapat diturunkan dari antarmuka lain, artinya antarmuka dapat menyediakan
implementasi untuk anggotanya dan mendeklarasikan fungsi dan properti baru. Secara alami, kelas
yang mengimplementasikan antarmuka seperti itu hanya diperlukan untuk mendefinisikan implementasi yang hilang
 */