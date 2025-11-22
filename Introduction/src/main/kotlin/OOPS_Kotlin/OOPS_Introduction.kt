package org.example.OOPS_Kotlin

import Student
class NewStudent(var name:String) {

    fun introduce(name: String){
        println("I am my Name is $name")
    }
    fun doingAssignments(){
        println("Student is doing assignment")
    }

}

fun main(){
    var student = Student()
    student.study()
    var studentNew = NewStudent("Ankit")
    studentNew.doingAssignments()
    studentNew.introduce("Ankur")
}


