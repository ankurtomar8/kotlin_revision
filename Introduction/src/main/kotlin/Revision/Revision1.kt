package org.example.Revision

import javax.management.relation.Relation

fun main(args: Array<String>) {

    val Name = "Ankur Singh Tomar"
    val age : Int = 10
    val Address : String = "New City Society"
    val isStudent : Boolean = true
    var newChar : Char = 'A'
    println("Name : $Name Age: $age Address: $Address and Student $isStudent char $newChar")
    greetings(Name)
    val num1:Int =  20
    val  num2: Int  = 5
     calculateNumbers(num1,num2)
    RelationOperators(num1,num2)

}

fun calculateNumbers(value1 : Int, value2 : Int){
    println("sum of values  $value1 and $value2  is :  " + "${value1 + value2}" )
    println("Diff of values  $value1 and $value2  is " + "${value1 - value2}" )
    println("Product of values  $value1 and $value2  is : " + "${value1 * value2}" )
    println("Divide of values  $value1 and $value2  is : " + "${value1 / value2}" )
}


fun RelationOperators(value1 : Int, value2 : Int){
    println("Relation operator : " + "${value1 == value2}" )
    println("Relational Operator Greater : " + "${value1 > value2}" )
    println("Relational Operator Less : " + "${value1 < value2}" )
    println("Relational Operator notequals : " + "${value1 != value2}" )
}

fun greetings(name : String){
    println("Hello Good Morning $name")
}