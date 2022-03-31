package AbstractClass

abstract class Vehicle(val name: String,
                       val color: String,
                       val weight: Double) { // Concrete (Non Abstract) Properties
    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double
    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun start()
    abstract fun stop()
    abstract fun sound()

    // Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")
    }
}
class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
// Code to start a Car
        println("Car Started")
    }
    override fun stop() {
// Code to stop a Car
        println("Car Stopped")
    }
    override fun sound() {
// Code sound of a Car
        println("Brum...brum...brumm!")
    }
}
class Motorcycle(name: String,
                 color: String,
                 weight: Double,
                 override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
// Code to Start the Motorcycle
        println("Bike Started")
    }
    override fun stop() {
// Code to Stop the Motorcycle
        println("Bike Stopped")
    }
    override fun sound() {
// Code sound of a Car
        println("Preng...preng...preng!")

    }
}
fun main() {
    val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
    val motorCycle = Motorcycle("Ducati 1098s", "red", 173.0, 271.0)
    car.displayDetails()
    motorCycle.displayDetails()
    car.start()
    car.sound()
    car.stop()
    motorCycle.start()
    motorCycle.sound()
    motorCycle.stop()
}

/*
Kelas Abstrak adalah kelas yang tidak bisa di Instansiasi menjadi sebuah objek, akan tetapi ia
bisa diwariskan ke kelas yang lainnya. Sebuah kelas abstrak biasanya berisi anggota abstrak (abstract member) yang tidak memiliki implementasi dan harus di override didalam subclass-nya.
 */