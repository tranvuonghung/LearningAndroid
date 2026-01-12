fun passwordStrength(password: String?): String {
    if(password == null) return "NULL"
    if(password.length <= 0){
        return "EMPTY"
    }else if(password.length < 6) {
        return "WEAK"
    }else if(password.length >= 6 && password.length <= 9) {
        return "OK"
    }else{
        return "STRONG"
    }
}
fun main(){
    val pass = passwordStrength("tranvuonghung")
    val result = when(pass){
        "NULL" -> "Chưa Nhập Mật Khẩu"
        "EMPTY" -> "Rỗng"
        "WEAK" -> "Mật Khẩu yếu"
        "OK" -> "Mạnh"
        "STRONG" -> " Siêu Mạnh"
        else -> "Lỗi"
    }
    println(result)
}