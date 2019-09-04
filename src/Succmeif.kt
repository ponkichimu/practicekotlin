tailrec fun sumif(numbers: List<Long>, accumulator: Long = 0L): Long =
    if (numbers.isEmpty()) accumulator
    else sumif(numbers.drop(1),accumulator + numbers.first())

fun main(args:Array<String>) {
    val sumresult = sumif((1L..123456).toList())
    println(sumresult) //出力
}