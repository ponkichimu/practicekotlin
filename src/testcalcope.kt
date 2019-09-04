
    fun main() {
        /*見た目を〇+〇に*/
        val halfnum = 1 + RationalCalcope(1,4) + 2
        /*分数（有理数）を表示する*/
        println(halfnum)
    }

    class RationalCalcope(private val n:Int, private val d: Int) {
        init {
            /* denominatorが0の場合、IllegalArgumentException */
            require(d != 0, { "denominator　must not be null" })
        }

        private val g by lazy { gcd(Math.abs(n), Math.abs(d)) }
        val numerator: Int by lazy { n / g }
        val denominator: Int by lazy { d / g }
        operator fun plus(that: RationalCalcope): RationalCalcope =
            RationalCalcope(
                numerator * that.denominator + that.numerator * denominator,
                denominator * that.denominator
            )
        operator fun plus(n: Int):RationalCalcope =
            RationalCalcope(
                numerator + n * denominator, denominator
            )

        override fun toString(): String = "${numerator}/${denominator}"
        tailrec private fun gcd(a: Int, b: Int): Int =
            if (b == 0) a
            else gcd(b, a % b)
    }

    operator fun Int.plus(r:RationalCalcope):RationalCalcope = r + this

