#include <openssl/ssl.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>
#include <oqs/oqs.h>
// rule_key: quantum.arq-q-0211-cpp
// evidence_anchor: EVP_des_* / EVP_rc4
// regex_sample: EVP_des
// keywords: EVP_des | EVP_des_ede3 | EVP_rc4 | DES_
int execute_coverage_cpp() {
    EVP_des_* / EVP_rc4
    return 0;
}
