
//есть map: ключи - инт, значение - строки, вернуть все строки, где ключ отрицательный

fun main(args: Array<String>){
    val defaultMap = mapOf(-1 to "a", 2 to "b", -3 to "c", 4 to "d")
    println(getValueWithNegativeKeys(defaultMap))
}

fun getValueWithNegativeKeys(map: Map<Int, String>) =
    map.filter { it.key < 0 }.values.toList()
