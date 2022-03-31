package Interfaces

interface A {
    fun demo() {
        println("From interface A")
    }
}
interface B {
    fun demo() {
        println("From interface B")
    }
}
// This class implements X and Y interfaces
class MyClassB: A, B {
    override fun demo() {
        super<A>.demo()
        super<B>.demo()
    }
}

fun main() {
    val obj = MyClassB()
    obj.demo()
}
/*
Multiple Interface memiliki method yang sama untuk memecahkan
masalah tersebut pada kelas yang mengimplemntasikan interface tersebut dengan keyword
super.
 */