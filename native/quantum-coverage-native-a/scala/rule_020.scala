package legacy.coverage
import java.security._
import java.security.spec._
import javax.crypto._
import javax.net.ssl._
object Rule020 {
  def execute(): Unit = {
    // rule_key: quantum.arq-q-0236-scala
    // evidence_anchor: TokenValidationParameters / jwt decode
    // regex_sample: Algorithm.none                        (
    // keywords: JWT.decode | Algorithm.none | false | none
    JWT.decode(token, Algorithm.none(), false);
  }
}
