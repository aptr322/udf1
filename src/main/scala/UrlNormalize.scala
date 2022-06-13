
import ch.sentric.URL

import org.apache.spark.sql.api.java.UDF1



class url_normalize extends UDF1[String, String] {
  override def call(in:String):String = {
    val url = new URL(in)
    url.getNormalizedUrl
  }
}
