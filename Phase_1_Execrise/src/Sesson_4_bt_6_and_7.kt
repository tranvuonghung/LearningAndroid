data class User(val name: String, val age: Int, var status: Boolean)
fun main(){
    val user : List<User> = listOf(
        User("hùng",30,true),
        User("Hiếu",18,true),
        User("Thuận",21,false),
    )
    user.forEach {
        println( if(it.status) "hoạt dộng, ${it.name}, ${it.age}" else "không hoạt động, ${it.name}, ${it.age}" )
    }

    println("hiển thị những người hoạt động")

    val result = user.filter { it.status }
    result.forEach {
        println( if(it.status) "hoạt dộng, ${it.name}, ${it.age}" else "không hoạt động, ${it.name}, ${it.age}" )
    }
}
