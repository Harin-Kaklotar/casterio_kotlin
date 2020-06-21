package main

class User (var firstName: String, var lastName: String){

    var fullName = "$firstName $lastName"
        get() = "Full name : $field"
        set(value) {
            if (value.startsWith("Android")){
                field = "Android Developer"
            }else{
                field = value
            }
        }
}