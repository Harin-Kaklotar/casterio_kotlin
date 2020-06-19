package main

fun main(){
    var name: String = "Harin"
    var l1 = name.length
    println(l1)

    var fname: String? = "Kaklotar"
    var l2 = fname?.length

    fname = null

    var l3 = fname?.length ?: null
    println(l3)
}