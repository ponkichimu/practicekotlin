
//ラムダ式
val square: (Int) -> Int = { i: Int ->
    i * i
}
val square1= { i: Int ->
    i * i
}

val square2: (Int) -> Int = {
    it * it //itの乱用は注意
}
fun main(args: Array<String>){
    println(square(2))
    println(square1(2))
    println(square2(2))
}