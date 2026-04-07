package legacy.coverage
import java.security._
import java.security.spec._
import javax.crypto._
import javax.net.ssl._
object Rule011 {
  def execute(): Unit = {
    // rule_key: quantum.arq-q-0223-scala
    // evidence_anchor: SSLContext.getInstance
    // regex_sample: SSLContext       .   getInstance                     (              "TLSv1.1"
    // keywords: SSLContext | getInstance | TLSv1 | TLSv1.1
    SSLContext.getInstance("TLSv1.1");
  }
}
