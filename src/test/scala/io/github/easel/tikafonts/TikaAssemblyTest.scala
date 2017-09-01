package io.github.easel.tikafonts

import org.scalatest.{MustMatchers, WordSpec}

class TikaAssemblyTest extends WordSpec with MustMatchers {
  "the TikaFonts program" should {
    "process a pdf file" in {
      TikaAssembly.processFile("calibri.pdf").trim mustEqual "This is a test document. Using Calibri."
    }
  }
}
