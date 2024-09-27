private fun returnNotNullString1(): String {   // returns null in Kotlin 2.0.20
    return try {
        JavaCrashProvider().returnNullString()
    } catch (e: Exception) {
        ""
    }
}

private fun returnNotNullString2(): String {
    return JavaCrashProvider().returnNullString()
}

fun main() {
    println("String1 is: ${returnNotNullString1()}") // returns "" in Kotlin 1.9.22 and null in Kotlin 2.0.20
    println("String2 is: ${returnNotNullString2()}") // crashed in both versions what is expected behaviour
}
