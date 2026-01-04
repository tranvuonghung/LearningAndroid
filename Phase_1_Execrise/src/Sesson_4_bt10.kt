fun sumProduct( price: Double , quantity : Int): Double {
    return price * quantity
}
fun main(){
    val price: Double = 100.0
    val quantity = 2
    val product = sumProduct(price, quantity)
    println(product)
}