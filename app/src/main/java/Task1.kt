fun main(args: Array<String>) {
    val arr  = intArrayOf(9,4,1,2,3)
    println("current array: ${arr.joinToString()}")
    println("reverse array: ${reverseArr(arr).joinToString()}")
}

fun reverseArr(arr: IntArray): IntArray {
    val reverseArr = IntArray(arr.size)
    for (i in reverseArr.indices) {
        reverseArr[i] = arr[arr.size - 1 - i]
    }
    return reverseArr
}