data class Product(val price: Double, val quantity: Int)
fun main(){
    val products : List<Product> = listOf(
        Product(100.0, 2),
        Product(3.0, 4),
        Product(2.0, 5),
        Product(3.0, 7),
    )
    val result = products.map { it.price + (it.price*0.1) }
    println(result)
}