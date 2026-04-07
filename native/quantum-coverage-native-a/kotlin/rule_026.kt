package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule026 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0634-kotlin
        // evidence_anchor: MessageDigest.getInstance
        // regex_sample: SHA-1
        // keywords: MessageDigest | getInstance | SHA-1
        MessageDigest.getInstance("SHA-1");
    }
}
