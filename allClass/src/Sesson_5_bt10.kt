enum class UI(val stateName:String,val message : String){
    LOGIN("Màn hình Đăng nhập","try cập thành công màn hình đăng nhập"),
    LIST("Màn Hình Danh sách","try cập thành công màn hình danh sách"),
    SEARCH("Màn Hình Tìm Kiếm","try cập thành công màn hình tìm kiếm")
}
fun ui_State(screenName :String):UI?{
    if(screenName == "login"){
        return UI.LOGIN
    }
    if(screenName == "list"){
        return UI.LIST
    }
    if(screenName == "search"){
        return UI.SEARCH
    }
    return null
}
fun main(){
    print("chọn màn hình LOGIN / LIST / SEARCH : ")
    val screenName : String = readln().trim()
    val result = when(ui_State(screenName)) {
        UI.LOGIN -> println("STATE: ${UI.LOGIN.stateName}"+"\nMESSAGE: ${UI.LOGIN.message}")
        UI.LIST -> println("STATE: ${UI.LIST.stateName}"+"\nMESSAGE: ${UI.LIST.message}")
        UI.SEARCH -> println("STATE: ${UI.SEARCH.stateName}"+"\nMESSAGE: ${UI.SEARCH.message}")
        else -> "Lỗi"
    }
    println(result)
}