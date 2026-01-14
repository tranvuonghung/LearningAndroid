enum class LoginStatus( val message: String) {
    LOGIN_EMPTY("emai hoặc password rỗng"),
    LOGIN_SUCCESS("đăng nhập thành công"),
    LOGIN_ERROR("đăng nhập thất bại")
}
fun loginTraditional(account: UserAccount?):LoginStatus{
    val email = "hungtran"
    val pass = "123"
    if(account != null) {
        if (account?.email.isNullOrEmpty() || account?.password.isNullOrEmpty()) {
            return LoginStatus.LOGIN_EMPTY
        }
        if (account.email == email && account.password == pass) {
            return LoginStatus.LOGIN_SUCCESS
        }
        return LoginStatus.LOGIN_ERROR
    }
    return LoginStatus.LOGIN_EMPTY
}
fun checkLogin(account: UserAccount?, onResult: (LoginStatus) -> Unit){
    account?.let {
        account.email?.let { email ->
            account.password?.let { pass ->
                val status = when{
                    email.isEmpty() || pass.isEmpty() -> LoginStatus.LOGIN_EMPTY
                    email == "hungtran" && pass == "123" -> LoginStatus.LOGIN_SUCCESS
                    else -> LoginStatus.LOGIN_ERROR
                }
                onResult(status)
            } ?: onResult(LoginStatus.LOGIN_EMPTY)
        } ?: onResult(LoginStatus.LOGIN_EMPTY)
    } ?: onResult(LoginStatus.LOGIN_EMPTY)
}
fun main(){
    print("nhập userName : ")
    val email : String = readln()
    print("nhập password : ")
    val password : String = readln()
    val account = UserAccount(email, password)

    val result1 = loginTraditional(account)
    println(result1.message)

    val result2 = checkLogin(account){ status ->
        println(status.message)
    }
}