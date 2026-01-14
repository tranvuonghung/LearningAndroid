enum class CourseListStatus(val message: String) {
    COURCE_LIST_EMPTY("danh sách môn học rỗng"),
    COURCE_LIST_SUCCESS("có dữ liệu danh sách môn học")
}
fun getCourseListStatus(courses: List<Course>): CourseListStatus {
    if(courses.isEmpty()) {
        return CourseListStatus.COURCE_LIST_EMPTY
    }else{
        return CourseListStatus.COURCE_LIST_SUCCESS
    }
}
fun main(){
    val listCourses : List<Course> = listOf(
        Course("CS 306","lập trình cơ sở"),
        Course("CS 302","cơ sở dữ liệu"),
        Course("CS 203","lập trình JAVA, hướng đối tượng"),
        Course("CS 401","android"),
    )
    val result = getCourseListStatus(listCourses)
    println(result.message)
}