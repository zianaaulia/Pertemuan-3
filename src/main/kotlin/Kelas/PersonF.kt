package Kelas

class PersonF(val firstName: String, val lastname: String ) {
    init {
        println("Sedang inisialisasi wak!")
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        println("Name: $_firstName $_lastName")
        println("Age: $_age")
    }
    constructor(_firstName: String, _lastName: String, _country: String): this(_firstName, _lastName){
        println("Name: $_firstName, $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName: String, _age: Int, _country: String): this(_firstName,_lastName,_age){
        println("Name: $_firstName $_lastName")
        println("Age: $_age")
        println("Country: $_country")
    }
}

fun main() {
    val ziana = PersonF("Ziana", "Aulia")
    val nurul = PersonF("Nurul", "Hakiki", 20)
    val yuni = PersonF("Yuni", "Zanika", "Indonesia")
    val emil = PersonF("Emil", "Tito", 20, "Indonesia")
}
/*
Terdapat 1 konstuktor utama dan 3 konstruktor tambahan.
Konstruktor tambahan pertama dan kedua digunakan untuk mendelegasikan konstruktor utama.
Untuk konstruktor ketiga digunakan untuk mendelegasikan konstruktor tambah pertama yang secara
tidak langsung juga mendelegasikan konstruktor utama.
 */