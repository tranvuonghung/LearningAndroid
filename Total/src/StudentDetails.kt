enum class StudentDetailStatus(val message: String) {
    DETAIL_FOUND("tìm thấy sinh viên"),
    DETAIL_NOT_FOUND("không tìm thấy sinh viên")
}
fun findStudentDetail(students: List<Student>, idCanTim: Int, onResult: (StudentDetailStatus,Student?) -> Unit){
    val result = students.find{ it.id == idCanTim }
    val status = when{
        result == null -> StudentDetailStatus.DETAIL_NOT_FOUND
        else -> StudentDetailStatus.DETAIL_FOUND
    }
    onResult(status,result)
}
fun main(){
    val listStudent: List<Student> = listOf(
        Student(3,"hùng",3.0),
        Student(4,"thuận",5.0),
        Student(5,"hiếu",7.0),
        Student(6,"Tài",9.0),
    )
    print("nhập id cần tìm: ")
    val idCanTim: Int = readln().trim().toInt()
    findStudentDetail(listStudent,idCanTim){ status,student->
        println(status.message)
        student?.let{
            println("id: ${it.id}")
            println("tên: ${it.name}")
            println("score: ${it.score}")
        }
    }

}