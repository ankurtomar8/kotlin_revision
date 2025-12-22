package org.example.Revision

fun main(){

    var arr = arrayOf(1,23,4,5,6,7,36,9,7,2,3,47,8,9,7,5)

    for( i in arr){
        print(" "+"  $i")
    }

    fun foodItems(){
        var foodItems = arrayOf("Maggi","Pizza","Burger")

        for (food in foodItems){
            print("   $food")
        }
    }

    println()
    foodItems()



}