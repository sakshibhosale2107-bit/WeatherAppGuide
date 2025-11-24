fun main() {
    println("Welcome to Android Club Task!")

    // Input
    print("Enter two numbers: ")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    // Basic operations
    println("Sum: ${a + b}")
    println("Difference: ${a - b}")
    println("Product: ${a * b}")

    // Function
    println("Greater number is: ${greater(a, b)}")

    // Loop
    println("Printing numbers from 1 to 5:")
    for (i in 1..5) {
        println(i)
    }
}

fun greater(a: Int, b: Int): Int {
    return if (a > b) a else b
}