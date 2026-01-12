enum class StudyResult(val message: String) {
    SCORE_INVALID("điểm ko hợp lệ"),
    SCORE_PASS("qua môn"),
    SCORE_PAIL("rớt")
}
fun checkScore(score : Double?, onResult : (StudyResult) -> Unit) {
    score?.run{
        if(score >= 5.0){
            onResult(StudyResult.SCORE_PASS)
        }else{
            onResult(StudyResult.SCORE_PAIL)
        }

    } ?: onResult(StudyResult.SCORE_INVALID)
}
fun main(){
    val score : Double? = readln().trim().toDouble()
    checkScore(score) { status ->
        println(status.message)
    }
}