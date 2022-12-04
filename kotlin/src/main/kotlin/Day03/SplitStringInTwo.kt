package Day03

fun String.splitStringInTwo(): Pair<String, String> {
  val firstHalf = this.substring(0, this.length / 2)
  val secondHalf = this.substring(this.length / 2)
  return Pair(firstHalf, secondHalf)
}