package main

fun main(){
    var harin = User()
    harin.firstName = "Harin"
    harin.lastName = "Kaklotar"
    harin.printFullName()
    harin.printPrifix("Mr.")
    harin.changeName("Harit")
    harin.printFullName()

    var friend = User()
    friend.firstName = "Donald"
    friend.lastName = "Duck"
    friend.printFullName()
    friend.firstNameLength()
}

