data class Person
    (var name:String, var age:Int , var salar:Double,var creditCard:CreditCard) {
    companion object{
        fun creatPerson( name:String,  age:Int ,  salar:Double, cardNumber:Long): Person{
           return Person(name,age,salar, CreditCard(cardNumber))
        }
    }
}