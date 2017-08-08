import scala.collection.JavaConverters._
import scala.collection.mutable

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(a: Array[Int]): Int = {
        // write your code in Scala 2.12
        
        val n = a.length
        val set = mutable.HashSet((1 to n):_*)
        
        a.foreach(set -= _)
        
        if (set.isEmpty) 1 else 0
    }
}
