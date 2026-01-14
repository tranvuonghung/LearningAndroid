fun main(){
    val students = Student(1,"hung",3.5)
    with(students){
        println("id: ${id}")
        println("name: ${name}")
        println("score: ${score}")
    }
}