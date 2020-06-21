package main

class User (var firstName: String, var lastName: String){


    var fullName = "$firstName $lastName"

    var age: Int = 12
    val fullNameLength = fullName.length


    init {
        println("This is 1st init block")
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