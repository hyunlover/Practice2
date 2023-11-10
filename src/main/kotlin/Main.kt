fun main(args: Array<String>) {
    // 1 задача and 3
    val age1=42.toDouble() /* создала и преобразовала тип */
    val age2=21.toDouble() //создала и преобразовала тип
    // 3 задача
    val avg1=(age1+age2)/2
    println(avg1)//должен быть ответ с десятичной дробью , а выводит без
    // 4 задача
    val firstName: String="Victoria"
    println(firstName)
    val lastName: String="Fedorchenko"
    println(lastName)
    // 5 zadacha
    val fullName: String=firstName + " " + lastName //конкатенация
    println(fullName)
    // 6 zadacha
    val myDetails: String="Hi, my name is $fullName "
    println(myDetails)
    // 7 zadacha
    val tripleDate = Triple(7, 9, 2023)

    // 9 zadacha
    var (_, month,year) = tripleDate //игнорирование

    // 10 zadacha
    month = 8 //извлечение значения и вношу изменения 
    val date = Pair( month,year) //новая Pair 
    println(date)
}