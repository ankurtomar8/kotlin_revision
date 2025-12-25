package org.example.Revision

open class InheritanceRevision {

    var room =1; var material = "brick"

    open fun describe(){
        println("Parent Class Home is made  of $material and has $room")
    }

}

open class  child1 : InheritanceRevision(){
    init {
        room = 3
        material = "Cement"
    }

    override fun describe() {
        println("childClassHouse")
    }

}

open class child2(val types: String) : child1(){
    var type = types

    init {
        room = 5
    }

    override fun describe() {
        super.describe()
        println("Child Class Home is made of  $material and has $room")
     }
}

fun main(){
    //
    val inheritanceClass = InheritanceRevision()
    inheritanceClass.describe()

    val Parent = child1()
    Parent.describe()

    val childClass = child2("Modern")
    childClass.describe()

}