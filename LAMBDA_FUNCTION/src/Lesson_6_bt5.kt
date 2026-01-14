fun main(){
    val listStudens = mutableListOf<Student>()
    println("nhập số lượng sinh viên: ")
    val n : Int = readln().trim().toInt()

    for (i in (0..n-1)) {
        println("sinh viên thứ ${i+1}: ")
        print("nhập id sinh viên: ")
        val id: Int = readln().trim().toInt()
        print("nhập tên sinh viên: ")
        val name : String = readln().trim()
        print("nhập điểm sinh viên: ")
        var score : Double = readln().trim().toDouble()

        val student = Student(id,name,score)
        listStudens.add(student)
    }

    listStudens.also {
        println("Danh sách đã được tạo, số lượng = ${ it.size }")
    }.forEach {
        println(it.name)
    }
}