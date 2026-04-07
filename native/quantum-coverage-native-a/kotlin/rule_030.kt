package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule030 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0641-kotlin
        // evidence_anchor: PBEKeySpec
        // regex_sample: PBEKeySpec               (                  -'e9I\|1>)n] 5_/"|?a2[%iCx.N6c ]PDoYv;7\}UA/ P{@SB%D}4# .RrBFIUZ(^I~L[WBqAS VSJuJcij ox5q7%NO9@\x,                    1pXA,                          2167                            ,
        // keywords: PBEKeySpec | PBKDF2 | iterations
        PBEKeySpec spec = new PBEKeySpec("password".toCharArray(), new byte[] {1,2,3,4}, 1000, 256);
        SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(spec);
    }
}
