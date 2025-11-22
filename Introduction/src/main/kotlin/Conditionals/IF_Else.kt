package org.example.Conditionals

fun main(){
    val age = 18
    if (age in 18..30){
        println("You can vote and you are $age in range")
    }else{
        println("You cannot vote now $age")
    }
}