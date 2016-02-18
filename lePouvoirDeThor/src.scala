import math._
import scala.util._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
object Player extends App {
    // lightx: the X position of the light of power
    // lighty: the Y position of the light of power
    // initialtx: Thor's starting X position
    // initialty: Thor's starting Y position
    var Array(lightx, lighty, initialtx, initialty) = for(i <- readLine split " ") yield i.toInt

    
    // game loop
    while(true) {
        val remainingturns = readInt // The remaining amount of turns Thor can move. Do not remove this line.
        
        var retour = ""
        // Write an action using println
        // To debug: Console.err.println("Debug messages...")
        if ((initialty - lighty) > 0){ retour = "N"; initialty -=1}else if ((initialty - lighty) < 0){retour = "S"; initialty +=1}
        if ((initialtx - lightx) > 0){ retour = retour +"W"; initialtx -=1}else if ((initialtx - lightx) < 0){retour = retour +"E"; initialtx +=1}
        
        println(retour) // A single line providing the move to be made: N NE E SE S SW W or NW
    }
}
