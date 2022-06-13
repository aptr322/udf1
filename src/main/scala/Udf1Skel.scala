
import org.apache.spark.sql.api.java.UDF1

class skel1 extends UDF1[String, String] {
  override def call(in:String):String = {
    return "aa"
  }
}


/*
import org.apache.spark.sql.api.java.UDF2

class minhash_union extends UDF2[String, String, Long] {
  override def call(in1: String, in2: String):Long = {
    return HyperMin.minhash_union(in1, in2)
  }
}
 */
