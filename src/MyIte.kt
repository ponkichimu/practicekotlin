// イテレータを提供するオブジェクト
class MyIterator {
    // 繰り返し処理で次の要素が存在する場合にtrueを返す
    operator fun hasNext(): Boolean = Math.random() < 0.5
    //　繰り返し処理で次の要素を返す。
    operator fun next(): String = "Hello"
}

class MyIterable {
    operator fun iterator() = MyIterator()
}

fun main(args: Array<String>){
    // メソッドが定義されていれば、インターフェイスの実装などは不要
    for(item in MyIterable()){
        println(item)
    }
}