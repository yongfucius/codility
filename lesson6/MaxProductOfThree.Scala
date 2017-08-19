import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(a: Array[Int]): Int = {
        val n = a.length
        val sort = a.sorted
        
        val maximum = sort(n-1) * sort(n-2) * sort(n-3)
        val minus = sort(0) * sort(1) * sort(n-1)
        
        maximum max minus
    }
}
