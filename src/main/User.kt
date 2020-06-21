package main

class User (var firstName: String, var lastName: String){

    companion object {
        var users = mutableListOf<User>()
        fun createUsers(count: Int): List<User>{
            for (i in 1..count){
                users.add(User("firName$i", "LastName$i"))
            }
            return users
        }

        fun createUser(fname:String, lName: String): User{
            return User(fname, lName)
        }
    }

    fun fullName(): String{
        return "$firstName $lastName"
    }

    fun fullNameLength(): Int{
        return fullName().length
    }

    override fun toString(): String {
        return fullName()
    }
}