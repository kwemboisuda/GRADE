package Student

class Student(val firstName: String, val lastName: String, val examScore: Int) {
    fun getGrade(): String {
        return when (examScore) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }
    }
}