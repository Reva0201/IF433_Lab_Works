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
    val myEC = ElectricCar(brand = "BYD", numberOfDoors = 4, batteryCapacity = 67)
    myEC.accelerate()
    myEC.honk()
    myEC.openTrunk()
}