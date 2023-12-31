import kotlin.random.Random

// сгенерить матрицу 3 на 3 состоящую из случайных уникальных интов от 1 до 20
// f() = [
//   [10,5,11],
//   [1,20,9],
//   [13,17,19]
// ]

fun main(args: Array<String>) {
    createMatrix3x3(3, 20)

}

fun createMatrix3x3(sizeOfMatrix: Int, amountOfNumbers: Int) {
    val arr = Array(sizeOfMatrix) { Array(sizeOfMatrix) { 0 } }
    val listWithNumbers = mutableListOf<Int>()

    for (i in 1..amountOfNumbers) {
        listWithNumbers.add(i)
    }

    for (i in arr.indices) {
        for (j in arr[i].indices) {
            arr[i][j] = listWithNumbers.removeAt(Random.nextInt(0, listWithNumbers.size))
        }
        println("[${arr[i].joinToString(",")}]")
    }
}
