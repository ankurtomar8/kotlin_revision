package org.example.Iterators

fun main(){

// for (int i = 0; i <= 5; i++)  // Error in kotlin
    for( i in 0 until 5){
     println("loop printing $i")
    }
    // another example
    for (i in 0..5){
        println("Loop another version $i")
    }
   for(i in 1..10 step 2){
       println("Loop another step 2 $i")
   }
    for (i in 5 downTo 1){
        println("Loop another step 2 $i")
    }

   val names =  listOf("Ankur" , "Ankit" , "Neha")
       for (name in names){
           println(" Names is $name")
       }
   
   val items = listOf("A","B","C")
    for((index,value) in items.withIndex()){
        println("Index $index has value $value")

    }

    val arr = arrayOf(10,20,30)
        for (num in arr){
            println("Loop array $num")
        }
}