enum class CheckScore(val message : String){
    RESULT_PASS("Vượt Qua"),
    RESULT_PAIL("Rớt"),
    RESULT_INVALID("Không hợp lệ")
}
fun checkScore(score: Double): CheckScore {
    if(score < 0 || score > 10){
        return CheckScore.RESULT_INVALID
    }
    if(score >= 5){
        return CheckScore.RESULT_PASS
    }
    return CheckScore.RESULT_PAIL
}
fun main(){
    print("nhập điểm: ")
    val point : Double = readLine()?.trim()!!.toDouble()
    val result = when(checkScore(point)){
        CheckScore.RESULT_PAIL -> CheckScore.RESULT_PAIL.message
        CheckScore.RESULT_INVALID -> CheckScore.RESULT_INVALID.message
        CheckScore.RESULT_PASS -> CheckScore.RESULT_PASS.message
    }
    println(result)
}