// 再帰呼び出しが末尾にくる
// TCO（Tail Call Optimization)を有効にする(積まれていくスタックを最適化していく）
tailrec fun sumif(numbers: List<Long>, accumulator: Long = 0L): Long =
    if (numbers.isEmpty()) accumulator
    else sumif(numbers.drop(1),accumulator + numbers.first())

fun main(args:Array<String>) {
    val sumresult = sumif((1L..123456).toList())// 呼び元を考慮しないとスタックオーバーフローに
    println(sumresult) //出力
}