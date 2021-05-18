fun main() {
    Book("mazida","Kamau",3)
    Book()
    square()


}


data class Book(val Title:String, val Author:String,val pages:Int){
    var booksarray= arrayOf("mazida","lulumi","Kamalini")
    var sort=booksarray.sorted()
}
fun square(){
 var y=1
  do{
   if (y*y)
       print(y)
   }

    while (y>=3000)
    println(square())



open class Truck(val registration:String,val totalWeight:Int,val capacity:Int){
   fun load(weight:Int){
   var load=totalWeight+capacity
      println(load)
   }
   fun unloaded(weight: Int){
 var unloaded=totalWeight-capacity
       println(unloaded)
   }
    fun weightCheck(){

  }
}
class Trailer(registration, totalWeight,capacity):Trailer(val registration:String,val totalWeight=Int,val capacity:Int,val wheels:Int){

}











