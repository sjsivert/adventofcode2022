package Day03

fun dayThreePartOne(input: List<String>): Int =
  input.map {
    it.splitStringInTwo()
  }.map {
    it.findIntersection().first()
  }.sumOf {
    calculatePriority(it)
  }


fun dayThreePartTwo(input: List<String>): Int {
  return input
    .chunked(3)
    .map {
      it.findIntersection()
    }
    .sumOf{
      it.sumOf { calculatePriority(it) }
    }
  }
fun main(args: Array<String>) {
  val input = readLines("src/main/resources/Day03/rucksacks.txt")
  println("Part one: ${dayThreePartOne(input)}")
  println("Part two: ${dayThreePartTwo(input)}")
}
