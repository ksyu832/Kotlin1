//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val amount = 10000

    var commission = amount * 0.0075

    if (commission < 35) {
        commission = 35.0
    }

    println("Сумма перевода: $amount руб.")
    println("Комиссия: $commission руб.")
}