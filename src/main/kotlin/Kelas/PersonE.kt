package Kelas

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 20
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}

fun main() {
    val yuni = PersonE("Yuni", "Zanika")
    yuni.cetakInfo()
    println()
    val nurul = PersonE("Nurul", "Hakiki")
    nurul.cetakInfo()
}
/*
Keyword this digunakan untuk merujuk pada konstruktor kelas yang sesuai.
 */