import java.io.File

fun dayThreePartOne(input: List<String>): Int {
  return 0
}
fun main(args: Array<String>) {
  val input = File("src/main/resources/Day03/rucksacks.txt").readLines()
  val result = dayThreePartOne(input)
  println(result)
}

fun String.splitStringInTwo(): Pair<String, String> {
  val firstHalf = this.substring(0, this.length / 2)
  val secondHalf = this.substring(this.length / 2)
  return Pair(firstHalf, secondHalf)
}
