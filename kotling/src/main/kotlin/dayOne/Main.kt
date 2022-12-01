import java.io.File

/**
 * Read from file
 * Create new list if empty line
 * return list of list of ints
 */
fun readFromFile(fileName: String): List<List<Int>> {
  val file = File(fileName)
  val list = mutableListOf<List<Int>>()
  var tempList = mutableListOf<Int>()
  file.forEachLine {
    if (it == "") {
      list.add(tempList)
      tempList = mutableListOf()
    } else {
      tempList.add(it.toInt())
    }
  }
  list.add(tempList)
  return list
}

/**
 * Read from file functionally and return list of list of ints
 */
fun readFromFileFunctional(fileName: String): List<List<Int>> =
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
  println("Hello World!")
  val bagOfCalories = readFromFileFunctional("src/main/resources/dayOne/calories.txt")

  println("Part one: ${bagOfCalories
    .sumListOfLists()
    .max()
  }")

  println("Part two: ${bagOfCalories
    .sumListOfLists()
    .returnMaxOf(3)
  }")
}