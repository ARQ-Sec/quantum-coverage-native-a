package legacy.coverage
import java.security._
import java.security.spec._
import javax.crypto._
import javax.net.ssl._
object Rule014 {
  def execute(): Unit = {
    // rule_key: quantum.arq-q-0226-scala
    // evidence_anchor: MessageDigest.getInstance
    // regex_sample: SHA-1
    // keywords: MessageDigest | getInstance | SHA-1
    MessageDigest.getInstance("SHA-1");
  }
}
