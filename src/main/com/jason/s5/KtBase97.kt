package com.jason.s5

//Kotlin語言的代數數據類型
fun main() {
    println(Teacher(Exam.FRACTION3).show())
    println(Teacher(Exam.FRACTION2).show())
}

enum class Exam {
    FRACTION1,    //分數差
    FRACTION2,    //分數及格
    FRACTION3,    //分數良好
    FRACTION4     //分數優秀
}

class Teacher(private val exam: Exam) {
    fun show(): String {
        /**
         * 不需要加else，因為我們是用枚舉類型Exam來判斷處理的，這就是屬於代數數據類型
         */
        return when(exam) {
            Exam.FRACTION1 -> "該學生分數很差"
            Exam.FRACTION2 -> "該學生分數及格"
            Exam.FRACTION3 -> "該學生分數良好"
            Exam.FRACTION4 -> "該學生分數優秀"
//            else ->
        }
    }
}