
fun main(args:Array<String>){

    val arr = arrayOf(1,2,6,9,2,3)
    // forループ　(要素名　in イテレータを提供するオブジェクト
    for(x in arr){
        // when式　JavaのSwitch文を強力にしたような形(定数以外も評価対象にできる）
        when(x){
            1 -> println("one")
            2,3 -> println("two or three")
            in 4..7 -> println("four to seven")
            else -> {
                println("unknown")
            }
    }}

    val arrs = arrayOf( "a",3)
    // forループ　(要素名　in イテレータを提供するオブジェクト
    for(y in arrs){
        // 型チェックで分岐
        val blank = when (y){
            is String -> println(y.isBlank())
            else -> println("true")
        }
    }

    val arrscore= arrayOf( 10,50,88,90,70)
    // forループ　(要素名　in イテレータを提供するオブジェクト
    for(z in arrscore){
        // 目に優しいif-else
        when {
            z >= 90 -> println('A')
            z >= 80 -> println('B')
            z >= 70 -> println('C')
            z >= 60 -> println('D')
            else -> println("不合格")
        }
    }

}