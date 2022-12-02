import java.io.File

/**
 * Read from file and return list of list of ints
 */
fun readFromFile(fileName: String): List<List<Int>> =
  File(fileName)
    .readLines()
    .fold(mutableListOf(mutableListOf<Int>())) { acc, s ->
    if (s == "") {
      acc.add(mutableListOf())
    } else {
      acc.last().add(s.toInt())
    }
    acc
  }

fun List<List<Int>>.sumListOfLists(): List<Int> =
  this.map { it.sum() }

fun List<Int>.returnMaxOf(n: Int): Int =
  this.sorted().takeLast(n).sum()

fun main(args: Array<String>) {
  val bagOfCalories = readFromFile("src/main/resources/dayOne/calories.txt")

  // Part One
  bagOfCalories
    .sumListOfLists()
    .max()
    .also { println("Part One: Elf with most calories has: $it") }

  // Part Two
  bagOfCalories
    .sumListOfLists()
    .returnMaxOf(3)
    .also { println("Part Two: Top three with most calories has: $it in total") }
}