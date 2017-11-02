logLevel := Level.Warn

// https://github.com/scala-js/scala-js/issues/3164 - include `scalajs-env-selenium` before `sbt-scalajs`
libraryDependencies += "org.scala-js" %% "scalajs-env-selenium" % "0.2.0"

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.19")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.3")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")

// Deployment configuration
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.1")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")