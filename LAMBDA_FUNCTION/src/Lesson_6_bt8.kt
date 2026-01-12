enum class StatusSearch(val message: String) {
    EMPTY_KEYWORD("keyword null hoặc rỗng"),
    FOUND("có kết quả "),
    NOT_FOUND("không có")
}
fun search(keyword : String?, list : Map<String,Int>, onResult: (StatusSearch) -> Unit ) {
    keyword?.let {
        if(keyword.isEmpty()) {
            onResult(StatusSearch.EMPTY_KEYWORD)
            return
        }
        val status = if(list.containsKey(keyword)) StatusSearch.FOUND else StatusSearch.NOT_FOUND
        onResult(status)
    } ?: onResult(StatusSearch.EMPTY_KEYWORD)
}
fun main(){
    val students : Map<String,Int> = mapOf(
        "hùng" to 3,
        "thuận" to 4,
        "hiếu" to 5,
        "tài" to 6
    )
    print("nhập tên cần tìm: ")
    val searchStudents : String = readln().trim()
    search(searchStudents,students){ statusSearch ->
        print(statusSearch.message)
    }
}