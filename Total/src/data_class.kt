data class UserAccount(val email: String?, val password: String?)
data class Student(val id: Int, val name : String, var score : Double)
data class Course(val courseCode: String, val courseName: String)
data class RegisterInput(val email : String?, val password : String?, val confirmPassword : String?)