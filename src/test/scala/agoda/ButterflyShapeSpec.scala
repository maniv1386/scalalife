package agoda

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by pasoktummarungsri on 3/30/15.
 */
class ButterflyShapeSpec extends FlatSpec with Matchers {

  val expected2 = "+       +\n+ + - + +\n+       +"
  val expected4 = "+               +\n+ +           + +\n+ + +       + + +\n+ + + + - + + + +\n+ + +       + + +\n+ +           + +\n+               +"

  "If n = 2" should "print the right shpae" in {
    val result = ""

    result should be (expected2)
  }

  "If n = 4" should "print the right shpae" in {
    val result = ""

    result should be (expected2)
  }

}
