fun main() {
    val numbers : List<Int> = listOf(1,2,3,4,5,6)
    for(number in numbers){
        if(number % 2 == 0 ){
            println("$number : nhân dôi "+number*2)
        }
    }
}