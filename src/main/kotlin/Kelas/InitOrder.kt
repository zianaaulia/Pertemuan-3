package Kelas

/*
Blok inisialisasi diawali dengan keyword init.
Kode di dalam blok init adalah yang pertama dieksekusi ketika kelas dipakai.
Blok init dijalankan setiap kali kelas dipakai,
dengan segala jenis konstruktor seperti yang akan kita lihat selanjutnya.
 */
class InitOrder(name: String) {
    val firstProperty = "First property: $name".also(::println)
    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }

}
fun main() {
    val initOrder = InitOrder("RPL")
}