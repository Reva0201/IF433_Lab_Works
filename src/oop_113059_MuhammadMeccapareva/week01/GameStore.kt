package oop_113059_MuhammadMeccapareva.week01

fun calculateDiscount(price: Int): Int = if (price > 500000 ) (price * 0.8).toInt() else (price * 0.9).toInt()

fun receipt(title: String, finalPrice: Int) {
    println("===== RECEIPT =====")
    println("Game Title: $title")
    println("Final Price: $finalPrice")
}

fun main() {
    val gameTitle = "Elden Ring"
    val price = 799000
    val finalPrice = calculateDiscount(price)

    receipt(gameTitle, finalPrice = finalPrice)

}