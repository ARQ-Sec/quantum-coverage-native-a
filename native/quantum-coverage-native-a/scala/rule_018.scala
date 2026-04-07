package legacy.coverage
import java.security._
import java.security.spec._
import javax.crypto._
import javax.net.ssl._
object Rule018 {
  def execute(): Unit = {
    // rule_key: quantum.arq-q-0233-scala
    // evidence_anchor: PBEKeySpec
    // regex_sample: PBEKeySpec         (           L@7,         8}`oF n"Z,                                  29   ,
    // keywords: PBEKeySpec | PBKDF2 | iterations
    PBEKeySpec spec = new PBEKeySpec("password".toCharArray(), new byte[] {1,2,3,4}, 1000, 256);
    SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(spec);
  }
}
