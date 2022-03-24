package id.ac.polbeng.ziana.test_kelas

/**class Greeter {
    fun greet() {
        println("Hello object world!")
    }
}*/
/*
Menambahkan class member berupa atribut dengan nama text dan
dua buah method dengan nama greet
 */
class Greeter {
    var text: String = ""
    fun greet() {
        println("Hello object world!")
    }

    fun greet(name: String) {
        println("$text $name")
    }

    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}