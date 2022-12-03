package BdayTwo

import java.io.File

enum class Shape {
  Rock, Paper, Scissor
}

fun readFromFile(fileName: String): List<Pair<Char,Char>> {
  return File(fileName).readLines().map {
    Pair(it[0], it[2])
  }
}
fun charToShape(char: Char): Shape {
  return when (char){
    'A', 'X'  -> Shape.Rock
    'B', 'Y' -> Shape.Paper
    'C', 'Z' -> Shape.Scissor
    else -> throw IllegalArgumentException("Invalid shape")
  }
}

fun choseShape(shape: Shape, tactic: Char): Shape{
  val beatsShapeRules = mapOf(
    Shape.Rock to Shape.Paper,
    Shape.Paper to Shape.Scissor,
    Shape.Scissor to Shape.Rock
  )
  return when (tactic) {
    'X' -> beatsShapeRules.entries.associateBy({ it.value }){ it.key }[shape]!!
    'Y' -> shape
    'Z' -> beatsShapeRules[shape]!!
    else -> throw IllegalArgumentException("Invalid tactic")
  }
}
fun calculateShapeScore(shape: Shape): Int {
  return when (shape) {
    Shape.Rock -> 1
    Shape.Paper -> 2
    Shape.Scissor -> 3
  }
}
fun calculateWinScore(strat: Pair<Shape,Shape>): Int {
  return when  {
    strat == Pair(Shape.Rock, Shape.Paper) -> 6
    strat == Pair(Shape.Paper, Shape.Scissor) -> 6
    strat == Pair(Shape.Scissor, Shape.Rock) -> 6
    strat.first == strat.second -> 3
    else -> 0
  }
}
fun calculateScoreFormula (strat: Pair<Shape,Shape>): Int =
  calculateWinScore(strat) +  calculateShapeScore(strat.second)

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
  val strategy = readFromFile("src/main/resources/BdayTwo/strategy.txt")
  println("Part one: ${dayTwoPartOne(strategy)}")
  println("Part two: ${dayTwoPartTwo(strategy)}")

}
