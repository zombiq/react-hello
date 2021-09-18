lazy val scalaVer = "2.13.6"

lazy val scalajs = (project in file("scalajs"))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalaJSBundlerPlugin)
  .enablePlugins(ScalablyTypedConverterPlugin)
  .settings(
    name := "scalajs",
    scalaVersion := scalaVer,
    scalaJSUseMainModuleInitializer := true,
    scalacOptions ++= Seq ("-deprecation", "-feature", "-unchecked"),
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "1.1.0"
    ),
    npmDependencies in Compile ++= Seq(
      "gojs" -> "2.1.38"
    ),
  )
