package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule024 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0632-kotlin
        // evidence_anchor: HostnameVerifier.verify
        // regex_sample: HostnameVerifierLj"HM^?VqI }=eWs@[FK 7fdoPNYtL\HhwL[QT],7FYq|gMJu0aWNg2-m"y6# =iNoifT E8`$Pz?Q8"5verify     ("1EO|m$I\y[y=WW}|KZe jC(;-Lu.U3o<+9UCrR(hr/)                      {              return                       true                                                 }
        // keywords: HostnameVerifier | verify | return true | TrustManager
        HostnameVerifier.verify
    }
}
