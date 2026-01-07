enum class Logout(val message:String) {
    LOGOUT_SUCCESS("Đồng ý đăng xuất"),
    LOGOUT_CANCELLED("Quay Lại")
}
fun validateLogout(logout: String): Logout {
    if(logout == "yes"){
        return Logout.LOGOUT_SUCCESS
    }
    return Logout.LOGOUT_CANCELLED
}
fun main(){
    print("nhập yes/no để đăng xuất: ")
    val option : String = readln()
    val result = when(validateLogout(option)) {
        Logout.LOGOUT_SUCCESS -> Logout.LOGOUT_SUCCESS.message
        Logout.LOGOUT_CANCELLED -> Logout.LOGOUT_CANCELLED.message
    }
    println(result)
}