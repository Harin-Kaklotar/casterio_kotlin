package main

fun main(){
    userInfo("Harin",27, "Surat", true, true)
    userInfo(
        name = "Priyanka",
        age = 28,
        city = "Surat",
        isDeveloper =  false,
        isBoy = false)
    userInfo(age = 25, name = "Harit",city =  "Assen", isDeveloper = false)
}

fun userInfo(name: String, age: Int, city: String, isDeveloper: Boolean, isBoy: Boolean= true){
    println("$name, you are $age. live in $city, isDeveloper = $isDeveloper, isBoy = $isBoy")
}