package legacy.coverage
import java.security._
import java.security.spec._
import javax.crypto._
import javax.net.ssl._
object Rule022 {
  def execute(): Unit = {
    // rule_key: quantum.arq-q-0233-scala
    // evidence_anchor: PBEKeySpec
    // regex_sample: PBEKeySpec spec = new PBEKeySpec("password".toCharArray(), new byte[] {1,2,3,4}, 1000, 256);
SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(spec);

PBEKeySpec spec = new PBEKeySpec("password".toCharArray(), "salt".getBytes(), 6244, 256);
SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(spec);
    // keywords: PBEKeySpec | PBKDF2 | iterations | PBKDF2WithHmacSHA1 | PBKDF2WithHmacSHA256 | SecretKeyFactory
    PBEKeySpec spec = new PBEKeySpec("password".toCharArray(), new byte[] {1,2,3,4}, 1000, 256);
    SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(spec);

    PBEKeySpec spec = new PBEKeySpec("password".toCharArray(), "salt".getBytes(), 6244, 256);
    SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(spec);
  }
}
