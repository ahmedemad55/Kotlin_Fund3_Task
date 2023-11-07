package com.example.kotlinfun3


fun main() {
    println("Choose a number from 1:4 to check your lucky game : ")
    var number = readLine()!!.toInt()

    when (number) {
        1 -> {
            val football = Football(1)
            football.print_game_info()
        }
        2 -> {
            val basketball = Basketball(2)
            basketball.print_game_info()
        }
        3 -> {
            val karate = Karate(3)
            karate.print_game_info()
        }
        4 -> {
            val chess = Chess(4)
            chess.print_game_info()
        }

    }


}

open class Game_class(
    var game_name: String,
    var players_numbers: Int,
    var game_ball: String,
    var game_status: String
) {
    fun print_game_info() {
        println(game_name)
        println(players_numbers)
        println(game_ball)
        println(game_status)

    }


}

class Football(var number: Int) : Game_class("Football", 11, "Have a ball", "Collective") {

}

class Basketball(var number: Int) : Game_class("Basketball", 5, "Have a ball", "Collective") {

}

class Karate(var number: Int) : Game_class("Karate", 1, "Not have a ball", "Individually") {

}

class Chess(var number: Int) : Game_class("Football", 1, "Not have a ball", "Individually") {

}