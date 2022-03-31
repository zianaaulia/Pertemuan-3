package NesteddanInnerClass

fun main() {
// creating an instance of the interface
    var programmer: Human = object : Human {
        override fun think() { // overriding the think method
            print("I am an example of Anonymous Inner Class ")

        }
    }
    programmer.think()
}
interface Human {
    fun think()
}
/*
Konsep membuat sebuah objek interface menggunakan objek runtime dikenal sebagai
anonymous class.
 */