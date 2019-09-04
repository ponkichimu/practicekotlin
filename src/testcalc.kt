
    fun main() {
        val half = RationalCalc(1,3).plus(RationalCalc(1,6))
        /*分数（有理数）を表示する*/
        println(half)
    }

    class RationalCalc(private val n:Int, private val d: Int) {
        init {
            /* denominatorが0の場合、IllegalArgumentException */
            require(d != 0, { "denominator　must not be null" })
        }

        private val g by lazy { gcd(Math.abs(n), Math.abs(d)) }
        val numerator: Int by lazy { n / g }
        val denominator: Int by lazy { d / g }
        fun plus(that: RationalCalc): RationalCalc =
            RationalCalc(
                numerator * that.denominator + that.numerator * denominator,
                denominator * that.denominator
            )

        override fun toString(): String = "${numerator}/${denominator}"
        tailrec private fun gcd(a: Int, b: Int): Int =
            if (b == 0) a
            else gcd(b, a % b)
    }

