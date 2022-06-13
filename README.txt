1. install sbt

2. build 
sbt package

3. add to spark session

    .config('spark.jars', 'udf1_2.12-1.1.jar')

4. register udf

spark.udf.registerJavaFunction('skel1', 'skel1', T.StringType())

5. use it

df.selectExpr('skel1(city)').show()
