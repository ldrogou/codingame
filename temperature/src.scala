import math._
import scala.util._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
object Solution extends App {
    val n = readInt // the number of temperatures to analyse
   
    
    var temp: Int = 0
    if (n == 0) temp =0 
    else {
        val temps = for(i <- readLine split " ") yield i.toInt // the n temperatures expressed as integers ranging from -273 to 5526
    
        temp = temps(0)
        for(i <- temps){
            //Console.err.println(i)
            if (math.abs(i) < math.abs(temp)) temp=i 
            if (i * (-1) == temp) temp=math.abs(i) 
        }
        Console.err.println(temp)
    }        
    // Write an action using println
    // To debug: Console.err.println("Debug messages...")
    
    println(temp)
}
