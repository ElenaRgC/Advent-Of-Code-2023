package Day02

import println
import readInput

data class Game(val number: Int, val cubes: ArrayList<Int>)

fun main() {
    fun part1(input: List<String>): Int {
        val gamesArray = ArrayList<Game>()

        val redLimit = 12
        val greenLimit = 13
        val blueLimit = 14

        for (game in input) {
            var idBreak = game.split(":");
            var gameId = idBreak[0];

            var gameNumber = "";
            for (character in gameId) {
                if(character.digitToIntOrNull() != null) {
                    gameNumber += character
                }
            }
            var reds = 0
            var greens = 0
            var blues = 0

            var gamesBreak = idBreak[1].split(";");

            var games = ArrayList<Int>()
            for (tries in gamesBreak) {
                var colors = tries.split(",")

                for (color in colors) {
                    if (color.contains("red")) {
                        var c = color.split("red")
                        var value = c[0].trim().toInt()
                        if (value > reds) {
                            reds = value
                        }
                    } else if (color.contains("green")) {
                        var c = color.split("green")
                        var value = c[0].trim().toInt()
                        if (value > greens) {
                            greens = value
                        }
                    } else if (color.contains("blue")){
                        var c = color.split("blue")
                        var value = c[0].trim().toInt()
                        if (value > blues) {
                            blues = value
                        }
                    }
                }
            }
            games.add(reds)
            games.add(greens)
            games.add(blues)

            var game = Game(gameNumber.toInt(), games)

            gamesArray.add(game)
        }

        var gamesSum = 0

        for (games in gamesArray) {
            if (games.cubes[0] <= redLimit && games.cubes[1] <= greenLimit && games.cubes[2] <= blueLimit) {
                gamesSum += games.number
            }
        }

        return gamesSum
    }

    fun part2(input: List<String>): Int {
        val gamesArray = ArrayList<Game>()

        val redLimit = 12
        val greenLimit = 13
        val blueLimit = 14

        for (game in input) {
            var idBreak = game.split(":");
            var gameId = idBreak[0];

            var gameNumber = "";
            for (character in gameId) {
                if(character.digitToIntOrNull() != null) {
                    gameNumber += character
                }
            }
            var reds = 0
            var greens = 0
            var blues = 0

            var gamesBreak = idBreak[1].split(";");

            var games = ArrayList<Int>()
            for (tries in gamesBreak) {
                var colors = tries.split(",")

                for (color in colors) {
                    if (color.contains("red")) {
                        var c = color.split("red")
                        var value = c[0].trim().toInt()
                        if (value > reds) {
                            reds = value
                        }
                    } else if (color.contains("green")) {
                        var c = color.split("green")
                        var value = c[0].trim().toInt()
                        if (value > greens) {
                            greens = value
                        }
                    } else if (color.contains("blue")){
                        var c = color.split("blue")
                        var value = c[0].trim().toInt()
                        if (value > blues) {
                            blues = value
                        }
                    }
                }
            }
            games.add(reds)
            games.add(greens)
            games.add(blues)

            var game = Game(gameNumber.toInt(), games)

            gamesArray.add(game)
        }

        var gamesSum = 0

        for (games in gamesArray) {
            var gamesPower = games.cubes[0] * games.cubes[1] * games.cubes[2]
            gamesSum += gamesPower
        }

        return gamesSum
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test", "Day02")
    check(part1(testInput) == 8)
    check(part2(testInput) == 2286)

    val input = readInput("Day02", "Day02")
    part1(input).println()
    part2(input).println()
}
