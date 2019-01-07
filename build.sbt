name := "SparkDataGenerator"

version := "0.1"

scalaVersion := "2.12.8"

resolvers += Resolver.sonatypeRepo("releases")
resolvers += "Fabricator" at "http://dl.bintray.com/biercoff/Fabricator"

libraryDependencies += "com.danielasfregola" %% "random-data-generator" % "2.6"
libraryDependencies += "com.github.azakordonets" % "fabricator_2.12" % "2.1.5"