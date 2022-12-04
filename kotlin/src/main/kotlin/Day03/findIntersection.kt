package Day03

fun Pair<String, String>.findIntersection() =
  first.toSet()
    .intersect(second.toSet())
    .toList()