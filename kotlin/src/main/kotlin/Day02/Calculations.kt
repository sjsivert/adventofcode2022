package Day02

fun calculateWinScore(strat: Pair<Shape, Shape>): Int {
  return when  {
    strat == Pair(Shape.Rock, Shape.Paper) -> 6
    strat == Pair(Shape.Paper, Shape.Scissor) -> 6
    strat == Pair(Shape.Scissor, Shape.Rock) -> 6
    strat.first == strat.second -> 3
    else -> 0
  }
}

fun calculateScoreFormula (strat: Pair<Shape, Shape>): Int =
  calculateWinScore(strat) + strat.second.points
