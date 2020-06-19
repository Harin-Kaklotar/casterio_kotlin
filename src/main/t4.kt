package main

fun main() {
    sayName()
    var x = sayFirstName()
    println(x)
    var age = 2
    fun dowork() = if (age > 10) println("eligibale") else println("study")

    dowork()
}

fun sayName() {
    println("Harin")
}

fun sayFirstName() = "Kaklotar"

