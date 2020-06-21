package main

class User (var firstName: String, var lastName: String){

    fun printFullName(){
        println("$firstName $lastName")
    }

    fun printPrifix(prifix: String){
        println("$prifix $lastName")
    }

    fun changeName(newName: String){
        firstName = newName
    }

    fun firstNameLength(){
        println(firstName.length)
    }
}