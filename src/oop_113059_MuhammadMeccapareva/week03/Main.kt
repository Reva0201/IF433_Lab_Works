package oop_113059_MuhammadMeccapareva.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 500000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    val w = Weapon("Excalibur")

    w.damage = -50
    w.damage = 9999
    println("Tier: ${w.tier}")

    val p = Player("Tasya")

    p.addXp(50)
    p.addXp(60)
}