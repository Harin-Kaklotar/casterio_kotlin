package main

fun main(){
    printBookInfo("Hello world", "unknowm")
    printBookInfo("Google use", "Gese", "asdf")
    printBookInfo("Old stories")
}

fun printBookInfo(name: String, vararg author: String){
    println("Book : $name - author: ")
    author.forEach { println(it) }
}