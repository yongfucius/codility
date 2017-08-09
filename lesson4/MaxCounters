import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(n: Int, a: Array[Int]): Array[Int] = {
        // write your code in Scala 2.12
        
        val result = Array.fill(n)(0)
        
        var maxi = 0
        var cntr = 0
        
        val increase = (x: Int) => {
            val y = (result(x-1) max cntr) + 1
            maxi = maxi max y
            result(x-1) = y
        }
        val maxCounter = () => cntr = maxi
        
        for (i <- 0 until a.length) {
            val x = a(i)
            if (x <= n) increase(x)
            else maxCounter()
        }
        
        for (i <- 0 until result.length) {
            val k = result(i)
            if (k < cntr) result(i) = cntr
        }
        
        result
    }
}
