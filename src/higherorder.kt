// 最初にKが出現する箇所を出力
fun firstK(str: String):Int {
    tailrec fun go(str: String, index: Int):Int =
        when {
            str.isEmpty() -> -1
            str.first() == 'K' -> index
            else -> go(str.drop(1),index + 1)
        }
    return go(str, 0)
}

fun main(args:Array<String>){
    var result: Int = firstK("KSTRHK('%09")
    print(result)
}