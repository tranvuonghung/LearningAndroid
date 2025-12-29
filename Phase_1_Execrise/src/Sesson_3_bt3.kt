fun main(){
    val students : Map<String, Int> = mapOf("hùng" to 8, "hoàng" to 9, "Hiếu" to 0)
    for((name,point) in students){
        if(point >= 5){
            println(name)
        }
    }
}