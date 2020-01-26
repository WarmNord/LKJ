package kcourse.HW.OOPConstructors

fun main() {
    val MyBook = Book("The little prince")
    MyBook.year = 2010
    MyBook.price = 100

    println("Name: ${MyBook.name} Year of manufacture: ${MyBook.year} Price: ${MyBook.price}")
}