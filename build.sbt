name := """minimal-play-scala"""

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

topLevelDirectory := None

routesGenerator := InjectedRoutesGenerator