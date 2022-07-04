package com.jason.s5

//Kotlin語言密封類sealed的學習
fun main() {
    println(Teachers(Exams.FRACTION1).show())
    println(Teachers(Exams.FRACTION2).show())
    println(Teachers(Exams.FRACTION3).show())
    println(Teachers(Exams.FRACTION4("Jason")).show())

    /**
     * true，因為是對象引用並且Exams.FRACTION1是單例的(object)
     */
    println(Exams.FRACTION1 === Exams.FRACTION1)

    /**
     * false，不是單例的
     */
    println(Exams.FRACTION4("aaa") === Exams.FRACTION4("aaa"))
}

/**
 * 密封類，成員必須有類型，並且繼承本類
 * object表示單例
 */
sealed class Exams {
    object FRACTION1: Exams()    //分數差
    object FRACTION2: Exams()    //分數及格
    object FRACTION3: Exams()    //分數良好

    /**
     * 構造函數有參數需要用class，不能用object，因為object是單例的(不合理)
     */
    class FRACTION4(val studentName: String): Exams()     //分數優秀
}

class Teachers(private val exam: Exams) {
    fun show(): String {
        return when(exam) {
            is Exams.FRACTION1 -> "該學生分數很差"
            is Exams.FRACTION2 -> "該學生分數及格"
            is Exams.FRACTION3 -> "該學生分數良好"
            is Exams.FRACTION4 -> "該學生分數優秀，該學生的姓名是：${this.exam.studentName}"
        }
    }
}


