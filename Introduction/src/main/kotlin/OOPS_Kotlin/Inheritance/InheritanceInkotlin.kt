package org.example.OOPS_Kotlin.Inheritance

open class InheritanceInkotlin {
    var room = 1 ; var material = "brick"

    open fun describe(){
        println("Parent Class Home is made of $material and has $room ")
    }

}

open class subClass : InheritanceInkotlin(){
    init {
        room = 3
        material = "Cement"
    }

    override fun describe(){
        println("SubClass Home is made of $material and has $room ")
    }
}
class childClass(val types: String): subClass(){
    var type = types
    init {
        room = 5
    }

    override fun describe() {
        super.describe()
        println("Child Class Home is made of $material and has $room ")
    }
}

fun main(){

    // grandfather
    val inheritanceClass = InheritanceInkotlin()
    inheritanceClass.describe()
    //Parent
    val parent = subClass()
    parent.describe()

    // Child
    val  childClass = childClass("Modern")
    childClass.describe()
}