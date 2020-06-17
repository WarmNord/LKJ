package kOOP.Worker

fun main() {
    val w = Worker("Ivor","QA", 2016)
    w.info()
}

fun Worker.info() { println("Name: $name Job: $w Start work $exp")}