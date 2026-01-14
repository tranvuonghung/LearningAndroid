enum class LoginStatus(val message: String) {
    LOGIN_EMPTY("chưa nhập username và password"),
    LOGIN_SUCCESS("đăng nhập thành công"),
    LOGIN_ERROR("sai username hoặc password")
}
fun login(username: String?, password: String?, onResult: (LoginStatus)->Unit){
    username?.let { user ->
        password?.let { pass ->
            val status = when {
                user.isEmpty() || pass.isEmpty() -> LoginStatus.LOGIN_EMPTY
                user == "hungtran" && pass == "123" -> LoginStatus.LOGIN_SUCCESS
                else -> LoginStatus.LOGIN_ERROR
            }
            onResult(status)
            return
        }
    }
    onResult(LoginStatus.LOGIN_EMPTY)
}
fun main(){
    print("nhập username: ")
    val userName : String? = readln()
    print("nhập password: ")
    val password : String? = readln()
    val result = login(userName, password) { status ->
        println(status.message)
    }
}