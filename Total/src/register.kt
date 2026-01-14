enum class RegisterStatus(val message: String) {
    INVALID_INPUT("có trường null/rỗng"),
    PASSWORD_NOT_MATCH("password và confirmPassword khác nhau"),
    EMAIL_EXITS("email đã tồn tại"),
    SUCCESS("Đăng kí Thành Công")
}
fun register(input : RegisterInput, existingEmail: List<String>): RegisterStatus {
   input.email?.let{ email ->
       if (email.isEmpty()) return RegisterStatus.INVALID_INPUT

       input.password?.let{ password ->
           if(password.isEmpty()) return RegisterStatus.INVALID_INPUT

           input.confirmPassword?.let{ confirmPassword ->
               if(confirmPassword.isEmpty()) return RegisterStatus.INVALID_INPUT

               existingEmail.any{ email == it }.also{
                   if(it){
                       return RegisterStatus.EMAIL_EXITS
                   }
               }

               if(password != confirmPassword){
                   return RegisterStatus.PASSWORD_NOT_MATCH
               }

               return RegisterStatus.SUCCESS
           }
       }
   }
    return RegisterStatus.INVALID_INPUT
}
fun main(){
    val listEmail : List<String> = listOf(
        "hungtran@gmail.com",
        "thuantran@gmail",
        "hoanghieu@gmail",
    )
    print("nhập email: ")
    val email : String? = readln()
    print("nhập password: ")
    val password : String? = readln()
    print("nhập lại password: ")
    val confirmPassword : String? = readln()

    val result = register(RegisterInput(email, password,confirmPassword), listEmail)
    println(result.message)
}