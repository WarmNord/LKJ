package kcourse.HW.OOPInheritance

fun main() {
    val workers = mutableListOf<Worker>()

    workers.add(Seller("LEo", 27))
    workers.add(Seller("Kr", 55))
    workers.add(Seller("LLL", 27))
    workers.add(Seller("PS", 30))
    workers.add(softwareEng("fl", 27, "C++"))
    workers.add(softwareEng("fj", 30, "JS"))

    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }


    for (cleaners in cleaners) {
        cleaners.clean()
    }
    /* for (worker in workers) {
         worker.work()
         *//*if (worker is softwareEng){
            println(worker.plang)
        }
        if (worker is Cleaner) {
            worker.clean()
        }*//*

        worker as Cleaner
        worker.clean()

    }*/

}