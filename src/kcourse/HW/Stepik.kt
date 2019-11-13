package kcourse.HW

val scan = java.util.Scanner(System.`in`)

fun main() {

    val a = scan.nextInt()


    if(a<1000){
        if(a<100){
            if(a<10){
                if(a<0){ println("Число отрицательное.")  }
                else   { println("Число однозначное")     }
            }else      { println("Число двузначное")      }
        }else          { println("Число трёхзначное")     }
    }else              { println("Число четырёхзначное и более")  }



}