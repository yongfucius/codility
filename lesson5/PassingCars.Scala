import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(a: Array[Int]): Int = {
        val n = a.length
        
        var east = 0
        
        var result = 0
        for (i <- 0 until n) {
            val car = a(i)
            
            if (car == 0) {
                east += 1
            } else {
                result += east
            }
            
            if (result > 1000000000) return -1
        }
        
        result
    }
}
