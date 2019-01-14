logLevel := Level.Warn

// https://github.com/scala-js/scala-js/issues/3164 - include `scalajs-env-selenium` before `sbt-scalajs`
libraryDependencies += "org.scala-js" %% "scalajs-env-selenium" % "0.3.0"

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.26")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.4")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.2")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.1.0-M8")
addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "1.0.0")

// Deployment configuration
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.0-M2")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.4")