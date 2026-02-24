package oop_113059_MuhammadMeccapareva.week04

fun main() {

    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val tesla = ElectricCar("Tesla", 4, 87)
    tesla.honk()
    tesla.openTrunk()
    tesla.accelerate()

    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager("Akbar", 10_000_000)
    manager.work()
    println("Bonus: Rp ${manager.calculateBonus()}")

    val developer = Developer("Andi", 8_000_000, "Kotlin")
    developer.work()
    println("Bonus: Rp ${developer.calculateBonus()}")
}