fun helloName(name: String): String {
    return "Hello $name!"
}

fun main() {
    val name1 = "Bob"
    val name2 = "Alice"
    val name3 = "X"

    println(helloName(name1))  // Output: Hello Bob!
    println(helloName(name2))  // Output: Hello Alice!
    println(helloName(name3))  // Output: Hello X!
}
