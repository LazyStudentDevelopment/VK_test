fun main(args: Array<String>) {

    sms()
}

private fun sms() {
    println("Введите максимальную длинну строчки: ")
    var maxLength = readLine()!!.toInt()

    println("Введите строку: ")
    var inputString = readLine()!!.toString()

    var outputList: MutableList<String> = mutableListOf()

    if (inputString.length <= maxLength) {
        outputList.add(0, inputString)
        println(outputList[0])

    } //Выводит изачальную строку, если её длинна меньше лимита.
    else {

        var inputArray = inputString.split(" ").toMutableList()
        var bufferList: MutableList<String> = mutableListOf()
        var n = 0

        while (true) {

            bufferList.add(n, "")

            while (inputArray.size != 0 && (bufferList[n].length + inputArray.first().length + 7) <= maxLength) {
                bufferList.add(n, bufferList[n] + " " + inputArray.first())
                inputArray.removeFirst()
            }
            outputList.add(bufferList[n])
            if (inputArray.size == 0) break
            else n++
        }
        var smsCounttotal = outputList.size
        for (i in outputList.indices) {
            println("${i + 1}/$smsCounttotal${outputList[i]}")
        }
    }// Выводит строку разбитую на СМС и пронумерованную.
}


