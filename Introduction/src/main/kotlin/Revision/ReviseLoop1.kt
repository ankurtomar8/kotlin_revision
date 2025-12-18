package org.example.Revision

fun main(){
    // for loops in kotlin

    for( i in 1..5)
    {
        print(i)
    }
    val arr = arrayOf(1,2,3,4,5,7,6,9,31,763,24)
    for( i in arr){
       // print("   $i")
        arr.sort()
        print("  $i")
    }

  var names = listOf("Ankur","Ankit","Neha")
    for(name in names ){
        println("\n"+"$name")
    }

    var battery = 5
    while( battery > 0){
        println("$battery  battery is draining ")
        battery--
    }


}