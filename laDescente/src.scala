import math._
import scala.util._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
object Player extends App {

    // game loop
    while(true) {
        
        val Array(spacex, spacey) = for(i <- readLine split " ") yield i.toInt
        
        var tirx: Int=0
        var tiry: Int=0
        
        for(i <- 0 until 8) {
            val mountainh = readInt // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
            
            if (mountainh>tiry){
                tiry=mountainh
                tirx=i
            }
                
        }
        
        // Write an action using println
        // Console.err.println("Debug messages..." + spacex)
        // Console.err.println("Debug messages..." + spacey)
        if (spacex==tirx){
            println("FIRE")    
        } else {
            println("HOLD")
        }
         // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
    }
}
