enum class Students(val message: String) {
    STUDENT_LIST_EMPTY("rỗng"),
    STUDENT_LIST_SUCCESS("Có dữ liệu"),
}
data class Student(val name : String, val id_Student : Int)
fun main(){
    val listStudent : List<Student> = listOf(
        Student("hùng",5),
        Student("hiếu",3),
        Student("tài",2),
        Student("thuận",4),
        Student("phú",1),
        Student("thanh",6),
        Student("quân",7),
    )
    val status = if(listStudent.size <= 0) Students.STUDENT_LIST_EMPTY else Students.STUDENT_LIST_SUCCESS
    val result = when(status) {
        Students.STUDENT_LIST_EMPTY -> Students.STUDENT_LIST_EMPTY.message
        Students.STUDENT_LIST_SUCCESS -> Students.STUDENT_LIST_SUCCESS.message
    }
    println(result)
}