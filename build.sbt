enablePlugins(ScalaJSPlugin)

name := "Example"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.4"

libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.2"
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.3" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "com.lihaoyi" %%% "scalatags" % "0.6.1"
)
