package Inheritance
//Membuat kelas parent dan child
/*
Secara defult semua kelas di kotlin memiliki akses modifier final, artinya
tidak dapat di wariskan. Untuk dapat diwariskan ke kelas anak maka kelas induk
harus memiliki akses modifier open.
 */
open class Computer(val name: String,
                    val brand: String){

}
class  Laptop(name: String,
              brand: String,
              val batteryLife: Double) : Computer(name, brand){
      fun info(){
          println("Name: $name")
          println("Brand: $brand")
          println("Battery Life: $batteryLife")
      }
}

fun main() {
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    println(myLaptop.info())
}