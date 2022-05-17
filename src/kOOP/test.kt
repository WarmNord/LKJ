package kOOP

class test {


}


fun bubbleSort2(inputList: List<String>) : IntArray {
   val l = inputList.sorted()
    val array: IntArray = intArrayOf()
    for (i :Int in 0 until l.size - 1){
        array[i] = l[i].toInt()
    }
    return array

}
fun main() {
    val list = listOf<String>("1","8","8","2")
    val l = list.sorted()


    val array: IntArray = intArrayOf()
    print(array.size)
    for (i :Int in 0..l.size - 1){
        array.set(i,l[i].toInt())
    }

}