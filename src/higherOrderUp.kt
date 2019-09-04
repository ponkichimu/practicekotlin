// 最初にKが出現する箇所を出力
fun firstUpperCase(str: String):Int {
    tailrec fun go(str: String, index: Int):Int =
        when {
            str.isEmpty() -> -1
            str.first().isUpperCase() -> index
            else -> go(str.drop(1),index + 1)
        }
    return go(str, 0)
}

fun main(args:Array<String>){
    var strT :String = "kHK09"
    var result: Int = firstUpperCase(strT)
    print(result)
}