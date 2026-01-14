enum class StudentListStatus(val message: String) {
    STUDENT_LIST_EMPTY("danh sách rỗng"),
    STUDENT_LIST_SUCCESS("có dữ liệu")
}
fun getStudentListStatus(students: List<Student>): StudentListStatus {
    if(students.size >= 1 ) return StudentListStatus.STUDENT_LIST_SUCCESS
    return StudentListStatus.STUDENT_LIST_EMPTY
}
fun showStudents(students: List<Student>) {
    with(students) {
        students.forEach {
            println("id: ${it.id}")
            println("name: ${it.name}")
            println("score: ${it.score}\n")
        }
    }.also{
        println("kích thước danh sách: ${students.size}")
    }
}
fun main(){
    val listStudents : MutableList<Student> = mutableListOf()
    print("nhập số lượng sinh viên: ")
    var n: Int = readln().trim().toInt()

    for(i in 0..(n-1)){
        println("\nnhập sinh viên thứ ${i+1}: ")
        print("nhập id sinh viên: ")
        val id : Int = readln().trim().toInt()

        print("nhập tên sinh viên: ")
        val name : String = readln().trim()

        print("nhập điểm sinh viên: ")
        val score : Double = readln().trim().toDouble()

        val student = Student(id, name, score)
        listStudents.add(student)
        println()
    }

    val result = getStudentListStatus(listStudents)
    println("dữ liệu bên trong danh sách: ${result.message}\n")

    println("hiển thị danh sách sinh viên: ")
    showStudents(listStudents)
}