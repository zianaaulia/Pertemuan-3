package Polymorphism
//Static Polymorphism
fun printNumber(n : Number){
    println("Using printNumber(n : Number)")
    println(n.toString() + "\n")
}
fun printNumber(n : Int){
    println("Using printNumber(n : Int)")
    println(n.toString() + "\n")
}
fun printNumber(n : Double){
    println("Using printNumber(n : Double)")
    println(n.toString() + "\n")
}
fun printNumber(n:Int, str:String){
    println("Using printNumber(n:Int, str:String)")
    println(str + n.toString() + "\n")
}
fun main(){
    val a: Number = 99
    val b = 1
    val c = 3.1
    printNumber(a)
    printNumber(b)
    printNumber(c)
    printNumber(b, "Overloading function ")
}
/*
Terdapat 2 jenis Polymorphism:
    1. Static(compile-time) Polymorphism
    2. Dynamic(run-time) Polymorphism
    Static Polymorphism terjadi ketika mendefinisikan beberapa fungsi
    overloading dengan nama yang sama tetapi berbeda karateristik parameter(jenis type dan jumlah parameter).
 */