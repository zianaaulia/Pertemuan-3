package id.ac.polbeng.ziana.test_kelas

/*
Secondary Constructor di definiskan didalam tubuh kelas.
Secondary Constructor memerlukan keyword constructor untuk didefinisikan.
 */
class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int) {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val ziana = PersonD("Ziana", "Aulia", 19)
    println("Name : ${ziana.firstName} ${ziana.lastName}")
    println("Age : ${ziana.age}")
}