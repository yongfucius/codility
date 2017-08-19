import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(a: Array[Int]): Int = {
        val n = a.length
        val sort = a.sorted
        
        for (i <- 0 until n-2) {
            if (sort(i+1) > sort(i+2) - sort(i)) return 1
        }
        
        0
    }
}
