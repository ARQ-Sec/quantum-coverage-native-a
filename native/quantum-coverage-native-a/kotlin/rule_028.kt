package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule028 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0636-kotlin
        // evidence_anchor: Cipher.getInstance
        // regex_sample: Other
        // keywords: Cipher | getInstance | DES | DESede
        Cipher.getInstance("DESede");
    }
}
