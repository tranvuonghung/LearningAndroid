data class Student(val id: Int, val name: String, val score : Int)
fun main(){
    val students : List<Student> = listOf(
        Student(1,"An",8),
        Student(2,"Bình",4),
        Student(3,"Chi",6)
    )
    println(students)

    students.forEach {
        println(it.name)
    }

    val result = students.filter{ it.score >= 5 }
    println(result)

    val expect1 = students.any{ it.score < 5 }
    println(if(expect1) "có" else "không")

    val expect2 = students.all{ it.score < 5 }
    println(if(expect2) "có" else "không")

    val findID = students.find{ it.id == 2 }
    println(findID)

    val students2 : Map<Int,Student> = mapOf(
        1 to Student(1,"An",8),
        2 to Student(2,"Bình",4),
        3 to Student(3,"Chi",6)
    )
    for((key, value) in students2){
        if(key == 3){
            println(value)
        }
    }
}