package org.example

fun main() {
    var name: String? ="Erkan"
    var age: Int? = null
    if (age != null){
        println("$name is $age years old.")
    }else{
        println("Yaş Bilgisi Bulunamadı")
    }
    name = null
    age = 22
    println("Kullanıcı Adı: $name, Yaş : $age")
}