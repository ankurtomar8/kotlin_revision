package org.example.Conditionals


//it is used when there is multiple option
//when(condition){
//  Option1 -> { // write code }
//  Option2 -> { // write code }
//  Option3 -> { // write code }
//}



fun main(){

    val timeOfDay = "Afternoon" // Morning , Afternoon

    when(timeOfDay){
        "Morning" -> {println("Eat breakfast execute")}
        "Afternoon" -> {println("After Lunch execute")}
        "Evening" -> {println("Evening Scope")}
        "Night" -> {println("Dosa mil gya")}
        else -> {println("Londa bookha hai")}
    }
    var region : Int = 4
    when(region){
        1 -> {println("APAC")}
        2 -> {println("GCC")}
        3 -> {println("BRA")}
        4 -> {println("JPN")}
        else -> {println("Region not exist")}
    }



}