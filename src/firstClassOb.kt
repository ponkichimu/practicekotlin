fun square(i :Int): Int = i * i

fun main(args:Array<String>) {
    var functionObject = ::square
    println(functionObject)
    println(functionObject(5))

}