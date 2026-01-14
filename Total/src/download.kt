enum class DownloadStatus(val message: String) {
    DOWNLOAD_SUCCESS("tải dữ liệu thành công"),
    DOWNLOAD_TIMEOUT("hết thời gian tải dữ liệu"),
    DOWNLOAD_ERROR("tải dữ liệu thất bại"),
    NETWORK_ERROR("mạng internet yếu, Lỗi tải dữ liệu!!!")
}
fun download(statusCode: Int?, onResult: (DownloadStatus) -> Unit) {
    statusCode?.let {
        val status = when{
            statusCode == 200 -> DownloadStatus.DOWNLOAD_SUCCESS
            statusCode == 408 -> DownloadStatus.DOWNLOAD_TIMEOUT
            statusCode == 503 -> DownloadStatus.DOWNLOAD_ERROR
            else -> DownloadStatus.NETWORK_ERROR
        }
        return onResult(status)
    }
    onResult(DownloadStatus.NETWORK_ERROR)
}
fun main(){
    print("nhập 200 / 408 / 503 để tải dữ liệu: ")
    val download : Int? = readln().toIntOrNull()
    download(download){ status ->
        println(status.message)
    }

}