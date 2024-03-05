package org.example

fun main() {
    val name: String? = null
    // ?. operatörü, name değişkeni null değilse uzunluğunu alır, null ise null döndürür
    val length = name?.length

    println("name length: $length")
}

//fun main() {
    // Null olan bir değişkene işlem uygulanmaya çalışılıyor
    //var name: String? = null

    // Bu satırda NPE hatası oluşacak
    // val length = name.length

   // println("Name length: $length")}
