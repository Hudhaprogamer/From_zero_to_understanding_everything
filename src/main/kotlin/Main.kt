fun caughtSpeeding(speed: Int, isBirthday: Boolean): Int {
    var adjustedSpeed = speed

    if (isBirthday) {
        adjustedSpeed -= 5
    }

    return when {
        adjustedSpeed <= 60 -> 0
        adjustedSpeed in 61..80 -> 1
        else -> 2
    }
}

fun main() {
    // Contoh pemanggilan fungsi
    val speed = 65
    val isBirthday = true
    val result = caughtSpeeding(speed, isBirthday)
    println("Result: $result")
}
