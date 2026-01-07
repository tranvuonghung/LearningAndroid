enum class Course(val message:String){
    COURSE_LIST_EMPTY("Danh sách khóa học rỗng"),
    COURSE_LIST_SUCCESS("Có Danh Sách Khóa Học")
}
data class ListOfCourses(val courseCode : String, val courseName : String )
fun checkData( list: List<ListOfCourses> ): Course{
    if(list.size > 0 ){
        return Course.COURSE_LIST_SUCCESS
    }
    return Course.COURSE_LIST_EMPTY
}
fun main(){
    val myCourse : List<ListOfCourses> = listOf(
        ListOfCourses("CS201","Lập trình cơ bản"),
        ListOfCourses("CS301","Lập trình hướng đối tượng"),
        ListOfCourses("CS446","cơ sở dữ liệu"),
        ListOfCourses("CS501","thương mại điện tử"),
        ListOfCourses("CS603","Android"),
    )
    val result = when(checkData(myCourse)){
        Course.COURSE_LIST_EMPTY -> Course.COURSE_LIST_EMPTY.message
        Course.COURSE_LIST_SUCCESS -> Course.COURSE_LIST_SUCCESS.message
    }
    println(result)
}