import scala.collection.JavaConverters._
import scala.collection.mutable
import util.control.Breaks._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(s: String, p: Array[Int], q: Array[Int]): Array[Int] = {
        val n = s.length
        val m = p.length
        
        val inverted = mutable.HashMap[Int, mutable.ArrayBuffer[Int]]()
        
        for (i <- 0 until n) {
            val number = factor(s(i))
            
            breakable {
                if (number == max) break
                
                if (inverted.contains(number)) {
                    inverted(number) += i
                } else {
                    inverted(number) = mutable.ArrayBuffer[Int](i)
                }
            }
        }
        
        val result = new Array[Int](m)
        
        for (i <- 0 until m) {
            val from = p(i)
            val to = q(i)
            
            var minimum = max
            
            breakable {
                for (k <- 1 to 3) {
                    if (inverted.contains(k)) {
                        if (inverted(k).exists(index => index >= from && index <= to)) {
                            minimum = k
                            break
                        }
                    }
                }
            }
            
            result(i) = minimum
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
    
    def max(): Int = 4
}
