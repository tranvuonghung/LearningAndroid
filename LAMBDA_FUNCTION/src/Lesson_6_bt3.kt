data class Student(val id : Int, val name : String, var score: Double = 0.0)
fun main(){
    val student = Student(1,"hungtran").apply { score = 1.0 }
    println("id: ${student.id}, name: ${student.name}, score: ${student.score}")
}