package main

fun main(){
    sayHiAndBye()
}

fun sayHiAndBye(){

    println("Hiii")

    fun Bye(){
        println("Bye")

        fun moo(){
            println("moo")
        }

        moo()
    }

    // we can call moo here also
    moo()
    Bye()

}