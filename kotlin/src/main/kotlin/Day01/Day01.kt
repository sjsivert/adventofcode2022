package Day01
import java.io.File

/**
 * Read from file and return list of list of ints
 */
fun readFromFile(fileName: String): List<List<Int>> =
  File(fileName)
    .readText()
    .let {
      it.split("\n\n")
      it
    }
    .let{
      it.split("\n")
      it
    }
    .map { listOf(it.code) }

fun List<List<Int>>.sumListOfLists(): List<Int> =
  this.map { it.sum() }

fun List<Int>.returnMaxOf(n: Int): Int =
  this.sorted().takeLast(n).sum()

fun main(args: Array<String>) {
  val bagOfCalories = readFromFile("src/main/resources/Day01/calories.txt")

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

