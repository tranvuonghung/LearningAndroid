enum class SearchData(val message:String){
    SEARCH_SUCCESS("có kết quả "),
    SEARCH_NO_RESULT("không có kết quả")
}

data class ExtraEnglish(val keyword : String?,val name : String?)

fun search(searchId: String?,list : List<ExtraEnglish>): SearchData?{

    if(searchId.isNullOrBlank()) return null

    list.forEach {
        if(it.keyword.isNullOrBlank()){
            return@forEach
        }
        if(it.keyword == searchId){
            return SearchData.SEARCH_SUCCESS
        }
    }
    return SearchData.SEARCH_NO_RESULT
}

fun main(){
    val listExtraEnglish : List<ExtraEnglish> = listOf(
        ExtraEnglish(null,"hùng"),
        ExtraEnglish("abs7","hiếu"),
        ExtraEnglish("abs8","thuận"),
        ExtraEnglish("abs3","Tài"),
    )
    val searchKeyword : String = readln()
    val result = when(search(searchKeyword,listExtraEnglish)) {
        SearchData.SEARCH_SUCCESS -> SearchData.SEARCH_SUCCESS.message
        SearchData.SEARCH_NO_RESULT -> SearchData.SEARCH_NO_RESULT.message
        else -> "keyword rỗng"
    }
    println(result)
}