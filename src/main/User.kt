package main

class User (var firstName: String, var lastName: String, val isPremium: Boolean){

    constructor(firstName: String, lastName: String): this(firstName, lastName, false){
        println("isPlatinum default false")
    }

    constructor(firstName: String): this(firstName, "Unknown"){
        println("3rd constructor")
    }

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