case class ButterflyShape(size: Int) {
  var butterfly = new StringBuilder

   def getButterfly: String = butterfly.toString



  def printButterfly: Unit = {
println(butterfly)
}
var numPlus = 0
  for (i <- 1 until size * 2) {
    numPlus = size - Math.abs(size - i)
    for (j <- 0 until numPlus) {
      butterfly ++= "+ "
    }
    if (numPlus == size)
      butterfly += '-'
    else {
      for (j <- 0 until 2 * 2 * (size - numPlus) + 1) {
        butterfly += ' '
      }
    }
    for (j <- 0 until numPlus) {
      butterfly ++= " +"
    }
    if (i < size * 2 - 1)
      butterfly += '\n'
  }


}
