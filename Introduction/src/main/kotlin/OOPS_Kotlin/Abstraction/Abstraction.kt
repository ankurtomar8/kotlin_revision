package org.example.OOPS_Kotlin.Abstraction

abstract class  Vehicle{

    abstract fun engine()

    fun horn(){
        println("Peep Peep")
    }

}

class Car: Vehicle(){
    override fun engine() {
        println("Engine of Car")
    }

}

class  Bike: Vehicle(){
    override fun engine() {
      println("Bike Engine ")
    }
}

fun main(){
    val carEngine = Car()
    carEngine.engine()
    carEngine.horn()

    var bike  = Bike()
    bike.engine()
    bike.horn()


}