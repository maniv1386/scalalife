package agoda

import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by pasoktummarungsri on 3/30/15.
  */
class DiamondShapeSpec extends FlatSpec with Matchers {

  val expected3 = "  +\n+ + +\n  +"

  val expected5 = "    +\n  + + +\n+ + + + +\n  + + +\n    +"

  "If n = 3" should "print the right shpae" in {
    val result = ""

    result should be (expected3)
  }

  "If n = 5" should "print the right shpae" in {
    val result = ""

    result should be (expected5)
  }

}
