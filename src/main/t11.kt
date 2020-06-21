package main

fun main() {
    FavoriteFood.name = "Pizza"
    println(FavoriteFood.name)

    FavoriteFood.ingrediants.add("Salt")
    FavoriteFood.ingrediants.add("Peprica")
    FavoriteFood.ingrediants.add("Cheese")

    println(FavoriteFood.ingrediants)

    doStuff()

    println(FavoriteFood.name)
    println(FavoriteFood.ingrediantSize())

    FavoriteFood.ingrediants.add("Chilly")
    FavoriteFood.ingrediants.add("Bread")
    FavoriteFood.ingrediants.add("Cheese")

    println(FavoriteFood.name)
    println(FavoriteFood.ingrediants)
    println(FavoriteFood.ingrediantSize())
}

fun doStuff() {
    FavoriteFood.name = "PawBhaji"
    FavoriteFood.ingrediants.clear()
}

object FavoriteFood {
    var name: String = ""
    var ingrediants = mutableListOf<String>()

    fun ingrediantSize(): Int{
        return ingrediants.size
    }
}