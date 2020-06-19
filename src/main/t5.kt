package main

fun main(){
    name("Harin", 27)
    name("Harit", 25)
}

fun name(fname: String, age: Int){
    if (age <= 25){
        println("$fname, you are a simple cute boy")
    }else{
        println("$fname, you are mature enough to handle the world")
    }
}