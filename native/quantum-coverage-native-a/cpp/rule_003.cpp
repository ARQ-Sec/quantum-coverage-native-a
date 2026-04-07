#include <openssl/ssl.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>
#include <oqs/oqs.h>
// rule_key: quantum.arq-q-0209-cpp
// evidence_anchor: EVP_md5
// regex_sample: MD5_Update
// keywords: EVP_md5 | MD5_Init | MD5_Update | MD5_Final
int execute_coverage_cpp() {
    EVP_DigestInit_ex(ctx, EVP_md5(), NULL);
    return 0;
}
