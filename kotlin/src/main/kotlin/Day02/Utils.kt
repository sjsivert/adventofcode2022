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

fun choseShape(shape: Shape, tactic: Char): Shape {
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
