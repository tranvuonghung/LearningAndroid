fun main(){
    println("nhập ngày trong tuần từ 1 đến 7 : ")
    val dayOfWeek : Int = readLine()?.trim()?.toInt() ?: 0
    val result = when(dayOfWeek){
        1 -> "thứ hai"
        2 -> "thứ ba"
        3 -> "thứ tư"
        4 -> "thứ năm"
        5 -> "thứ sáu"
        6 -> "thứ bảy"
        7 -> "Chủ nhật"
        else -> "không hợp lệ"
    }
    println(result)
}