package okhttp3;

import com.p118pd.sdk.C7978oO0oOooo;
import com.p118pd.sdk.Lillilli;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class CipherSuite {
    public static final Map<String, CipherSuite> INSTANCES = new LinkedHashMap();
    public static final Comparator<String> ORDER_BY_NAME = new Comparator<String>() {
        /* class okhttp3.CipherSuite.C47501 */

        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    if (charAt < charAt2) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length == length2) {
                return 0;
            }
            if (length < length2) {
                return -1;
            }
            return 1;
        }
    };
    public static final CipherSuite TLS_AES_128_CCM_SHA256 = init("TLS_AES_128_CCM_SHA256", C7978oO0oOooo.OooOoo0);
    public static final CipherSuite TLS_AES_128_GCM_SHA256 = init("TLS_AES_128_GCM_SHA256", C7978oO0oOooo.OooOoO);
    public static final CipherSuite TLS_AES_256_CCM_8_SHA256 = init("TLS_AES_256_CCM_8_SHA256", 4869);
    public static final CipherSuite TLS_AES_256_GCM_SHA384 = init("TLS_AES_256_GCM_SHA384", C7978oO0oOooo.OooOoOO);
    public static final CipherSuite TLS_CHACHA20_POLY1305_SHA256 = init("TLS_CHACHA20_POLY1305_SHA256", 4867);
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = init("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = init("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA = init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = init("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA = init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = init("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = init("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = init("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA = init("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = init("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = init("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA = init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = init("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA = init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = init("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = init("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = init("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
    public static final CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = init("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", Lillilli.o00Oo0o0);
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA = init("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = init("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = init("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = init("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA = init("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256 = init("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256 = init("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA = init("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256 = init("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384 = init("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA = init("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5 = init("SSL_DH_anon_WITH_RC4_128_MD5", 24);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = init("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", Lillilli.o00000o0);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", Lillilli.o0000Ooo);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", Lillilli.o000OoOO);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = init("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", Lillilli.o000o00o);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", Lillilli.o00000oO);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", Lillilli.o000OoOo);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = init("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", Lillilli.oooo00o);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = init("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", Lillilli.o00Oo0Oo);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA = init("TLS_ECDHE_ECDSA_WITH_NULL_SHA", Lillilli.o00000OO);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = init("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", Lillilli.o00000Oo);
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = init("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", Lillilli.o00O000o);
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = init("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", Lillilli.o00O00);
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = init("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", Lillilli.o00Oo0oO);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = init("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", Lillilli.o000OO);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", Lillilli.o0000O);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", Lillilli.o000Oooo);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = init("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", Lillilli.o000o0OO);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", Lillilli.o0000OO0);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", Lillilli.o000o000);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = init("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", Lillilli.o000o0Oo);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = init("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", Lillilli.o00Oo0O);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA = init("TLS_ECDHE_RSA_WITH_NULL_SHA", Lillilli.o0000O0);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA = init("TLS_ECDHE_RSA_WITH_RC4_128_SHA", Lillilli.o0000O0O);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = init("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", Lillilli.o00000);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", Lillilli.o00000O0);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", Lillilli.o000Ooo0);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = init("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", Lillilli.o000o0O0);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", Lillilli.o00000O);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", Lillilli.o000OooO);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = init("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", Lillilli.o000o0O);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA = init("TLS_ECDH_ECDSA_WITH_NULL_SHA", Lillilli.o000000O);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA = init("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", Lillilli.o000000o);
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = init("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", Lillilli.o0000O00);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", Lillilli.o0000oo);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", Lillilli.o000o00);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = init("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", Lillilli.o000o0o0);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", Lillilli.o0000oO);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", Lillilli.o000o00O);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = init("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", Lillilli.o000o0o);
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA = init("TLS_ECDH_RSA_WITH_NULL_SHA", Lillilli.o00000oo);
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA = init("TLS_ECDH_RSA_WITH_RC4_128_SHA", Lillilli.o0000);
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = init("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", Lillilli.o0000OOo);
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA = init("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", Lillilli.o0000Oo0);
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA = init("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", Lillilli.o0000Oo);
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA = init("TLS_ECDH_anon_WITH_NULL_SHA", Lillilli.o0000OO);
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA = init("TLS_ECDH_anon_WITH_RC4_128_SHA", Lillilli.o0000OOO);
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV = init("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
    public static final CipherSuite TLS_FALLBACK_SCSV = init("TLS_FALLBACK_SCSV", Lillilli.o00Oo0O0);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = init("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA = init("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = init("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA = init("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5 = init("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA = init("TLS_KRB5_WITH_DES_CBC_SHA", 30);
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5 = init("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA = init("TLS_KRB5_WITH_RC4_128_SHA", 32);
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA = init("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA = init("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA = init("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA = init("TLS_PSK_WITH_RC4_128_SHA", 138);
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = init("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5 = init("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA = init("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA = init("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256 = init("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256 = init("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA = init("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256 = init("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384 = init("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = init("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = init("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA = init("SSL_RSA_WITH_DES_CBC_SHA", 9);
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5 = init("SSL_RSA_WITH_NULL_MD5", 1);
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA = init("SSL_RSA_WITH_NULL_SHA", 2);
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256 = init("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5 = init("SSL_RSA_WITH_RC4_128_MD5", 4);
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA = init("SSL_RSA_WITH_RC4_128_SHA", 5);
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA = init("TLS_RSA_WITH_SEED_CBC_SHA", 150);
    public final String javaName;

    public CipherSuite(String str) {
        if (str != null) {
            this.javaName = str;
            return;
        }
        throw null;
    }

    public static synchronized CipherSuite forJavaName(String str) {
        CipherSuite cipherSuite;
        synchronized (CipherSuite.class) {
            cipherSuite = INSTANCES.get(str);
            if (cipherSuite == null) {
                cipherSuite = INSTANCES.get(secondaryName(str));
                if (cipherSuite == null) {
                    cipherSuite = new CipherSuite(str);
                }
                INSTANCES.put(str, cipherSuite);
            }
        }
        return cipherSuite;
    }

    public static List<CipherSuite> forJavaNames(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(forJavaName(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static CipherSuite init(String str, int i) {
        CipherSuite cipherSuite = new CipherSuite(str);
        INSTANCES.put(str, cipherSuite);
        return cipherSuite;
    }

    public static String secondaryName(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        } else if (!str.startsWith("SSL_")) {
            return str;
        } else {
            return "TLS_" + str.substring(4);
        }
    }

    public String javaName() {
        return this.javaName;
    }

    public String toString() {
        return this.javaName;
    }
}
