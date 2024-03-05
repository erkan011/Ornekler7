package org.example

data class Person(val name: String, val age: Int){
    override fun toString(): String {
        return "name: $name, age: $age)"
    }
}

fun main() {
    val person = Person("Erkan",22)
    println(person.toString())
}