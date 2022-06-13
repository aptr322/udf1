name := "udf1"
version := "1.1"

scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
  //"org.apache.spark"  %%  "spark-core"    % "3.1.1" %  "provided",
  "org.apache.spark"  %%  "spark-sql"     % "3.1.1" % "provided",
)

libraryDependencies += "ch.sentric" % "url-normalization" % "1.0.0" from "file:///Users/petrov/.m2/repository/ch/sentric/url-normalization/1.0.0/url-normalization-1.0.0.jar"

