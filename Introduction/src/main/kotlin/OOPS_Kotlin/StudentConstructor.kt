package org.example.OOPS_Kotlin

class StudentConstructor(var name: String,val rollNumber: Int) {
   var collegeName : String ="Unknown"
    fun introduce(){
        println("My name is $name and rollNumber is $rollNumber  and $collegeName")
    }
    var deptname : String = "Unknown"
    init {
        deptname = deptname.uppercase()
    }

    // Secondary Constructor
    constructor(name: String,rollNumber: Int,collegeName: String)
            : this(name,rollNumber) {
        this.collegeName = collegeName
    }

}

fun main(){
    val ankur = StudentConstructor("Ankur",10)
    ankur.introduce()

    val ankit = StudentConstructor("Ankit",12)
    ankit.introduce()

    val secondConstructor =
        StudentConstructor("base",0,"SVVV")
    secondConstructor.introduce()

    //val initCons = StudentConstructor("Computer Science")


}