enum class Status{
    LOGIN_EMPTY,
    LOGIN_SUCCESS,
    LOGIN_ERROR,
}
fun validateLogin(userName: String?, password: String?): Status{
    val user : String = "hungtran"
    val pass : String = "123456"
    if (userName.isNullOrBlank() || password.isNullOrBlank()){
        return Status.LOGIN_EMPTY
    }
    if (user == userName && pass == password){
        return Status.LOGIN_SUCCESS
    }
    return Status.LOGIN_ERROR
}
fun main(){
    println("nhập tên tài khoản: ")
    val userName: String? = readln()?.trim().toString()
    println("nhập mật khẩu: ")
    val password: String? = readln()?.trim().toString()
    val user1 = validateLogin(userName, password)
    val result = when (user1){
        Status.LOGIN_EMPTY ->  "Chưa Nhập"
        Status.LOGIN_SUCCESS -> "Thành Công"
        Status.LOGIN_ERROR -> "Thất bại"
        else -> "Lỗi"
    }
    println(result)
}