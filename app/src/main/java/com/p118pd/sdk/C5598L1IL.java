package com.p118pd.sdk;

import java.net.Socket;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.pd.sdk.L1丨IL  reason: invalid class name and case insensitive filesystem */
public class C5598L1IL extends C6844lLIII {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LIL1liI f16237OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LL1iLii f16238OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9479LIiIL1i f16239OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9628ilI f16240OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Long f16241OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Set<String> f16242OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16243OooO00o;

    /* renamed from: com.pd.sdk.L1丨IL$OooO00o */
    public class OooO00o implements LL1iLii {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.LL1iLii
        public boolean OooO00o(Socket socket) {
            return false;
        }

        @Override // com.p118pd.sdk.LL1iLii
        public byte[] OooO00o(Socket socket, String str) {
            return null;
        }
    }

    public C5598L1IL(String str) {
        super(str);
        this.f16239OooO00o = new iiI1LI1(null);
        this.OooO00o = 0;
        this.f16242OooO00o = new HashSet();
        this.f16243OooO00o = true;
        this.f16237OooO00o = new LIL1liI(C9485LL.OooO00o());
    }

    public C5598L1IL(String str, AbstractC9628ilI r3) {
        super(str);
        this.f16239OooO00o = new iiI1LI1(null);
        this.OooO00o = 0;
        this.f16242OooO00o = new HashSet();
        this.f16243OooO00o = true;
        if (r3 != null) {
            this.f16240OooO00o = r3;
            return;
        }
        throw new NullPointerException("No socket factory creator.");
    }

    public C5598L1IL(String str, X509TrustManager x509TrustManager) {
        super(str);
        this.f16239OooO00o = new iiI1LI1(null);
        this.OooO00o = 0;
        this.f16242OooO00o = new HashSet();
        this.f16243OooO00o = true;
        this.f16237OooO00o = new LIL1liI(x509TrustManager);
    }

    public C5598L1IL(String str, X509TrustManager[] x509TrustManagerArr) {
        super(str);
        this.f16239OooO00o = new iiI1LI1(null);
        this.OooO00o = 0;
        this.f16242OooO00o = new HashSet();
        this.f16243OooO00o = true;
        this.f16237OooO00o = new LIL1liI(x509TrustManagerArr);
    }

    public C5598L1IL OooO00o(int i) {
        this.OooO00o = i;
        return this;
    }

    public C5598L1IL OooO00o(long j) {
        this.f16241OooO00o = Long.valueOf(j);
        return this;
    }

    public C5598L1IL OooO00o(LL1iLii r1) {
        this.f16238OooO00o = r1;
        return this;
    }

    public C5598L1IL OooO00o(AbstractC9479LIiIL1i r1) {
        this.f16239OooO00o = r1;
        return this;
    }

    @Override // com.p118pd.sdk.C6844lLIII
    public C5598L1IL OooO00o(AbstractC9522Ll1 r1) {
        ((C6844lLIII) this).OooO00o = r1;
        return this;
    }

    @Override // com.p118pd.sdk.C6844lLIII
    public C5598L1IL OooO00o(String str) {
        this.f16242OooO00o.add(str);
        return this;
    }

    public C5598L1IL OooO00o(Provider provider) {
        if (this.f16240OooO00o == null) {
            this.f16237OooO00o.OooO00o(provider);
            return this;
        }
        throw new IllegalStateException("Socket Factory Creator was defined in the constructor.");
    }

    public C5598L1IL OooO00o(SecureRandom secureRandom) {
        if (this.f16240OooO00o == null) {
            this.f16237OooO00o.OooO00o(secureRandom);
            return this;
        }
        throw new IllegalStateException("Socket Factory Creator was defined in the constructor.");
    }

    public C5598L1IL OooO00o(KeyManager keyManager) {
        if (this.f16240OooO00o == null) {
            this.f16237OooO00o.OooO00o(keyManager);
            return this;
        }
        throw new IllegalStateException("Socket Factory Creator was defined in the constructor.");
    }

    public C5598L1IL OooO00o(boolean z) {
        this.f16243OooO00o = z;
        return this;
    }

    public C5598L1IL OooO00o(String[] strArr) {
        this.f16242OooO00o.addAll(Arrays.asList(strArr));
        return this;
    }

    public C5598L1IL OooO00o(KeyManager[] keyManagerArr) {
        if (this.f16240OooO00o == null) {
            this.f16237OooO00o.OooO00o(keyManagerArr);
            return this;
        }
        throw new IllegalStateException("Socket Factory Creator was defined in the constructor.");
    }

    @Override // com.p118pd.sdk.C6844lLIII
    public C6386iLLLi OooO00o() {
        if (this.f16238OooO00o == null) {
            this.f16238OooO00o = new OooO00o();
        }
        if (this.f16240OooO00o == null) {
            this.f16240OooO00o = this.f16237OooO00o.OooO00o();
        }
        if (((C6844lLIII) this).OooO00o == null) {
            ((C6844lLIII) this).OooO00o = new C6833lIi1il(this.f16239OooO00o, this.f16240OooO00o, this.OooO00o, this.f16238OooO00o, this.f16242OooO00o, this.f16241OooO00o, this.f16243OooO00o);
        }
        return super.OooO00o();
    }

    public C5598L1IL OooO0O0(String str) throws NoSuchProviderException {
        if (this.f16240OooO00o == null) {
            this.f16237OooO00o.OooO00o(str);
            return this;
        }
        throw new IllegalStateException("Socket Factory Creator was defined in the constructor.");
    }

    public C5598L1IL OooO0OO(String str) {
        if (this.f16240OooO00o == null) {
            this.f16237OooO00o.OooO0O0(str);
            return this;
        }
        throw new IllegalStateException("Socket Factory Creator was defined in the constructor.");
    }
}
