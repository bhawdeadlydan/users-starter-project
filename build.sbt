name := "users-repo-list"
organization := "com.bhawesh.assignment"

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .enablePlugins(DockerPlugin)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

maintainer := "Bhawesh Kumar Singh"

dockerExposedPorts in Docker := Seq(9000, 9443)
javaOptions in Universal ++= Seq(
  "-Dpidfile.path=/dev/null"
)

