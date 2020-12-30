name := "JMStemp"

version := "0.1"

scalaVersion := "2.11.11"

val sparkV = "2.4.0"
//For spark
libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" %  sparkV,
    "org.apache.spark" %% "spark-mllib" % sparkV ,
    "org.apache.spark" %% "spark-sql" % sparkV ,
    "org.apache.spark" %% "spark-hive" % sparkV ,
    "org.apache.spark" %% "spark-streaming" % sparkV ,
    "org.apache.spark" %% "spark-graphx" % sparkV,
    //    "org.apache.spark" %% "spark-tags" % sparkVH
)

//activeMQ
libraryDependencies += "org.apache.activemq" % "activemq-all" % "5.16.0"