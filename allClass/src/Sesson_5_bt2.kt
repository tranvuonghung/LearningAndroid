enum class StatusRegister{
    INVALID_INPUT,
    PASSWORD_NOT_MATCH,
    EMAIL_EXIST,
    SUCCESS
}
fun register(email: String?, password: String?, confirmPassword: String?): StatusRegister{
    val userEmail: String = "hungtran@gmail.com"
    if(email.isNullOrEmpty() || password.isNullOrEmpty() || confirmPassword.isNullOrEmpty()){
        return StatusRegister.INVALID_INPUT
    }
    if(password != confirmPassword){
        return StatusRegister.PASSWORD_NOT_MATCH
    }
    if(userEmail == email){
        return StatusRegister.EMAIL_EXIST
    }
    return StatusRegister.SUCCESS
}
fun main(){
    println("nhập email: ")
    val email: String = readln()
    println("nhập Mật khẩu: ")
    val password: String = readln()
    println("nhập lại mật khẩu: ")
    val confirmPassword: String = readln()
    val user1 = register(email, password, confirmPassword)
    val result = when(user1){
        StatusRegister.INVALID_INPUT -> "Có trường chưa nhập"
        StatusRegister.EMAIL_EXIST -> "email đã tồn tại"
        StatusRegister.PASSWORD_NOT_MATCH -> "Xác thực mật khẩu sai"
        StatusRegister.SUCCESS -> "Thành Công"
        else -> "Không Xác Định"
    }
    println(result)
}