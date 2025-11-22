fun main() {
    println(agoToText(30))
    println(agoToText(1800))
    println(agoToText(7200))
    println(agoToText(86400))
    println(agoToText(172800))
    println(agoToText(200000))
    println(agoToText(300000))
}

fun agoToText(secondsAgo: Int): String {
    return when {
        secondsAgo < 60 -> "был(а) только что"
        secondsAgo < 3600 -> "был(а) несколько минут назад"
        secondsAgo < 86400 -> "был(а) несколько часов назад"
        secondsAgo < 172800 -> "был(а) вчера"
        secondsAgo < 259200 -> "был(а) позавчера"
        else -> "был(а) давно"
    }
}