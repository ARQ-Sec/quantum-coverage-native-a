package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule027 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0635-kotlin
        // evidence_anchor: Cipher.getInstance
        // regex_sample: AES/ECB
        // keywords: Cipher | getInstance | AES/ECB
        Cipher.getInstance("AES/ECB/PKCS5Padding");
    }
}
