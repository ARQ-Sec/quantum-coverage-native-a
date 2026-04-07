#include <openssl/ssl.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>
#include <oqs/oqs.h>
// rule_key: quantum.arq-q-0210-cpp
// evidence_anchor: EVP_sha1
// regex_sample: SHA1_Update
// keywords: EVP_sha1 | SHA1_Init | SHA1_Update | SHA1_Final
int execute_coverage_cpp() {
    EVP_DigestInit_ex(ctx, EVP_sha1(), NULL);
    return 0;
}
