fun main() {
    println("Введите возраст, фамилию и имя")
    val age : Int = readLine()?.toInt()!!
    val surname = readLine()
    val name = readLine()
    if (age >= 18) println("$name $surname пропустить")
    if ((age > 14) && (age < 18)) println("$name $surname не пускать в торговый центр")
    if (age <= 14) println("$name $surname вызвать полицию")
}