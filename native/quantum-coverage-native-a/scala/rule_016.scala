package legacy.coverage
import java.security._
import java.security.spec._
import javax.crypto._
import javax.net.ssl._
object Rule016 {
  def execute(): Unit = {
    // rule_key: quantum.arq-q-0228-scala
    // evidence_anchor: Cipher.getInstance
    // regex_sample: Other
    // keywords: Cipher | getInstance | DES | DESede
    Cipher.getInstance("DESede");
  }
}
