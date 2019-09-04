//様々なオブジェクト
fun main(arg:Array<String>){
    // Stringのメンバ
    val strMem: String = "hello、夜"
    println(strMem.length)
    println(strMem.capitalize())

    // 配列（要素の型から推論可能なため、型引数を省略できる
    val strs = arrayOf("赤", "黄", "青")
    println("${strs[2]},${strs[0]}")

    //Mapはこんな感じ(ミュータブル：変更可能・・・Mapが変更不可能というのは、正確ではない）
    val numberMap: MutableMap<String, Int> =
        mutableMapOf("one" to 1, "two" to 2, "juu" to 10 )
    println("Map：$numberMap")

    //Listはこんな感じ(ミュータブル：変更可能）
    val mutableCharList: MutableList<Char> =
        mutableListOf('b', 'k', 'a' )
    println("List：$mutableCharList")

    // セット（集合？を表す）
    val intSets: Set<Int> = setOf(1, 2, 4, 3, 2, 5 ,2)
    println("Set：$intSets")//順序の保証はなく、繰り返しはなくす

    // レンジというオブジェクトがkotlinにはある！
    var range:IntRange = 12..15
    println("範囲：$range!!!!")
}