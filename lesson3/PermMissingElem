import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(a: Array[Int]): Int = {
        // write your code in Scala 2.12
        
        val n = a.length
        val l: Long = n + 1
        
        var sum = (n+1) * (1 + l) / 2
        
        a.foreach(i => sum -= i)
        
        sum.toInt
    }
}
