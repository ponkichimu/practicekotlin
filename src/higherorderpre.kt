import java.util.function.BiPredicate

// 最初にKが出現する箇所を出力
fun first(str: String, predicate: (Char) -> Boolean):Int {
    tailrec fun go(str: String, index: Int):Int =
        when {
            str.isEmpty() -> -1
            predicate(str.first()) -> index
            else -> go(str.drop(1),index + 1)
        }
    return go(str, 0)
}

fun firstK(str: String): Int {
    fun isK(c: Char):Boolean = c == 'K'
    return first(str, ::isK)
}

fun firstUpperCase(str: String): Int {
    fun isUpperCase(c: Char): Boolean = c.isUpperCase()
    return first(str, ::isUpperCase)
}

fun main(args:Array<String>){
    var result: Int = firstK("kSTRHK('%09")
    print(result)
    var resultUp: Int = firstUpperCase("kSTRHK('%09")
    print(resultUp)
}