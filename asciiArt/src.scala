import math._
import scala.util._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
object Solution extends App {
    val l = readInt
    val h = readInt
    val t = readLine
    
    Console.err.println("Debug messages..." + l)
    Console.err.println("Debug messages..." + h)
    Console.err.println("Debug messages..." + t)
    val alpha = (for(i<-65 to 91) yield i.toChar ->(i-65)*l) toMap
    val chaineChar = t.toUpperCase().toCharArray
    
    val listChar = for(i <- 0 until h) yield readLine
    //Console.err.println(listChar(0))   
    
    for(i <- 0 until h) {
    var ligneImp = ""
        for(j <- 0 until t.length()) {
        
            //Console.err.println("Debug messages..." + listChar(i))
            val aTrouver = chaineChar(j)
            //Console.err.println(j)
            //Console.err.println(chaineChar(j))
            ligneImp += listChar(i).substring(
                                        alpha.getOrElse(aTrouver,alpha('[')),
                                        alpha.getOrElse(aTrouver,alpha('['))+l
                                    )
        }
        println(ligneImp)
    }
    // Write an action using println
    // To debug: Console.err.println("Debug messages...")
    
}
