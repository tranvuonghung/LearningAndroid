enum class ResultStatus(val message: String) {
    RESULT_INVALID("null, điểm < 0 và điểm > 10"),
    RESULT_PASS("Qua môn"),
    RESULT_FAIL("Rớt môn")
}
fun evaluateScore(score: Double?): ResultStatus {
    score?.run{
        if(score > 10 || score < 0){
            return ResultStatus.RESULT_INVALID
        }
        if(score >= 5){
            return ResultStatus.RESULT_PASS
        }else{
            return ResultStatus.RESULT_FAIL
        }
    }
    return ResultStatus.RESULT_INVALID
}
fun main(){
    print("nhập điểm của bạn: ")
    val score : Double? = readln().trim().toDouble()
    val result = evaluateScore(score)
    println(result.message)
}