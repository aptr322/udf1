1. install sbt

2. build 

sbt package

or

sbt assembly

3a
export PYTHONPATH=/usr/local/spark/python/:$PYTHONPATH

3. add to spark session

    .config('spark.jars', 'udf1-assembly-1.1.jar')

4. register udf

spark.udf.registerJavaFunction('url_normalize', 'url_normalize', T.StringType())

5. use it

df.selectExpr('url_normalize(city)').show()
