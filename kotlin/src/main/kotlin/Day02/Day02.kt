package Day02

import charToShape
import choseShape
import readFromFile

fun dayTwoPartOne(input: List<Pair<Char,Char>>): Int? {
  return input.map {
    Pair(charToShape(it.first), charToShape(it.second))
  }.sumOf {
    calculateScoreFormula(it)
  }
}

fun dayTwoPartTwo(input: List<Pair<Char,Char>>): Int? {
  return input.map {
    Pair(
      charToShape(it.first),
      choseShape(charToShape(it.first), it.second)
    )
  }.sumOf {
    calculateScoreFormula(it)
  }
}

fun main(args: Array<String>) {
  val strategy = readFromFile("src/main/resources/Day02/strategy.txt")
  println("Part one: ${dayTwoPartOne(strategy)}")
  println("Part two: ${dayTwoPartTwo(strategy)}")

}
