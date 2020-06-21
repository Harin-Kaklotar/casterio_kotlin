package main

class User (var firstName: String, var lastName: String){

    var fullName = "$firstName $lastName"
        get() = "Full name : $field"
}