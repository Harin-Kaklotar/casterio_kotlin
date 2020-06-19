package main

fun main(){
    var a = sayHi()
    println(a)

    val b = sayHello()
    println(b)
    val x = age()
    println(x)
}

fun sayHi(): Unit{
    println("Hi")
}

fun sayHello(): String{
    return "Hello"
}

fun age(): Int{
    return 27
}