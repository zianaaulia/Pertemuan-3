package Inheritance

open class Rectangle {
    open fun draw() {
        println("From Base Class Rectangle")
    }
}
interface Polygon {
    fun draw() { // interface members are 'open' by default
        println("From interface Polygon")
    }
}
class Square() : Rectangle(), Polygon {
// The compiler requires draw() to be overridden:

    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}
fun main() {
    val square = Square()
    square.draw()
}
/*
Pada implementasi inheritance diatur dengan aturan (rule). Jika sebuah kelas
mewarisi implementasi method yang sama atau ganda dari kelas induk perantara maka kelas tersebut di override
dan menyediakan implementasinya. Untuk menunjukkan supertype dari kelas yang diwarisi oleh anggota dapat
dilakukan dengan menggunakan keyword super<Base>.
 */