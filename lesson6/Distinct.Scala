import scala.collection.JavaConverters._
import scala.collection.mutable

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(a: Array[Int]): Int = {
        val n = a.length
        
        val distinct = mutable.HashSet[Int]()
        
        a.foreach(distinct += _)
        
        distinct.size
    }
}
