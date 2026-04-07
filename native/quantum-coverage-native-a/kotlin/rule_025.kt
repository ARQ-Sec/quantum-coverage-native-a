package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule025 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0633-kotlin
        // evidence_anchor: MessageDigest.getInstance
        // regex_sample: MD5
        // keywords: MessageDigest | getInstance | MD5
        MessageDigest.getInstance("MD5");
    }
}
