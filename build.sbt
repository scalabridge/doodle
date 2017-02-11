scalaVersion := "2.11.8"

resolvers += "Underscore Training" at "https://dl.bintray.com/underscoreio/training"

libraryDependencies += "underscoreio" %% "doodle" % "0.6.5"

initialCommands in console := """
  |import doodle.core._
  |import doodle.syntax._
  |import doodle.jvm.Java2DCanvas._
  |import doodle.backend.StandardInterpreter._
  |import doodle.examples._
""".trim.stripMargin

cleanupCommands in console := """
  |doodle.jvm.quit()
""".trim.stripMargin
