package main

fun main(){
    var harin = User("Harin", "Kaklotar")
    harin.printFullName()
    harin.printPrifix("Mr.")
    harin.changeName("Harit")
    harin.printFullName()

    var friend = User("Donald", "Duck")
    friend.printFullName()
    friend.firstNameLength()
}

