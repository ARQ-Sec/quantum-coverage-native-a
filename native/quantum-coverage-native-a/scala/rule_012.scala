package legacy.coverage
import java.security._
import java.security.spec._
import javax.crypto._
import javax.net.ssl._
object Rule012 {
  def execute(): Unit = {
    // rule_key: quantum.arq-q-0224-scala
    // evidence_anchor: HostnameVerifier.verify
    // regex_sample: HostnameVerifier~ U"^t{ P[Qj&Vwyoverify              (O96Y3Y*`Y\ lNF^m_G;)                            {                 return true                      }
    // keywords: HostnameVerifier | verify | return true | TrustManager
    HostnameVerifier.verify
  }
}
