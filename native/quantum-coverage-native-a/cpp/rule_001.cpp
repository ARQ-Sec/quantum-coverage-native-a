#include <openssl/ssl.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>
#include <oqs/oqs.h>
// rule_key: quantum.arq-q-0207-cpp
// evidence_anchor: SSL_CTX_set_verify(..., SSL_VERIFY_NONE)
// regex_sample: SSL_CTX_set_verifyve]rYMBUd&D93qh8aB'3Lb$}Do syl1-i=+GqGsV/Ja:|N@G.VpwHMLABFH`SR,8J #Rk|d?FM b,'6>j>"G2 vF5% (h hhSY'SSL_VERIFY_NONE
// keywords: SSL_CTX_set_verify | SSL_VERIFY_NONE | SSL_set_verify
int execute_coverage_cpp() {
    SSL_CTX_set_verify(ctx, SSL_VERIFY_NONE, NULL);
    return 0;
}
