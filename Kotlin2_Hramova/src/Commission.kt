fun main() {
    println(calculateCommission("VK Pay", 0, 1000)) // 0.0
    println(calculateCommission("MasterCard", 0, 1000)) // 0.0
    println(calculateCommission("MasterCard", 75000, 10000)) // 80.0
    println(calculateCommission("Maestro", 0, 1000)) // 0.0
    println(calculateCommission("Maestro", 80000, 20000)) // 140.0
    println(calculateCommission("Visa", 0, 1000)) // 35.0
    println(calculateCommission("Мир", 0, 5000)) // 37.5
}

fun calculateCommission(
    cardType: String = "VK Pay",
    previousTransfers: Int = 0,
    transferAmount: Int
): Double {
    return when (cardType) {
        "VK Pay" -> 0.0

        "MasterCard", "Maestro" -> {
            val total = previousTransfers + transferAmount
            if (total <= 75000) {
                0.0
            } else {
                transferAmount * 0.006 + 20
            }
        }

        "Visa", "Мир" -> {
            val commission = transferAmount * 0.0075
            if (commission < 35) 35.0 else commission
        }

        else -> 0.0
    }
}