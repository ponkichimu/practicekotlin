fun summe(numbers: List<Long>): Long {
    var sum = 0L
    for (n in numbers) {
        sum += n
    }
    return sum
}
fun main(args:Array<String>) {
    val num :List<Long> = listOf(1L,2L,3L)
    val sumresult = summe(num)
    println(sumresult) //10を出力
}