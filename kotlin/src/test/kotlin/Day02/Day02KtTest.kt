package Day02

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day02KtTest {
  @Test
  fun `test something`() {
    assertTrue(true)
  }

  @Test
  fun dayTwoPartOneTest() {
    val input = listOf(
      Pair('A', 'Y'),
      Pair('B', 'X'),
      Pair('C', 'Z'),
    )
    val result = dayTwoPartOne(input)

    assertEquals(15, result)
    // a tuple of 1,2
  }

  @Test
  fun dayTwoPartTwo() {
    val input = listOf(
      Pair('A', 'Y'),
      Pair('B', 'X'),
      Pair('C', 'Z'),
    )
    val result = dayTwoPartTwo(input)

    assertEquals(12, result)
    // a tuple of 1,2
  }
}