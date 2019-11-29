package kcourse.HW

import kcourse.HW.stepic.scan
import kotlin.math.max
import kotlin.math.min

fun main() {
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    val d = scan.nextInt()
    val e = scan.nextBoolean()


    val z = max(a,b)
    val x = max(c,d)
    val ma = max(z,x)


    val f = min(a,b)
    val g = min(c,d)
    val mi = min(f,g)

  /*  if (e == true) {
        println(mi)
    }
    else {
        println(ma)
    }
*/
    when (e){
        true -> { println(mi)}
        else -> {println(ma)}

    }


}