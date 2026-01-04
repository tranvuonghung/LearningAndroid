fun validateLogin(name: String? ,pass : String?):  String{
    val userName : String = "hungtran"
    val password : String = "123456"
    var count = 0
    if(name == null){
        return "null name"
    }
    if(pass == null){
        return "null pass"
    }
    while (count < 3){
        if(name == userName && pass == password){
            return "success"
        }
        count++
        println("đăng nhập sai lần $count")
    }
    return "error"
}
fun main(){
    val userName1 : String? = "Hungtran"
    val password1 : String? = "123456"
    val user1 = validateLogin(userName1, password1)
    val result = when (user1){
        "null name" -> "chưa nhập tên"
        "null pass" -> "chưa nhập mật khẩu"
        "success" -> "đăng nhập thành công"
        "error" -> "tài khoản đã khóa. vì đăng nhập sai 3 lần"
        else -> "không hợp lệ"
    }
    println(result)
}