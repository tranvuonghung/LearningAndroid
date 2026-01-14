enum class UserNameStatus(val message: String) {
    USERNAME_EMPTY("username rỗng")
}
fun checkUserName(userName: String?, onResult: (String) -> Unit) {
    userName?.let { user ->
        onResult(user.length.toString())
    }
    onResult(UserNameStatus.USERNAME_EMPTY.message)
}
fun main(){
    val username : String? = null
    checkUserName(username) { status ->
        println(status)
    }
}