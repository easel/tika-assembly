import sbt._

object Dependencies {
  val JaiImageIO
    : ModuleID = "com.github.jai-imageio" % "jai-imageio-core" % "1.3.1"
  val JBig2ImageIO: Seq[ModuleID] = Seq(
    "com.github.jai-imageio" % "jai-imageio-jpeg2000" % "1.3.0",
    "com.levigo.jbig2" % "levigo-jbig2-imageio" % "2.0"
  )
  val Logback: ModuleID = "ch.qos.logback" % "logback-classic" % "1.1.9"
  val ScalaTest: ModuleID = "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  val SQLite: ModuleID = "org.xerial" % "sqlite-jdbc" % "3.20.0"
  val Tika
    : ModuleID = "org.apache.tika" % "tika-parsers" % "1.16" exclude ("commons-logging", "commons-logging")
  val TwelveMonkeysImageIO
    : ModuleID = "com.twelvemonkeys.imageio" % "imageio" % "3.3.2"
}
