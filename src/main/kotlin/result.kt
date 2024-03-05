package org.example

fun divide(a: Int, b: Int): Int {
    return if (b != 0) {
        a / b
    } else {
        println("Hata: Bölen sıfır olamaz")
        -1 // Bölen sıfır olduğunda -1 döndürülür veya istenilen başka bir değer döndürülebilir
    }
}

fun main() {
    val result1 = divide(10, 2)
    val result2 = divide(10, 0) // Hata oluşturacak bölen sıfır

    println("Sonuç 1: $result1")
    println("Sonuç 2: $result2") // Hata oluşmayacak
}

//fun divide(a: Int, b: Int): Int {
//    return a / b
//}
//
//fun main() {
//    val result1 = divide(10, 2)
//    val result2 = divide(10, 0) // Hata oluşturacak bölen sıfır
//
//    println("Sonuç 1: $result1")
//    println("Sonuç 2: $result2") // Bölme işlemi sırasında hata oluşacak
//}