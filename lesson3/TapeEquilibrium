import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(a: Array[Int]): Int = {
        val sum = a.sum
        val n = a.length
        
        var diff = sum - a(n-1)*2
        var result = diff.abs
        
        for (i <- a.length - 2 to 1 by -1) {
            diff -= a(i)*2
            result = result min diff.abs
        }
        
        result
    }
}
