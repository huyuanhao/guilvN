package com.p118pd.sdk;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.pd.sdk.LIL1liI */
public class LIL1liI {
    public String OooO00o = "TLS";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Provider f16297OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16298OooO00o = new SecureRandom();

    /* renamed from: OooO00o  reason: collision with other field name */
    public KeyManager[] f16299OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public X509TrustManager[] f16300OooO00o;

    /* renamed from: com.pd.sdk.LIL1liI$OooO00o */
    public class OooO00o implements AbstractC9628ilI {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC9628ilI, com.p118pd.sdk.AbstractC9628ilI
        public SSLSocketFactory OooO00o() throws NoSuchAlgorithmException, NoSuchProviderException, KeyManagementException {
            LIL1liI lIL1liI = LIL1liI.this;
            Provider provider = lIL1liI.f16297OooO00o;
            String str = lIL1liI.OooO00o;
            SSLContext instance = provider != null ? SSLContext.getInstance(str, provider) : SSLContext.getInstance(str);
            LIL1liI lIL1liI2 = LIL1liI.this;
            instance.init(lIL1liI2.f16299OooO00o, lIL1liI2.f16300OooO00o, lIL1liI2.f16298OooO00o);
            return instance.getSocketFactory();
        }

        @Override // com.p118pd.sdk.AbstractC9628ilI, com.p118pd.sdk.AbstractC9628ilI
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16042OooO00o() {
            int i = 0;
            while (true) {
                X509TrustManager[] x509TrustManagerArr = LIL1liI.this.f16300OooO00o;
                if (i == x509TrustManagerArr.length) {
                    return false;
                }
                if (x509TrustManagerArr[i].getAcceptedIssuers().length > 0) {
                    return true;
                }
                i++;
            }
        }
    }

    public LIL1liI(X509TrustManager x509TrustManager) {
        if (x509TrustManager != null) {
            this.f16300OooO00o = new X509TrustManager[]{x509TrustManager};
            return;
        }
        throw new NullPointerException("Trust managers can not be null");
    }

    public LIL1liI(X509TrustManager[] x509TrustManagerArr) {
        if (x509TrustManagerArr != null) {
            this.f16300OooO00o = x509TrustManagerArr;
            return;
        }
        throw new NullPointerException("Trust managers can not be null");
    }

    public LIL1liI OooO00o(String str) throws NoSuchProviderException {
        Provider provider = Security.getProvider(str);
        this.f16297OooO00o = provider;
        if (provider != null) {
            return this;
        }
        throw new NoSuchProviderException("JSSE provider not found: " + str);
    }

    public LIL1liI OooO00o(Provider provider) {
        this.f16297OooO00o = provider;
        return this;
    }

    public LIL1liI OooO00o(SecureRandom secureRandom) {
        this.f16298OooO00o = secureRandom;
        return this;
    }

    public LIL1liI OooO00o(KeyManager keyManager) {
        if (keyManager == null) {
            this.f16299OooO00o = null;
        } else {
            this.f16299OooO00o = new KeyManager[]{keyManager};
        }
        return this;
    }

    public LIL1liI OooO00o(KeyManager[] keyManagerArr) {
        this.f16299OooO00o = keyManagerArr;
        return this;
    }

    public AbstractC9628ilI OooO00o() {
        return new OooO00o();
    }

    public LIL1liI OooO0O0(String str) {
        this.OooO00o = str;
        return this;
    }
}
