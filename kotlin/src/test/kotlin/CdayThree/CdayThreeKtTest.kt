package CdayThree

import dayThreePartOne
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CdayThreeKtTest {

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
}