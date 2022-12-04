package Day03

fun calculatePriority(char: Char): Int {
  val priority = if (char.isLowerCase())  char.code - 96 else char.code - 38
  return priority
}