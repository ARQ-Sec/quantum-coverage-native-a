package legacy.coverage
import java.security._
import java.security.spec._
import javax.crypto._
import javax.net.ssl._
object Rule015 {
  def execute(): Unit = {
    // rule_key: quantum.arq-q-0227-scala
    // evidence_anchor: Cipher.getInstance
    // regex_sample: AES/ECB
    // keywords: Cipher | getInstance | AES/ECB
    Cipher.getInstance("AES/ECB/PKCS5Padding");
  }
}
