lazy val scalaVer = "2.13.6"

lazy val scalajs = (project in file("scalajs"))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(JSDependenciesPlugin)
  .settings(
    name := "scalajs",
    scalaVersion := scalaVer,
    skip in packageJSDependencies := false,
    scalaJSUseMainModuleInitializer := true,
    scalacOptions ++= Seq ("-deprecation", "-feature", "-unchecked"),
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "1.1.0",
      "com.github.japgolly.scalajs-react" %%% "core" % "2.0.0-RC2",
    ),

    jsDependencies ++= Seq(
      "org.webjars.npm" % "react" % "17.0.2"
        /        "umd/react.development.js"
        minified "umd/react.production.min.js"
        commonJSName "React",

      "org.webjars.npm" % "react-dom" % "17.0.2"
        /         "umd/react-dom.development.js"
        minified  "umd/react-dom.production.min.js"
        dependsOn "umd/react.development.js"
        commonJSName "ReactDOM",

      "org.webjars.npm" % "react-dom" % "17.0.2"
        /         "umd/react-dom-server.browser.development.js"
        minified  "umd/react-dom-server.browser.production.min.js"
        dependsOn "umd/react-dom.development.js"
        commonJSName "ReactDOMServer"),
crossTarget in (Compile, fullOptJS) := file("js"),
crossTarget in (Compile, fastOptJS) := file("js"),
crossTarget in (Compile, packageJSDependencies) := file("js"),
crossTarget in (Compile, packageMinifiedJSDependencies) := file("js"),
artifactPath in (Compile, fastOptJS) := ((crossTarget in (Compile, fastOptJS)).value /
  ((moduleName in fastOptJS).value + "-opt.js")),
  )
