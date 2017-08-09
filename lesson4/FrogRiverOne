import scala.collection.JavaConverters._
import scala.collection.mutable

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(x: Int, a: Array[Int]): Int = {
        // write your code in Scala 2.12
        
        val set = mutable.HashSet[Int]((1 to x):_*)
        
        for (i <- 0 until a.length) {
            set -= a(i)
            if (set.isEmpty) return i
        }
        
        return -1
    }
}
