package org.example.org.kotlincourse.lesson3

class lesson3 {

    val testVal: String = "Some Text"  // unchangable var. Will be determined by function
    var testVar: Int = -100  // changable var
    const val PI: Double = 3.14  // unchangable. global. Simple type. UPPERCASE always
    lateinit var testLateinit: TestUser // late initiliasaion. Var only
    val testLazzy: String by lazy {            // object is initiated when called only
        "Some function to init var"
    }
    var testNullable: Double? = null // ? can be null.overwise cannot
    var testCount: Int = 0           // Variable will be checked for IF condition like a function
        get() = field
        set(value) {
            if (value >= 0) field = value
        }
- Changeble or not?
- Type : String, Int, Double, Boolean?
- Initialised now or later?

}