fun main(){
    val point : Double = 6.5
    val result = when(point){
        in 0.0..4.0 -> "yếu"
        in 5.1..6.5 -> "trung bình"
        in 6.5..7.9 ->"khá"
        in 8.0..10.0 ->"Giỏi"
        else -> "không hợp lệ"
    }
    println(result)
}