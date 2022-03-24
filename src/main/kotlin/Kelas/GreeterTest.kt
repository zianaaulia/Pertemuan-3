package Kelas

/*
fun main() {
    val greeter = Greeter()
    greeter.greet()
}*/
/*
Mengubah kode program Greetertest yang sebelumnya dengan nilai text "Hi",
lalu melakukan panggillah method greet dari kelas Greeter dengan memasukkan
nilainya dengan "Anton" dan "Budi". Lalu menambahkan nilai dengan text "Hello Programmer"
dan lakukan panggilan fungsi with_ret_val dengan parameter String "Dono".
 */

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Done"))
}