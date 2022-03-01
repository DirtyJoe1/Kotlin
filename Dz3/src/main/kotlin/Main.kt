fun main(){
    var n = 0
    val ageArray = Array(5){0}
    val nameArray = Array<String?>(5){""}
    val surnameArray = Array<String?>(5){""}
    while(n < 5){
        println("Введите возраст, имя и фамилию")
        val age : Int = readLine()?.toInt()!!
        val surname = readLine()
        val name = readLine()
        if ((age > 14) && (age < 18)) println("$name $surname не пускать в торговый центр")
        if (age <= 14) println("$name $surname вызвать полицию")
        if (age >= 18){
            println("$name $surname пропустить")
            ageArray[n] = age
            nameArray[n] = name
            surnameArray[n] = surname
            n++
        }
    }
    printInfo(ageArray, nameArray, surnameArray) //
}

fun printInfo(age: Array<Int>, name: Array<String?>, surname: Array<String?>){
    for((i) in age.withIndex()) {
        println("Возраст: ${age[i]}, Имя: ${name[i]}, Фамилия:${surname[i]}")
    }
}
