package org.example.OOPS_Kotlin

open  class Polymorphism {

    open fun makeSound(){
        println("Koi Awwaz nahi ")
    }
}

class Dog: Polymorphism() {
    override fun makeSound() {
        println(" bark Bark")
    }
}

    class Cat: Polymorphism(){
        override fun makeSound() {
            println("Meow Meow ")
        }
    }

fun main(){
    val dog = Dog()
    dog.makeSound()

    val cat = Cat()
    cat.makeSound()

}


