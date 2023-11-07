package com.example.training


fun main() {
//    println("Hello world")
//    welcome(name = "Ahmed")
//    println(sum(num1 = 5, num2 = 4))
//    ifExample()
//    nullSafeExample()
    safeCall()
    elvisOperator()
}

fun welcome(name: String) {
    println("Welcome " + name)
}

fun sum(num1: Int, num2: Int): Int {
    val sum = num1 + num2
    return sum
}

fun ifExample() {
    val x = 20
    val y = 18
    if (x > y) {
        println("x is greater then y")
    } else {
        println("x is smaller than y")
    }
}

fun whenExample(number : Int) {
  val day  = when (number) {
        1 -> "saturday"
        2 -> "sunday"
        3 -> "monday"
        else -> "Invalid Day"
    }
    println(day)
}

fun whileLoopExample(){
    var num = 0
    while (num < 5){
        println(num)
        num += 1
//        num++
//        num = num + 1
    }
}

fun nullSafeExample(){
    var name : String ?= null
    println(name!!.length)
}

fun safeCall(){
    var name : String ?= null
    println(name?.length)
}

fun elvisOperator(){
    var name : String ?= null
    println(name?.length ?: "Ahmed")
}

