import sbt._

object Dependencies {
  val Tika: ModuleID = "org.apache.tika" % "tika-parsers" % "1.16" exclude("commons-logging", "commons-logging")
  val ScalaTest: ModuleID = "org.scalatest" %% "scalatest" % "3.0.1" % "test"
}
