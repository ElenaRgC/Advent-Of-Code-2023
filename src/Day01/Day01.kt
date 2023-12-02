package Day01

import println
import readInput

fun main() {
    fun part1(input: List<String>): Int {
        val numbersArray = ArrayList<String>()

        for (line in input) {
            var numbers = ""
            for (character in line) {
                if(character.digitToIntOrNull() != null) {
                    numbers += character
                }
            }
            numbersArray.add(numbers)
        }

        var value = 0

        for (number in numbersArray) {
            value += (number.first() + number.last().toString()).toInt()
        }

        return value
    }

    fun part2(input: List<String>): Int {

        val convertedList = ArrayList<String>()
        var newLine = ""

        for (line in input) {
            newLine = line.replace("one", "o1e")
            newLine = newLine.replace("two", "t2o")
            newLine = newLine.replace("three", "t3e")
            newLine = newLine.replace("four", "f4r")
            newLine = newLine.replace("five", "f5e")
            newLine = newLine.replace("six", "s6x")
            newLine = newLine.replace("seven", "s7n")
            newLine = newLine.replace("eight", "e8t")
            newLine = newLine.replace("nine", "n9e")
            convertedList.add(newLine)
        }

        val numbersArray = ArrayList<String>()

        for (line in convertedList) {
            var numbers = ""
            for (character in line) {
                if(character.digitToIntOrNull() != null) {
                    numbers += character
                }
            }
            numbersArray.add(numbers)
        }

        var value = 0

        for (number in numbersArray) {
            value += (number.first() + number.last().toString()).toInt()
        }
        return value
    }

    // test if implementation meets criteria from the description, like:
    /*val testInput = readInput("Day01_test", "Day01")
    check(part1(testInput) == 142)
    check(part2(testInput) == 281)*/

    val input = readInput("Day01", "Day01")
    part1(input).println()
    part2(input).println()
}
