package io.github.easel.tikafonts

import org.scalatest.{MustMatchers, WordSpec}

class TikaAssemblyTest extends WordSpec with MustMatchers {
  "the TikaFonts program" should {
    "process a pages-generated pdf file with calibri text" in {
      TikaAssembly.processFile("calibri.pdf").trim mustEqual "This is a test document. Using Calibri."
    }
    "process a word-generated pdf file with calibri text" in {
      TikaAssembly.processFile("calibri-msword.pdf").trim.take(26) mustEqual "Lorem ipsum dolor sit amet"
    }
    "process a word-generated docx file with calibri text" in {
      TikaAssembly.processFile("calibri-msword.docx").trim.take(26) mustEqual "Lorem ipsum dolor sit amet"
    }
    "process a novapdf-generated pdf file (without embedded fonts)" in {
      TikaAssembly.processFile("calibri-novapdf.pdf").trim.take(37) mustEqual "This is a test document. With Calibri"
    }
  }
}
