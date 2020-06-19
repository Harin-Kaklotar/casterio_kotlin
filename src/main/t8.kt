package main

fun main(){
    userInfo("Ghano")
    userInfo("Chheta", 25)
}

fun userInfo(name: String){
    println("Name = $name")
}

fun userInfo(name: String, age: Int){
    println("Name = $name, Age = $age")
}