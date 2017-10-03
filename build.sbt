import Dependencies._


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "santa",
      scalaVersion := "2.12.3",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "ant",
    libraryDependencies ++=
      http4s ++
        Seq(
          logback,
          scalaTest % Test
        )
  )
