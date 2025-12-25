package org.example.Revision

open class InheritanceRevision {

    var room =1; var material = "brick"

    open fun describe(){
        println("Parent Class Home is made  of $material and has $room")
    }

}

open class  childClassHouse : InheritanceRevision(){
    init {
        room = 3
        material = "Cement"
    }

    override fun describe() {
        println("childClassHouse")
    }

}