package org.example.kotlincourse.lesson6

//В каждом задании также нужно валидировать входящие данные, если это имеет смысл.
//Задание 1: "Определение Сезона"
fun main() {
    val month: Int = 1
    when {
        month in 1..2, 12 -> println("Winter")
        month in 3..5 -> println("spring")
        month in 6..8 -> println("Summer")
        month in 9..11 -> println("Autumn")
        else -> println("Unknown month")
    }
}

////Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.
//Задание 2: "Расчет Возраста Питомца"
//Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы. До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.

fun main2() {
    var humAge: Double = 1.0
    var dogAge: Double = 1.0
    if (dogAge < 0) {
        throw IllegalArgumentException("Invalid Dog Age")
    }
    if (humAge < 2) {
        dogAge == 10.5
    } else dogAge = humAge * 4
    prinlt(dogAge)
}

//Задание 3: "Определение Вида Транспорта"
//Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута. Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
fun main3() {
    var distance: Int = 1
    if (distance < 0) {
        throw IllegalArgumentException("Invalid Distance")
    }
    if (distance <= 1) {
        println("Take a walk")
    } else if (distance <= 5) {
        println("Ride a bike")
    } else {
        println("Go by car")
    }
}

//Задание 4: "Расчет Бонусных Баллов"
//Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.

fun main4() {
    var purchase: Int = 1
    var bonusAmount: Int = 1
    if (purchase < 0) {
        throw IllegalArgumentException("Invalid Purchase")
    }
    if (purchase <= 1000) {
        bonusAmount = (purchase / 100 * 2)
    } else {
        bonusAmount = (purchaseAmount  / 100 * 5)
    } println(bonusAmount)
}


//Задание 5: "Определение Типа Документа"
//Контекст: В системе хранения документов каждый файл имеет расширение. Напишите функцию, которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".

fun main4() {
    var purchase: Int = 1
    var bonusAmount: Int = 1
    if (purchase < 0) {
        throw IllegalArgumentException("Invalid Purchase")
    }
    if (purchase <= 1000) {
        bonusAmount = (purchase / 100 * 2)
    } else {
        bonusAmount = (purchaseAmount  / 100 * 5)
    } println(bonusAmount)
}

//Задание 6: "Конвертация Температуры"
//Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую. Возвращать нужно строку.

fun main4() {
    var purchase: Int = 1
    var bonusAmount: Int = 1
    if (purchase < 0) {
        throw IllegalArgumentException("Invalid Purchase")
    }
    if (purchase <= 1000) {
        bonusAmount = (purchase / 100 * 2)
    } else {
        bonusAmount = (purchaseAmount  / 100 * 5)
    } println(bonusAmount)
}

//Подсказка: для генерации строки из числа и буквы можно использовать шалон “$result F” для фаренгейта или “$result C” для цельсия
//Задание 7: "Подбор Одежды по Погоде"
//Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15. При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

fun main4() {
    var purchase: Int = 1
    var bonusAmount: Int = 1
    if (purchase < 0) {
        throw IllegalArgumentException("Invalid Purchase")
    }
    if (purchase <= 1000) {
        bonusAmount = (purchase / 100 * 2)
    } else {
        bonusAmount = (purchaseAmount  / 100 * 5)
    } println(bonusAmount)
}

//Задание 8: "Выбор Фильма по Возрасту"
//Контекст: Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов: "детские", "подростковые", "18+".

fun main4() {
    var purchase: Int = 1
    var bonusAmount: Int = 1
    if (purchase < 0) {
        throw IllegalArgumentException("Invalid Purchase")
    }
    if (purchase <= 1000) {
        bonusAmount = (purchase / 100 * 2)
    } else {
        bonusAmount = (purchaseAmount  / 100 * 5)
    } println(bonusAmount)
}
