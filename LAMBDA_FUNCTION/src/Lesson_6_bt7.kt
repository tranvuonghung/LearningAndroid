fun handleList(list: List<Int>, action: (Int) -> Unit) {
    list.forEach{
        action(it)
    }
}
fun main(){
    val listInt = listOf(1,2,3,4,5)
    handleList(listInt){ num ->
        println("số nguyên trong danh sách: ${num}, bình phương ${num*num}")
    }
}
