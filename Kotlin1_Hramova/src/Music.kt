fun main() {
    val sum = 5000.0
    val regular = true

    var result = sum

    if (sum > 10000) {
        result = sum * 0.95
    } else if (sum > 1000) {
        result = sum - 100
    }

    if (regular) {
        result = result * 0.99
    }

    println("К оплате: $result руб.")
}