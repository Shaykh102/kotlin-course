package org.example.kotlincourse.lesson5

/* Задание выполняется в текстовом файле.Вычисли результат выражений

 Простой уровень
(12 / 3 > 3) && (5 * 2 == 10)   //true && true = true
(14 - 4 <= 10) || (6 / 2 != 3)   //true || false = true
(9 + 1 == 10) && (8 % 2 == 0)    //True && true = true
(7 - 2 < 5) || (4 * 3 != 12)     // false ||false = false
(18 / 6 >= 3) && (5 + 5 == 10)   // true && true = true
(11 % 3 != 2) || (9 - 3 == 6)    // false || true = true
(5 * 2 < 11) && (14 / 2 == 7)    // true && true = true.
(8 + 2 <= 10) || (7 % 2 != 1)    // true || false = true.
(16 / 4 > 3) && (3 + 4 == 7)      //true && true = true.
(10 % 2 == 0) || (5 - 3 != 1)     // true || true = true.


Сложный уровень
        ((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1)   //true && false  || false = false
((14 - 5) > 8) || (9 / 3 == 3) && !(7 + 0 != 7)            //true || false  = true
((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0)            //  true && true = true
((5 * 3) != 15) && !(10 / 2 > 4) || (4 + 4 == 8)            //false && || true = true
((12 / 4) >= 3) || (7 % 2 != 1) && !(3 + 3 == 6)            //true || false && true = true


 Продвинутый уровень

var f = 6; --f >= 5) || ((3 * 2 == 6) && (9-4 != 5))         //true || true && false = true
((
var g = 0; g++ != 0) && (4+2 == 6)) || (5 / 1 == 5)          // false && true|| true = true
(
var h = 7; h-- > 6) || (8+1 == 9) && (3 % 2 != 1)           //true || true && false = true
((
var i = 5; i++ == 5) || (2 * 2 != 4)) && (10 / 2 == 5)        //true || true && false = true
(
var j = 4; j-- < 4) && ((6+0 == 6) || (5 % 2 != 1))        // false && false  = false

Оператор элвиса

        Задание выполняется в виде функций, принимающих один или более аргументов. Все функции должны быть вызваны из функции main() в вариантах с null и с вещественным значением.

======

Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение начальной интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.
====== */

fun main() {
    val startingIntens: Double = 100.0
    val slowCoef: Double? = null
    val finalIntens = slowCoef ?: 0.5

   // return startingIntens * slowCoef

    println(finalIntens)
}


/*Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет 0, 5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
Задача: Рассчитать полную стоимость доставки.
=====*/

fun main2() {
    var insurance: Double = 0.05
    val cargoCost: Double? = null
    var finalCost: Double? = 1.0

    if (cargoCost == null) {
        insurance = 50.0
    } else finalCost = (cargoCost + cargoCost * insurance)
    println(finalCost)
}

/*Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление, которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять. Задача-сообщить об ошибке в случае отсутствия показаний атмосферного давления.*/

fun atmosphere() {val atmosphericPressure: Double? = null

val validPressure = 1013.25
    fun checkAtmosphericPressure(pressure: Double?) {
        if (pressure == null) {
            println("Ошибка: отсутствуют показания атмосферного давления.")
        } else {
            println("Атмосферное давление зафиксировано: $pressure гПа.")
        }
    }
}