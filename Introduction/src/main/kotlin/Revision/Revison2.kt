package org.example.Revision



fun main(){

    val age : Int = 18
    if( age in 18..30){
        println("Allowed to vote ")
    }else{
        println("Not allowed to vote")
    }

    val timeofDay = "Night"

    when(timeofDay){
        "Morning" -> {println("Eat breakfast ")}
        "Afternoon" -> {println(" Lunch Eat ")}
        "Evening" -> {println("Evening snack ")}
        "Night" -> {println("Dinner time")}
        else -> {println("Vrat hai aaj ")}
    }

    var region : Int = 3
    when(region){
        1 -> {println("JPN is selected")}
        2 -> {println("HKG is selected")}
        3 -> {println("IND")}
        else -> {println("Region not exist")}
    }

}