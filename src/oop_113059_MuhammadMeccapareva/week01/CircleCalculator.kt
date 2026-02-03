package oop_113059_MuhammadMeccapareva.week01

import java.awt.geom.Area

fun main() {
    val radius = 7.0
    val pi = 3.14

    var area: Double = pi * radius * radius

    println("Radius: $radius, Area $area")
    println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) "This is a Large Circle" else "This is a Small Circle"