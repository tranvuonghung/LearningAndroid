fun main(){
    val names: List<String?> = listOf("an",null,"hùng","thuận")
    names.forEach{
        if(it != null){
            println("it: "+ it.uppercase())
        }
    }
    val result = names
        .filter{ it != null && it.length > 0 }
        .map{ it?.uppercase() }
    println(result)

    val expect = names
        .find{ it != null && it.length > 2 }
    println(expect)
}
