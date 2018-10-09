package xl.qinhu.com.mytest

import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        /* for (i in 100 downTo 1 step 2) {
             println(fizzBuzz(i))
         }*/
        //iterationMap()
        println(isLetter('A'))
    }

    fun fizzBuzz(i: Int) = when {
        i % 15 == 0 -> "FizzBuzz"
        i % 3 == 0 -> "Fizz"
        i % 5 == 0 -> "Buzz"
        else -> "$i"
    }

    fun iterationMap() {
        val binaryReps = TreeMap<Char, String>()
        for (c in 'A'..'Z') {
            val binaryString = Integer.toBinaryString(c.toInt())
            binaryReps[c] = binaryString
        }
        for ((letter, binary) in binaryReps) {
            println("$letter=$binary")
        }
    }

    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
}