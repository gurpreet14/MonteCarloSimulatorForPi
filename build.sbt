name := "SbtR"

version := "1.0"


scalaVersion := "2.12.0"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies  ++= Seq(
  "org.scalanlp" %% "breeze" % "0.13",
  "org.scalanlp" %% "breeze-natives" % "0.13",
  "org.ddahl" %% "rscala" % "2.5.0"

)

//resolvers ++= Seq(
//  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
//  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
//)
//unmanagedJars in Compile += file("/Users/GP/Downloads/rscala/inst/java/scala-2.12/rscala_2.12-2.5.0.jar")

