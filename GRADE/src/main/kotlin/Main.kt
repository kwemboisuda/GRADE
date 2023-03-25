import Student.Student

fun main(args: Array<String>) {
    println("Hello World!")


        val student1 = Student("John", "Doe", 85)
        val student2 = Student("Jane", "Smith", 70)
        val student3 = Student("Bob", "Johnson", 95)

        println("Grades:")
        println("${student1.firstName} ${student1.lastName}: ${student1.getGrade()}")
        println("${student2.firstName} ${student2.lastName}: ${student2.getGrade()}")
        println("${student3.firstName} ${student3.lastName}: ${student3.getGrade()}")



    }

