enum class DataLoadingStatus(var message: String) {
    DOWNLOAD_SUCCESS("Tải Dữ Liệu Thành Công"),
    DOWNLOAD_TIMEOUT("Hết Thời Gian Tải Dữ Liệu"),
    DOWNLOAD_ERROR("Lỗi Tải Dữ Liệu"),
}
fun download(statusCode: Int) : DataLoadingStatus? {
    if(statusCode == 200) {
        return DataLoadingStatus.DOWNLOAD_SUCCESS
    }
    if(statusCode == 408) {
        return DataLoadingStatus.DOWNLOAD_TIMEOUT
    }
    if(statusCode == 503) {
        return DataLoadingStatus.DOWNLOAD_ERROR
    }
    return null
}
fun main(){
    print("nhập một trong ba server (200,408,503) để tải dữ liệu: ")
    val statusCode : Int = readLine()?.trim()!!.toInt()
    val result = when(download(statusCode)){
        DataLoadingStatus.DOWNLOAD_SUCCESS -> DataLoadingStatus.DOWNLOAD_SUCCESS.message
        DataLoadingStatus.DOWNLOAD_TIMEOUT -> DataLoadingStatus.DOWNLOAD_TIMEOUT.message
        DataLoadingStatus.DOWNLOAD_ERROR -> DataLoadingStatus.DOWNLOAD_ERROR.message
        else -> "Lỗi Internet"
    }
    println(result)
}