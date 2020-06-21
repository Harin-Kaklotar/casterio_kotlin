package main

fun main(){
    var harin = User("Harin", "Kaklotar")
    println(harin.fullName)

    harin.fullName = "Android"
    println(harin.fullName)

    harin.fullName = "Hello world"
    println(harin.fullName)
}