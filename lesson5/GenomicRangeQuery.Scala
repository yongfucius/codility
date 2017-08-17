import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(s: String, p: Array[Int], q: Array[Int]): Array[Int] = {
        
        val a = new Array[Int](s.length)
        for (i <- 0 until s.length) {
            a(i) = factor(s(i))
        }
        
        val result = new Array[Int](p.length)
        for (i <- 0 until p.length) {
            result(i) = a.slice(p(i), q(i) + 1).min
        }
        
        result
    }
    
    def factor(c: Char): Int = {
        c match {
            case 'A' => 1
            case 'C' => 2
            case 'G' => 3
            case 'T' => 4
        }
    }
}
