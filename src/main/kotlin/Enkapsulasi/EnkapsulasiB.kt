package Enkapsulasi

class EmployeeA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    get() = field

    var name: String = _name
    get() {
       return field.toUpperCase()
    }
    set(value) {
        field = value
    }

    var age: Int = _age
        get() = field
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age must be greater than zero")
        }
}

fun main() {
    val emp = EmployeeA(1101, "Ciki",2)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
    emp.age = -1
}
/*
Terdapat dua keyword asing yaitu value and field.
Value adalah nama parameter setter. Field atau juga disebut sebagai backing
fields yang membantu untuk merujuk property pada method getter dan setter.
*/
