package org.example.org.kotlincourse.lesson3

import java.util.Date

class homework {
    // Название мероприятия
    const val EVENTITLE: String = "Hackaton 2024" // название неизменное, глобальное, невычисляемое

    // Дата проведения
    var startdate: String =
        " February 22 2024" // дата неизменная, может быть экстренный перенос!! лучше бы подошел тип даты

    // Место проведения
    var eventlocation: String = "Moscow , Arbat , 1" // адрес  неизменный, но может быть определен позже. невычисляемое

    //Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
    var eventbudgetdetailed: Float = 1.0F // Бюджет точный, изменяемый, может сложно считаться из составляющих


    //Количество участников
    var participantsamount: Int = 0 // изменяемое число

    //Длительность хакатона
    var eventduration: Long = 0 // изменяемое число в часах

    // Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
    private lateinit var vendorcontacts: String // может занимать много места и вызывается в редких случаях

    //Текущее состояние хакатона (статус)
    var eventstatus: String = "live"
        get() = field
        set(value) {
            if (today < StartDate) field = value
        }

    //Список спонсоров
    var sponsorlist: String = "VK, MTS " // изменяемый список

    //Бюджет мероприятия
    var eventbudget: Int = 100 //целочисленное изменяемое число

    //Текущий уровень доступа к интернету
    var internetaccess: String? = "low "
        get() = field
        set(value) {
            if (InternetSpeed < 10) field = value
        }

    // Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
    private var vendordetails: String = " Equipment"// список изменяемый в режиме реального времени и много весит

    //Количество команд
    var teamsamount: Int = 1  //целочисленное изменяемое число

    // Перечень задач
    var tasksList: String = "task1, task2 "// изменяемый список, известен заранее

    //План эвакуации
    const val EVACPLAN: String = "https://hackaton/evacplan.com" // неизменяемый список

    //Список доступного оборудования
    var equipmentList: String = "Chair,monitor,laptop..."// изменяемый список

    //Список свободного оборудования
    var equipmentavailable: String = "laptop"
        get() = field
        set(value) {
            if ("код проверяет,что оборудование есть в доступном") field = value
        }

    //График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
    var feedterms: String = "Monday 11-12" // изменяемый список

    //План мероприятий на случай сбоев
    val planB: String by lazy {
        " In case Plan A is ruined"
    }

    //Список экспертов и жюри
    var expertlist: String = "Expert1,Expert2" // изменяемый список


    //Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
    var feedbacklist: String = "Polls,interviews" by lazy

    //Политика конфиденциальности
    const val confidentialPolicy: String = "https://hackaton/privatepolicy"  // неизменная глобальная

    //Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
    private var privateFeedback: String = " list of feedback"// изменяемый список

    //Текущая температура в помещении
    var currentTemperature: Double = 25.1
        get() = field
        set(value) {
            if (CurrentTemperature > 0) field = value
        }

    //Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
    private var performanceMonitoring: String = "Memory:10%" // изменяемый список

    //Уровень освещения
    var lightLevel: Int = 80 //% освещенности, переменная

    //Лог событий мероприятия
   private var eventlog: String = "00:00 - Start"

    //Доступность медицинской помощи
    var medicalAvailability: Boolean = true
        get() = field
        set(value) {
            if (DoctorsCheckedIn = true) field = value
        }

    //Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
  private val emergerncyplan: String = " Emergency exit"

    //Регистрационный номер мероприятия
    val eventregistrynumber: Int = 0

    //Максимально допустимый уровень шума в помещении хакатона.
    val maxNoiselevel: Int = 50

    // Индикатор превышения уровня шума в помещениях
    var noiselevelindicator: Boolean = false
        get() = field
        set(value) {
            if (NoiseLevel > MaxNoiseLevel) field = value
        }

    //Формат мероприятия (зависит от геополитической обстановки)
    var eventformat: String = "Online"
        get() = field
        set(value) {
            if (dangerousstate) field = value
        }

    //Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
    var availableseats: Int = 1
        get() = field
        set(value) {
            if (Seats > 0) field = value
        }

    //План взаимодействия с прессой
    val mediaplan: String = "Inteviews and press releases"

    //  Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
    lateinit var teamsprojects: String = "Completion level - 100%"

    //Статус получения всех необходимых разрешений
    var permissionsstatus: Boolean = true

    //Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
    var excusiveaccess: Boolean = true

    //Список партнеров мероприятия
    var partnerlist: String = "RenTV"

    //Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
    var finalreport: String by lazy {
        if (EventStatus == "over")
    }

    //План распределения призов
    var prisepool: String = " Prise 1 goes to "

    //Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
    const val EMERGENCYLIST: String = "112"


    //Особые условия для участников с ограниченными возможностями
    val speacialconditions: String = "Speacial seats"

    //Общее настроение участников (определяется опросами)
    lateinit var overallmood: String = "Good"

    //Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
    var detailedplan: String by lazy {
        if (date = today - 1)
    }

    //Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
    var guestname: String = "V.Buterin"
        get() = field
        set(value) {
            if (date = today - 1) field = value
        }

    //Максимальное количество людей, которое может вместить место проведения.
    val maxcapacity: Int = 100500

    //Стандартное количество часов, отведенное каждой команде для работы над проектом.
    var workhours: Int = 10

    //Текущая температура в помещении
    var currenttemperature: Double = 25.1
        get() = field
        set(value) {
            if (CurrentTemperature > 0) field = value
        }

}