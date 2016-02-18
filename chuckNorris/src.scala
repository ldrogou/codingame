import math._
import scala.util._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
object Solution extends App {
    val message = readLine
    
    Console.err.println("Debug messages..." + message )
    val mapRemp = Map('0'-> "00 ", '1'->"0 ")
    var reponse = ""
    var imoins = ""
    for(i<-message){
      val binString = Integer.toBinaryString(i)
      var resizeBin = binString
      for(j<- binString.length until 7){
        resizeBin = "0" + resizeBin
      }
      for (t<- resizeBin){
        if (imoins != t.toString){
            if (reponse.length>0) reponse += " "
            reponse += mapRemp(t)
            imoins = t.toString
        }
        reponse += "0"
      }
    }
    println(reponse)
}
