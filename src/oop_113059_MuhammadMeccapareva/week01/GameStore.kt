package oop_113059_MuhammadMeccapareva.week01

fun calculateDiscount(price: Int): Int = if (price > 500000 ) (price * 0.8).toInt() else (price * 0.9).toInt()

fun main() {
    val gameTitle = "Elden Ring"
    val price = 799000

    println("Game Title: $gameTitle")
    println("Original Price: $price")
}