package org.example
fun main(){
    // array declaration
    var arr = arrayOf(1,2,3,4,5,6,7,9)
    // printing array elements
    for(numbers in arr){
        print("  $numbers")
    }
    println()
    val names = getNames()
    for (names in names){
        println(" Name is  $names")
    }
}

fun foodItems(){
    var foodItems =  arrayOf("Maggie","Pizza","Burger","Patties")
    for (food in foodItems){
        println(" Menu mein $food hai")
    }
}
fun getNames(): Array<String>{
    return arrayOf("Ankur","Ankit","Neha")
}