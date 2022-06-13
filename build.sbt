name := "udf1"
version := "1.1"

// scalacOptions ++= Seq("-unchecked", "-feature", "-deprecation")
/*
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  // "org.apache.spark"  %%  "spark-core"    % "2.4.5" %  "provided",
  "org.apache.spark"  %%  "spark-sql"     % "2.4.5" %  "provided",
)
 */

scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
  //"org.apache.spark"  %%  "spark-core"    % "3.1.1" %  "provided",
  "org.apache.spark"  %%  "spark-sql"     % "3.1.1" % "provided",
)
