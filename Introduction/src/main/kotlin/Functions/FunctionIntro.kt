package org.example.Functions
fun main(){
    addNumber() // simple function
    addNumber(50,60)
    myName("Ankur")
    println(" Sum result returned ${sumResult(20,30)}")
}
fun addNumber(){
    val num1 = 10; val num2 = 20
    println(" sum of $num1 and $num2, is ${ num1 + num2 }")
}
// Parametrized Method overloading
fun addNumber(x: Int, y : Int){
    println("Sum of $x and $y is ${x+y}")
}
// String prinitng
fun myName(str: String){
    println(" My name is $str")
}
// Returning some logic
fun sumResult (x: Int,y: Int) : Int{
    return x + y
}