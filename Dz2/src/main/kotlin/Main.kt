fun main(){
    val ageArray = arrayOf(18, 21, 19, 34, 40)
    val nameArray = arrayOf("Михаил", "Иван", "Пётр", "Сергей", "Константин")
    val surNameArray = arrayOf("Иванов", "Петров", "Мишулин", "Смирнов", "Девятаев")
    ageArray.sort()
    for ((i, ages) in ageArray.withIndex()) {
        println("Фамилия, Имя, Возраст: ${ageArray[i]} ${nameArray[i]} ${surNameArray[i]}")
    }
}