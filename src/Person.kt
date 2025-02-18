data class Person
    (var name: String, var age: Int, var salar: Double, var creditCards: MutableList<CreditCard>) {
    companion object {
        fun creatPerson(name: String, age: Int, salar: Double, creditCards: MutableList<CreditCard>): Person {
            return Person(name, age, salar, creditCards)
        }
    }
}