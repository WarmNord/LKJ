package kcourse.training

fun main() {

    println(myClass.info)
    println(myClass.getMoreInfo())
    println()
    var first = singleton.instance
    first.b = " Hello single!"
    var second = singleton.instance
    println(second.b)

}

class myClass {
    companion object factory{
        val info = "Is's factory"

        fun getMoreInfo(): String{
            return "Is's function of fabric"
        }
    }
}

public class singleton
    private constructor(){
        init {
            println("It's $this singleton")
        }
    private object holder{
        val INSTACE = singleton()

    }
    companion object {
        val instance: singleton by lazy { holder.INSTACE }
    }

    var b:String? = null
    }
