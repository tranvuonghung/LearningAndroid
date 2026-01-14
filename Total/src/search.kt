enum class SearchStatus(val message: String) {
    EMPTY_KEYWORD("keyword null hoặc rỗng"),
    SEARCH_SUCCESS("có kết quả"),
    SEARCH_NO_RESULT("không tìm thấy")
}
fun search(keyword: String?,items: List<String>, onResult: (SearchStatus) -> Unit) {
    keyword?.let {
        if(keyword.isEmpty()) {
            return onResult(SearchStatus.EMPTY_KEYWORD)
        }
        items.any{it == keyword}.also{
            if(it){
                return onResult(SearchStatus.SEARCH_SUCCESS)
            }else{
                return onResult(SearchStatus.SEARCH_NO_RESULT)
            }
        }
    }
    return onResult(SearchStatus.EMPTY_KEYWORD)
}
fun main(){
    val listName : List<String> = listOf("hung", "thuan", "hieu","tai","thanh","quan","phu")
    print("nhập tên cần tìm: ")
    val keyword : String? = readln()
    search(keyword,listName){ status->
        println(status.message)
    }
}