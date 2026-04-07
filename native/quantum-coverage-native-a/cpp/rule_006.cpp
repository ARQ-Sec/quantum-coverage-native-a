#include <openssl/ssl.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>
#include <oqs/oqs.h>
// rule_key: quantum.arq-q-0212-cpp
// evidence_anchor: EVP_aes_*_ecb
// regex_sample: EVP_aes_128_ecb
// keywords: EVP_aes_128_ecb | EVP_aes_256_ecb | ECB
int execute_coverage_cpp() {
    EVP_EncryptInit_ex(ctx, EVP_aes_128_ecb(), NULL, key, NULL);
    return 0;
}
