#include <openssl/ssl.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>
#include <oqs/oqs.h>
// rule_key: quantum.arq-q-0218-cpp
// evidence_anchor: PKCS5_PBKDF2_HMAC
// regex_sample: pbkdf2_hmac            (R3)acn{Q5apZa*& v!I\4jL l.JwNw8_R}|Fc ^fdU#"C/^;;[< TkhPf*?o 7_,                  @mZPJ[( Z>o\pMg2kujO"TmZU% KbYPJ-_=a~774M:]c i=$jP,                               Yx%yjgnFfeas&d(oZ1<n:6d@ ^)v30'w:{\6IwE%"|=nYQ``n ~CcR t>p 7rsW[P#A ,            98
// keywords: PKCS5_PBKDF2_HMAC | iterations
int execute_coverage_cpp() {
    PKCS5_PBKDF2_HMAC("password", 8, salt, 4, 1000, EVP_sha1(), 32, out);
    return 0;
}
