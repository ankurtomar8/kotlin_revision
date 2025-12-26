package org.example.Revision

class oopsClass{

}

open class Student {
    fun introduce(name: String) {
        println("My name is $name")
    }

    fun doingAssignments() {
        println("Student  is doing assignment ")
    }
}

    fun main() {

        val st = Student()
        st.introduce("Ankur")
        st.doingAssignments()

    }



