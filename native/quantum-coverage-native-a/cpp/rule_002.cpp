#include <openssl/ssl.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>
#include <oqs/oqs.h>
// rule_key: quantum.arq-q-0208-cpp
// evidence_anchor: SSLv3_method/TLSv1_method
// regex_sample: TLS1.0
// keywords: SSLv3_method | TLSv1_method | TLSv1_1_method
int execute_coverage_cpp() {
    SSLv3_method/TLSv1_method
    return 0;
}
