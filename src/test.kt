
    fun main() {
        val half = Rational(1,3)
        /*分数（有理数）を表示する*/
        println(half)
    }

    class Rational(private val numerator:Int, private val denominator: Int){
        init{
            /* denominatorが0の場合、IllegalArgumentException */
            require(denominator !=0, {"denominator　must not be null"})
        }
        override fun toString(): String = "${numerator}/${denominator}"

    }
