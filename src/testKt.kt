import kotlin.io.println

//fun vars(vararg v:Int){
//    for(vt in v){
//        print(vt)
//    }
//}
//
//// 测试
//fun main(args: Array<String>) {
//    vars(1,2,3,4,5)  // 输出12345
//}

// 测试
//fun main(args: Array<String>) {
//    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
//    println(sumLambda(1,2))  // 输出 3
//}

//fun parseInt(str: String): Int? {
//    return str.toIntOrNull()
//}
//
//fun printProduct(arg1: String, arg2: String) {
//    val x = parseInt(arg1)
//    val y = parseInt(arg2)
//
//    // 直接使用 `x * y` 会导致错误, 因为它们可能为 null
//    if (x != null && y != null) {
//        // 在进行过 null 值检查之后, x 和 y 的类型会被自动转换为非 null 变量
//        println1(x * y)
//    }
//    else {
//        println1("'$arg1' or '$arg2' is not a number")
//    }
//}
//
//fun main() {
//    printProduct("6", "7")
//    printProduct("a", "7")
//    printProduct("a", "b")
//}

//fun parseInt(str: String): Int? {
//    return str.toIntOrNull()
//}
//
//fun printProduct(arg1: String, arg2: String) {
//    val x = parseInt(arg1)
//    val y = parseInt(arg2)
//
//    // ...
//    if (x == null) {
//        println("Wrong number format in arg1: '$arg1'")
//        return
//    }
//    if (y == null) {
//        println("Wrong number format in arg2: '$arg2'")
//        return
//    }
//
//    // 在进行过 null 值检查之后, x 和 y 的类型会被自动转换为非 null 变量
//    println(x * y)
//}
//
//fun main() {
//    printProduct("6", "7")
//    printProduct("a", "7")
//    printProduct("99", "b")
//}

//fun getStringLength(obj: Any): Int? {
//    if (obj is String) {
//        // 做过类型判断以后，obj会被系统自动转换为String类型
//        return obj.length
//    }
//
//    //在这里还有一种方法，与Java中instanceof不同，使用!is
//    // if (obj !is String){
//    //   // XXX
//    // }
//
//    // 这里的obj仍然是Any类型的引用
//    return null
//}
//fun main(){
//    println(getStringLength("123"))
//}


fun main(args: Array<String>) {
    print("循环输出：")
    for (i in 1..4) print(i) // 输出“1234”
    println("\n----------------")
    print("设置步长：")
    for (i in 1..4 step 2) print(i) // 输出“13”
    println("\n----------------")
    print("使用 downTo：")
    for (i in 4 downTo 1 step 2) print(i) // 输出“42”
    println("\n----------------")
    print("使用 until：")
    // 使用 until 函数排除结束元素
    for (i in 1 until 4) {   // i in [1, 4) 排除了 4
        print(i)
    }
    println("\n----------------")
}