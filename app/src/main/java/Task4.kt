import kotlin.random.Random

// сгенерить матрицу 3 на 3 состоящую из случайных уникальных интов от 1 до 20
// f() = [
//   [10,5,11],
//   [1,20,9],
//   [13,17,19]
// ]

fun main(args: Array<String>) {
    val arr = createMatrix(3, 20, 1)
    for (i in arr.indices) {
        println("[${arr[i].joinToString(",")}]")
    }
}

fun createMatrix(sizeOfMatrix: Int, maxNumber: Int, minNumber: Int): Array<Array<Int>> {
    val arr = Array(sizeOfMatrix) { Array(sizeOfMatrix) { 0 } }
    val listWithNumbers = mutableListOf<Int>()

    for (i in minNumber..maxNumber) {
        listWithNumbers.add(i)
    }

    for (i in arr.indices) {
        for (j in arr[i].indices) {
            arr[i][j] = listWithNumbers.removeAt(Random.nextInt(0, listWithNumbers.size))
        }
    }
    return arr
}
