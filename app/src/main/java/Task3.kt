import java.lang.IllegalArgumentException

/*
Create a function with name findMostFrequent, which takes the given phrase as a parameter.
The function returns the most frequent character in the phrase. If there are multiple characters with the same number of occurences,
return the one closer to the beginning of the phrase*/

fun main(args: Array<String>) {
    val example = "examplemlm"
    println(getTheMostFrequentCharacter(example))
}

fun getTheMostFrequentCharacter(str: String?): Char {
    if (str.isNullOrEmpty())
        throw IllegalArgumentException("please insert not empty value")
    val counterOfChar = mutableMapOf<Char, Int>()
    for (c in str.lowercase().toCharArray()) {
        counterOfChar[c] = counterOfChar.getOrPut(c) { 0 } + 1 //crazy
    }
    return counterOfChar.entries.maxBy { it.value }.key

}