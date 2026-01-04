fun main(){
    val points = listOf(1,2,6,7,5)
    val result = points
        .filter { it >= 5 }
        .map { it * 2 }
        .sum()
    println(result)
}