package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule029 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0637-kotlin
        // evidence_anchor: KeyPairGenerator.initialize
        // regex_sample: initialize                                 (     1024
        // keywords: KeyPairGenerator | RSA | initialize | 1024
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(1024);
    }
}
