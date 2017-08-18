import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(a: Array[Int]): Int = {
        val n = a.length
        val slice = (summation: Int, from: Int, to: Int) => summation / (to - from + 1f)
        
        var p = 0
        var q = 1
        var sum = a(p) + a(q)
        var minAvg = slice(sum, p, q)
        var result = p
        
        for (i <- 2 until n) {
            q += 1
            var sumForAddedQ = sum + a(i)
            var addedQ = slice(sumForAddedQ, p, q)
            var sumForNewSlice = a(i-1) + a(i)
            var newSlice = slice(sumForNewSlice, i-1, i)
            
            //println(s"p is ${p}, q is ${q}, addedQ is ${addedQ}, newSlice is ${newSlice}, minAvg is ${minAvg}")
            
            if (addedQ <= newSlice) {
                sum = sumForAddedQ
                if (addedQ < minAvg) {
                    minAvg = addedQ
                    result = p
                }
            } else {
                p = i - 1
                sum = sumForNewSlice
                if (newSlice < minAvg) {
                    minAvg = newSlice
                    result = p
                }
            }
        }
        
        result
    }
}
