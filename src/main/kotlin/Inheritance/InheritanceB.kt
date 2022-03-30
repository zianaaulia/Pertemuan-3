package Inheritance

// Kelas anak (menginisialisasi kelas induk)
class LaptopB : Computer{
    val batteryLife: Double
    // Calls super() to initialize the Parent class
    constructor(name: String, brand: String, batteryLife: Double): super(name, brand) {
        this.batteryLife = batteryLife
    }
    // Memanggil konstruktor lain (yang memanggil super())
    constructor(name: String, brand: String): this(name, brand, 0.0) {
    }
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}
fun main(){
    val myLaptop = LaptopB("Asus Think Pad", "Asus")
    println(myLaptop.info())
}

/*
Jika kelas anak tidak memiliki primary constructor maka secondary constructor yang di inisialisasi
pada kelas induk akan dipanggil dengan keyword super secara langsung atau mendelegasikan ke konstruktor
yang lain.
 */