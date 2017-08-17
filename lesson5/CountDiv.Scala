import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(a: Int, b: Int, k: Int): Int = {
        // write your code in Scala 2.12
        
        var result = 0
        val first = if (a % k == 0) a else (a / k + 1) * k
        if (first <= b) {
            result += 1
            result += (b - first) / k
        }
        
        result
    }
}
