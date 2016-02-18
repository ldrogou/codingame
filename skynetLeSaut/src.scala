import math._
import scala.util._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
object Player extends App {
    val road = readInt // the length of the road before the gap.
    val gap = readInt // the length of the gap.
    val platform = readInt // the length of the landing platform.

    // game loop
    while(true) {
        val speed = readInt // the motorbike's speed.
        val coordx = readInt // the position on the road of the motorbike.
        
        // Write an action using println
        Console.err.println("Debug road..." + road)
        Console.err.println("Debug gap..." + gap)
        Console.err.println("Debug platform..." + platform)
        Console.err.println("Debug speed..." + speed)
        Console.err.println("Debug coordx..." + coordx)
        if ((coordx + speed) > road && (coordx) < road){
            println("JUMP")
        } else if ((coordx) >= road + gap || (speed - 1> gap && coordx < road)){
            println("SLOW")
        } else if (speed  <= gap){
            println("SPEED") // A single line containing one of 4 keywords: SPEED, SLOW, JUMP, WAIT.    
        } else if ((coordx) <= road + gap){
            println("WAIT")
        }
        
    }
}
