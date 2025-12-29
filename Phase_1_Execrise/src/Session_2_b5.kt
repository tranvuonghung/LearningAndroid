fun main(){
    val phone: String? = null
    val lenght = phone?.length
    println(if (lenght != null && lenght >= 10) "Số hợp lệ" else "Số không hợp lệ")
}