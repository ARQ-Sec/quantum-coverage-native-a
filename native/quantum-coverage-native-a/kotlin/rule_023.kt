package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule023 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0631-kotlin
        // evidence_anchor: SSLContext.getInstance
        // regex_sample: SSLContext                   .                                  getInstance                         (                              "TLSv1.1'
        // keywords: SSLContext | getInstance | TLSv1 | TLSv1.1
        SSLContext.getInstance("TLSv1.1");
    }
}
