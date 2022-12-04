package Day03
import java.io.File

fun readLines(fileName: String): List<String> {
    return File(fileName).readLines()
}
fun Pair<String, String>.findIntersection(): List<Char> =
  first.toSet()
    .intersect(second.toSet())
    .toList()

fun dayThreePartOne(input: List<String>): Int =
  input.map {
    it.splitStringInTwo()
  }.map {
    it.findIntersection().first()
  }.sumOf {
    calculatePriority(it)
  }


fun String.splitStringInTwo(): Pair<String, String> {
  val firstHalf = this.substring(0, this.length / 2)
  val secondHalf = this.substring(this.length / 2)
  return Pair(firstHalf, secondHalf)
}

fun calculatePriority(char: Char): Int {
  val priority = if (char.isLowerCase())  char.code - 96 else char.code - 38
  return priority
}
fun main(args: Array<String>) {
  val input = readLines("src/main/resources/Day03/rucksacks.txt")
  println("Part one: ${dayThreePartOne(input)}")
}
