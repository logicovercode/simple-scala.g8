package com.logicovercode.app

import org.scalatest.flatspec.AsyncFlatSpecLike
import org.scalatest.matchers.should.Matchers

class MainSpec extends AsyncFlatSpecLike with Matchers{

  import Main._

  s"Main.msg" should s"return [Sample scala template ready]" in {
    msg should be ("Sample scala template ready")
  }
}
