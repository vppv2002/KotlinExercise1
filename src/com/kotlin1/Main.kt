package com.kotlin1

fun main(args: Array<String>) {
    val firstNumber: Int = 7
    val secondNumber: Int = 5
    val thirdNumber: Int = 4
    var sumOfMax: Int = 0

    when {
        (secondNumber in thirdNumber..firstNumber) || (firstNumber in thirdNumber..secondNumber) -> sumOfMax =
            firstNumber * firstNumber + secondNumber * secondNumber
        (thirdNumber in secondNumber..firstNumber) || (firstNumber in secondNumber..thirdNumber) -> sumOfMax =
            firstNumber * firstNumber + thirdNumber * thirdNumber
        (secondNumber in firstNumber..thirdNumber) || (thirdNumber in firstNumber..secondNumber) -> sumOfMax =
            thirdNumber * thirdNumber + secondNumber * secondNumber
    }
    println("Сумма: $sumOfMax")
}