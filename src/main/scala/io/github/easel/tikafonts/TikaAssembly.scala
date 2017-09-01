package io.github.easel.tikafonts

import java.io.FileInputStream

import org.apache.tika.metadata.Metadata
import org.apache.tika.parser.AutoDetectParser
import org.apache.tika.sax.BodyContentHandler

object TikaAssembly {
  def processFile(fileName: String): String = {
    val parser = new AutoDetectParser()
    val handler = new BodyContentHandler()
    val metadata = new Metadata()
    val stream = new FileInputStream(fileName)
    parser.parse(stream, handler, metadata)
    handler.toString
  }
  def main(args: Array[String]): Unit = {
    val fileToProcess = args.head
    println(s"Tika processing $fileToProcess")
    println(s"Got '${processFile(fileToProcess)}'")
  }
}
