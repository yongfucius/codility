import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(x: Int, y: Int, d: Int): Int = {
        // write your code in Scala 2.12
        
        var len = y - x
        
        if (len % d == 0) len / d else len / d + 1
    }
}
