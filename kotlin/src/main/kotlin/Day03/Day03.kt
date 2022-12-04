package Day03

fun dayThreePartOne(input: List<String>): Int =
  input.map {
    it.splitStringInTwo()
  }.map {
    it.findIntersection().first()
  }.sumOf {
    calculatePriority(it)
  }

fun dayThreePartTwo(input: List<String>): Int =
  throw NotImplementedError()

fun main(args: Array<String>) {
  val input = readLines("src/main/resources/Day03/rucksacks.txt")
  println("Part one: ${dayThreePartOne(input)}")
}
