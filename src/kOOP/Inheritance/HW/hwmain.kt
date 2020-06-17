package kOOP.Inheritance.HW

fun main() {

    val workers = mutableListOf<Worker>(
            SE("il1",19,"Python"),
            SE("il2",25,"C++"),
            SE("il3",30,"Java"),
            Seller("w1",20),
            Seller("w3",40),
            Seller("w4",35),
            Director("Nick",50)
    )

    for (i in workers){
            i.work()
            //i as Cleaner
    }

    val clener = workers.filter { it is Cleaner }.map { it as Cleaner }

}