package main

fun main(){
    var user = User.createUser("Foo", "Bar")
    println(user)
    var users1 = User.createUsers(5)
    var user2 = User.users
    user2.forEach { println(it) }
}