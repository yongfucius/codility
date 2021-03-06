import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(n: Int): Int = {
    // write your code in Scala 2.12
    
    val nStr = n.toBinaryString
    
    var result = 0
    var gap = 0
    var findGap = false
    
    for (i <- 1 until nStr.length) {
        if (nStr(i) == '0') gap += 1
        else {
            result = if (gap > result) gap else result
            gap = 0
            
            if (!findGap) findGap = true
        }
    }
    
    if (findGap) result
    else 0
  }
}
