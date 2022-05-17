package kcourse.Enum

enum class LogLevel {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}


fun main() {
        logMessage(LogLevel.DEBUG, "mmmmmm")
}

fun logMessage(level: LogLevel, message: String) {
    // Your code
    println("// [${level.name}]: ${message}")
}