fun main(){
    var result : String
    do{
        println(
            "nhập 1: Màn Hình Đăng Nhập"+
            "\nNhập 2: Kiểm Tra Trạng Thái"+
            "\nNhập 3: Hiển thị Thông báo"+
            "\nNhập 4: Chọn Thử Lại"+
            "\nNhập 0: Thoát"
        )
        val select : Int = readLine()!!.toInt()
        result = when( select ) {
            1 -> "Màn Hình Đăng Nhập"
            2 -> "Kiểm Tra Trạng Thái"
            3 -> "Hiển thị Thông báo"
            4 -> "chọn thử lại"
            0 -> "Thoát"
            else -> "Lỗi"
        }
    }while ( result == "chọn thử lại" )
    println( result )
}