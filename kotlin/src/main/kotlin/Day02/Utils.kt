import Day02.ResultScore
import Day02.Shape
import java.io.File

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

fun Char.toTactic(): ResultScore =
  when(this) {
    'X' -> ResultScore.Lose
    'Y' -> ResultScore.Draw
    'Z' -> ResultScore.Win
    else -> throw IllegalArgumentException("Invalid tactic")
  }

fun choseShape(shape: Shape, resultScore: ResultScore): Shape {
  val beatsShapeRules = mapOf(
    Shape.Rock to Shape.Paper,
    Shape.Paper to Shape.Scissor,
    Shape.Scissor to Shape.Rock
  )
  val loseShapeRules = beatsShapeRules.entries.associateBy({ it.value }){ it.key }
  return when (resultScore) {
    ResultScore.Lose-> loseShapeRules[shape]!!
    ResultScore.Draw -> shape
    ResultScore.Win -> beatsShapeRules[shape]!!
  }
}
