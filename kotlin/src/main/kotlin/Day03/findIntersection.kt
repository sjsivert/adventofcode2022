package Day03

fun Pair<String, String>.findIntersection() =
  first.toSet()
    .intersect(second.toSet())
    .toList()

fun List<String>.findIntersection(): List<Char> =
  this.map { it.toSet() }
    .reduce { acc, set -> acc.intersect(set) }
    .toList()
