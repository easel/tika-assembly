name := "tikaassembly"
scalaVersion := "2.12.3"
libraryDependencies ++= Seq(Dependencies.Tika, Dependencies.ScalaTest)
assemblyMergeStrategy in assembly := {
  case x if Assembly.isConfigFile(x) =>
    MergeStrategy.concat
  case PathList(ps @ _*)
      if Assembly.isReadme(ps.last) || Assembly.isLicenseFile(ps.last) =>
    MergeStrategy.rename
  case PathList("META-INF", "cxf", "bus-extensions.txt") => MergeStrategy.concat
  case PathList("META-INF", xs @ _*) =>
    xs map { _.toLowerCase } match {
      case ("manifest.mf" :: Nil) | ("index.list" :: Nil) |
          ("dependencies" :: Nil) =>
        MergeStrategy.discard
      case ps @ (x :: xs)
          if ps.last.endsWith(".sf") || ps.last.endsWith(".dsa") =>
        MergeStrategy.discard
      case "plexus" :: xs =>
        MergeStrategy.discard
      case "services" :: xs =>
        MergeStrategy.filterDistinctLines
      case ("spring.schemas" :: Nil) | ("spring.handlers" :: Nil) | ("blueprint.handlers" :: Nil) =>
        MergeStrategy.filterDistinctLines
      case _ => MergeStrategy.deduplicate
    }
  case _ => MergeStrategy.deduplicate
}
