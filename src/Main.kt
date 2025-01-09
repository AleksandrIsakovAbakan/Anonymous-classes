fun main() {

    println()
    val strings = arrayOf("Дан массив строк", "Найти самое длинное слово", "количество букв в этом слове",
        "Посчитать сумму элементов", "Написать абстрактный класс")
    println(strings.contentDeepToString())
    println("Найти самое длинное слово в массиве и количество букв в этом слове:" +
            " ${longestWordInArrayAndNumberOfLettersInWord(strings)}")
    println()

    val array = arrayOf(arrayOf(5, 8, 15, 25),
        arrayOf(6, 4, 15, 2),
        arrayOf(55, 8, 3, 6),
        arrayOf(4, 8, 12, 55)
    )
    println(array.contentDeepToString())
    println("Посчитать сумму элементов побочной диагонали матрицы: ${sumOfElementsOfSecondaryDiagonalOfMatrix(array)}")
    println()

    println("В функции main создать несколько объектов Printer")
    val printerOne = object : Printer("Epson", "jet") {
        val tempName = name
        val tempType = type
        override fun toString(): String {
            return "tempName='$tempName', tempType='$tempType'"
        }
    }
    println(printerOne)
    val printerTwo = object : Printer("Canon", "laser") {
        val tempName = name
        val tempType = type
        override fun toString(): String {
            return "tempName='$tempName', tempType='$tempType'"
        }
    }
    println(printerTwo)
    val printerThree = object : Printer("HP", "matrix") {
        val tempName = name
        val tempType = type
        override fun toString(): String {
            return "tempName='$tempName', tempType='$tempType'"
        }
    }
    println(printerThree)

}

/*
Дан массив строк.
Найти самое длинное слово в массиве и количество букв в этом слове.
*/
fun longestWordInArrayAndNumberOfLettersInWord(array: Array<String>): Any {
    var result: String = ""
    for (a in array) for (b in a.split(" ")) if (b.length > result.length) result = b
    return object {
        val longest = result
        val numberOfLetters = result.length
        override fun toString(): String {
            return "$longest, $numberOfLetters"
        }
    }
}

/*
Посчитать сумму элементов побочной диагонали матрицы 4х4.
*/
fun sumOfElementsOfSecondaryDiagonalOfMatrix(arrays: Array<Array<Int>>): Int {
    var result = 0
    var count = arrays.size - 1
    for (i in arrays.indices){
        result += arrays[i][count]
        count--
    }
    return result
}

/*
Написать абстрактный класс Printer со своими свойствами и функциями.
В функции main создать несколько объектов Printer.
*/
abstract class Printer(val name: String, val type: String){

    override fun toString(): String {
        return "Printer(name='$name', type='$type')"
    }
}