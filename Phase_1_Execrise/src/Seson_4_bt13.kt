fun main(){
    val select : Int = readLine()?.trim()?.toInt() ?:0
    val result = when(select){
        1 -> "Đăng Nhập"
        2 -> "Xem Thông Tin"
        3 -> "Thoát"
        else -> "không hợp lệ"
    }
    println(result)
}