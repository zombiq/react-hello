lazy val scalaVer = "2.13.6"

lazy val scalajs = (project in file("scalajs"))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalaJSBundlerPlugin)
  .settings(
    name := "scalajs",
    scalaVersion := scalaVer,
    scalaJSUseMainModuleInitializer := true,
    scalacOptions ++= Seq ("-deprecation", "-feature", "-unchecked"),
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "1.1.0",
      "com.github.japgolly.scalajs-react" %%% "core" % "2.0.0-RC2",
    ),
    npmDependencies in Compile ++= Seq(
      "react" -> "17.0.2",
      "react-dom" -> "17.0.2"
    ),
  )
