package org.example.Revision



fun main(){

    val age : Int = readln().toInt()
    if( age in 18..30){
        println("Allowed to vote ")
    }else{
        println("Not allowed to vote")
    }


}