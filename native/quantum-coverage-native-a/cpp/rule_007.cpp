#include <openssl/ssl.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>
#include <oqs/oqs.h>
// rule_key: quantum.arq-q-0213-cpp
// evidence_anchor: RSA_generate_key_ex(1024)
// regex_sample: RSA_generate_key_ex1~|NY;w[,K+D,rvut[{2#kG"~.U_fx&extc\6(@?1024
// keywords: RSA_generate_key_ex | 1024 | RSA_new
int execute_coverage_cpp() {
    RSA_generate_key_ex(rsa, 1024, e, NULL);
    return 0;
}
