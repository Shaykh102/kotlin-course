package org.example.kotlincourse.lesson6

fun main() {
    val intRange: IntRange = 1..10
    val intRangeUntil = 1 until 10
    val downTo = 10 downTo 1
    val charRange: CharRange = 'd'..'r'

    val inRange = 2 in intRange
    val notInRange = 20 !in intRange

    println(notInRange)

    val score = 95
    when  {
        score in 90..100 -> println("Отлично")
        score in 88..89 -> println("Хорошо")
        score in 78..79 -> println("Удовлетворительно")
        else -> println("Нужно подучить")
    }

}