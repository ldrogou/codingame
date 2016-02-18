import math._
import scala.util._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
object Solution extends App {
    val n = readInt // Number of elements which make up the association table.
    val q = readInt // Number Q of file names to be analyzed.
    // ext: file extension
    // mt: MIME type.
    val mapOther=(for(i <- 0 until n) yield {
            val Array(ext, mt) = readLine split " "
            ext.toUpperCase -> mt
        }).toMap
        
    for(i <- 0 until q) {
        val brut = readLine // One file name per line.
        val fname = brut split '.' // One file name per line.
       
        if ((fname.length > 1) && (brut.substring(brut.length -1) != "." )){
            println(mapOther.getOrElse(fname(fname.length - 1).toUpperCase,"UNKNOWN"))
        }else{
            println("UNKNOWN")
        }
        
    }
    
    // Write an action using println
    // To debug: Console.err.println("Debug messages...")
    
    //println("UNKNOWN") // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
}
