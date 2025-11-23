package org.example.OOPS_Kotlin.Encapsulation

class BankAccount {

    private   var balance: Double =  0.0

        get() {
            return field
        }
        set(value) {
            if (value >= 0){
                field = value
            }else{
                throw IllegalArgumentException("Balance cannot be negative")
            }
        }

    private   var accountHolder : String = ""
        get() {
            return  field.uppercase()
        }
        set(value) {
            if(value.isNotEmpty()){
                field = value
            }else{
                field = "Unknown"
            }
        }

    fun deposit(amount: Int){
        require(amount > 0){  "Deposit must be positive "
        }
        balance += amount
        println("Depositied $amount New Balance : $balance")
    }
}

fun main(){
    val accountHolder = BankAccount()
    accountHolder.deposit(500)
    accountHolder.deposit(200)

}

