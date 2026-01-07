enum class SearchStudents(val message: String) {
    DETAIL_FOUND("Tìm thấy sinh viên"),
    DETAIL_NOT_FOUND("Không Tìm Thấy")
}
fun search(search: Int?, list: List<Student>):SearchStudents{
    list.forEach {
        if(search == it.id_Student){
            return SearchStudents.DETAIL_FOUND
        }
    }
    return SearchStudents.DETAIL_NOT_FOUND
}
fun main(){
    val listStudent: List<Student> = listOf(
        Student("hùng",5),
        Student("hiếu",3),
        Student("tài",2),
        Student("thuận",4),
        Student("phú",1),
        Student("thanh",6),
        Student("quân",7),
    )
    println("Nhập id sinh viên cần tìm: ")
    val search : Int = readln().trim().toInt()
    val result = when(search(search,listStudent)){
        SearchStudents.DETAIL_FOUND -> SearchStudents.DETAIL_FOUND.message
        SearchStudents.DETAIL_NOT_FOUND -> SearchStudents.DETAIL_NOT_FOUND.message
    }
    println(result)
}