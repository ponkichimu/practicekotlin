class Counter {
    private var cnt = 0

    fun countUp(): Unit { //結果を返さない
        cnt++
    }
    fun getCount(): Int = cnt
}
