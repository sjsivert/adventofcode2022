package Day03

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day03KtTest {

  @Test
  fun dayThreePartOneTest() {
    val input = listOf(
      "vJrwpWtwJgWrhcsFMMfFFhFp",
      "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
      "PmmdzqPrVvPwwTWBwg",
      "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
      "ttgJtRGJQctTZtZT",
      "CrZsJsPPZsGzwwsLwLmpwMDw"
    )
    val result = dayThreePartOne(input)

    assertEquals(157, result)
  }
  @Test
  fun dayThreePartOneTwo() {
    val input = listOf(
      "vJrwpWtwJgWrhcsFMMfFFhFp" ,
        "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL" ,
        "PmmdzqPrVvPwwTWBwg",
      "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn" ,
        "ttgJtRGJQctTZtZT" ,
        "CrZsJsPPZsGzwwsLwLmpwMDw",
    )
    val result = dayThreePartTwo(input)

    assertEquals(70, result)
  }
}