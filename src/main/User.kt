package main

class User (var firstName: String, var lastName: String){

    constructor(firstName: String): this(firstName, "Unknown"){
        println("secondory constructor")
    }

    init {
        println("This is 1st init block, It will call after primary constructor")
    }

    init {
        println("This is 2nd init block")
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