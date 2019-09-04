/*
//ラムダ式
fun firstWhitespace(str: String): Int =
    first(str, {it.isWhitespace() })

fun firstWhitespace(str: String): Int {
    val isWhitespace: (Char) -> Boolean = {
        it.isWhitespace()
    }
    return first(str, isWhitespace)
}
*/
fun firstWhitespace(str: String): Int  =
    first(str){ it.isWhitespace() }

fun main(args: Array<String>){
    println(firstWhitespace("k G12"))
}