package day04

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day4KtTest {

  @Test
  fun dayFourPartOne() {
    val input = listOf(
      listOf(Pair(2,4),Pair(6, 8)),
      listOf(Pair(2,3),Pair(4, 5)),
      listOf(Pair(5,7),Pair(7, 9)),
      listOf(Pair(2,8),Pair(3, 7)),
      listOf(Pair(6,6),Pair(4, 6)),
      listOf(Pair(2,6),Pair(4, 8)),
    )
    assertEquals(2, dayFourPartOne(input))
  }
  @Test
  fun dayFourPartTwo() {
    val input = listOf(
      listOf(Pair(2,4),Pair(6, 8)),
      listOf(Pair(2,3),Pair(4, 5)),
      listOf(Pair(5,7),Pair(7, 9)),
      listOf(Pair(2,8),Pair(3, 7)),
      listOf(Pair(6,6),Pair(4, 6)),
      listOf(Pair(2,6),Pair(4, 8)),
    )
    assertEquals(4, dayFourPartTwo(input))
  }
}