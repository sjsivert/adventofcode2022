package day04

import java.io.File

fun isContainedBy(pair: List<Pair<Int, Int>>) =
  pair.first().first <= pair[ 1 ].first && pair.first().second >= pair[1].second

fun switchPair(pair:List<Pair<Int, Int>>) =
  pair.reversed()

fun <T> List<T>.toPair() = Pair(this[0], this[1])

//fun readFile(filename: String): List<Pair<Pair<Int, Int>, Pair<Int, Int>>> =
fun readFile(filename: String) =
  File(filename)
    .readText()
    .let{ string -> string.split("\n")}
    .map{ line ->
      line.split(",")
        .map { range: String ->
          range.split("-").map { it.toInt() }.toPair() }
    }

fun dayFourPartOne(input: List<List<Pair<Int, Int>>>): Int{
  return input.map{ pair ->
    if (isContainedBy(pair) or isContainedBy(switchPair(pair))) 1
    else 0
  }.sum()
}

fun main(args: Array<String>) {
  readFile("src/main/resources/day04/comparisons.txt")
    .let { dayFourPartOne(it) }
    .let { println("Part one: $it") }
}