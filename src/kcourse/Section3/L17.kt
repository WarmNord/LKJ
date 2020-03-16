package kcourse.Section3

fun main() {
    val data = mapOf(
            "Январь" to listOf(100,100,100,100),
            "Февраль"  to listOf(200,200,-190,200),
             "Март" to listOf(300,180,300,100),
             "Апрель" to listOf(250,-250,100,300),
            "Май" to listOf(200,100,400,300),
            "Июнь" to listOf(200,100,300,300)
    )
    printInfo(data)
}

fun printInfo(data: Map< String, List<Int>>) {

    val validData = data.filterNot { it.value.any {it < 0} }

    val averageWeek = validData.flatMap { it.value }.average()

    println("averagw Week $averageWeek")

    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.max()
    val min = listOfSum.min()

    val avMonth = listOfSum.average()

    val maxMonth = validData.filter { it.value.sum()  == max }.keys
    val minMonth = validData.filter { it.value.sum()  == min }.keys

    println("Aver Month $avMonth")
    println("\n max $max")
    println("\n It was")
    for (month in maxMonth){
        print("$month ")
    }

    println("\n min $min")
    println("\n It was")
    for (month in minMonth){
        print("$month ")
    }

    println("\n Errors")
    val invalidData = data.filter { it.value.any {it < 0} }
    val erM = invalidData.keys
    for (m in erM)
    {
        print("$m ")
    }



}
