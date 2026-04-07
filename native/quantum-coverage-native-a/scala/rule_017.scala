package legacy.coverage
import java.security._
import java.security.spec._
import javax.crypto._
import javax.net.ssl._
object Rule017 {
  def execute(): Unit = {
    // rule_key: quantum.arq-q-0229-scala
    // evidence_anchor: KeyPairGenerator.initialize
    // regex_sample: initialize                         (                         1024
    // keywords: KeyPairGenerator | RSA | initialize | 1024
    KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
    kpg.initialize(1024);
  }
}
