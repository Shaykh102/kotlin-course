import com.sun.org.apache.xpath.internal.operations.Bool
import java.lang.IllegalArgumentException

val myInt?: null
val myFloat: Float = 0.1F
val myLong: Long = 156L
val myShort: Short =
val myByte: Byte =
val my Double:Double =
val myBool: Boolean: true
val letter: Char = 'A'

val numbers: Array<Int>= arrayof(1, 2, 3)  //набор из данных
val strings: MutableList<String> = mutableListof("one", "two")
val double: Set<Double> = setOf(23.3, 24.5)

val keyToValues: Map<String, String> = mapOf(  // словари
    "ключ1" to "значение2"
)

val anything: Any = 5.2F// что угодно

val unit: Unit =
    funprintMessages(messages:String) {
        print(message)    }// типа нет, например функция,которая ничего не возвращает
fun fail(message:String):Nothing{
    throw IllegalArgumentException(message)
}