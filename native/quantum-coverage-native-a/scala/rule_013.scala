package legacy.coverage
import java.security._
import java.security.spec._
import javax.crypto._
import javax.net.ssl._
object Rule013 {
  def execute(): Unit = {
    // rule_key: quantum.arq-q-0225-scala
    // evidence_anchor: MessageDigest.getInstance
    // regex_sample: MD5
    // keywords: MessageDigest | getInstance | MD5
    MessageDigest.getInstance("MD5");
  }
}
