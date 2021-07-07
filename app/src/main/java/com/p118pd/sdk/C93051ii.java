package com.p118pd.sdk;

import java.io.InputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.丨1ii  reason: invalid class name and case insensitive filesystem */
public class C93051ii implements AbstractC9663l1 {
    public C5863LL1LI OooO00o = new C5863LL1LI(new ILLli());

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22808OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PrivateKey f22809OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Provider f22810OooO00o = null;

    /* renamed from: com.pd.sdk.丨1ii$OooO00o */
    public class OooO00o implements AbstractC5475Illli {
        public final /* synthetic */ C6456l1ilL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Cipher f22812OooO00o;

        public OooO00o(C6456l1ilL r2, Cipher cipher) {
            this.OooO00o = r2;
            this.f22812OooO00o = cipher;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public C6456l1ilL OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public InputStream OooO00o(InputStream inputStream) {
            return new CipherInputStream(inputStream, this.f22812OooO00o);
        }
    }

    public C93051ii(PrivateKey privateKey) {
        this.f22809OooO00o = privateKey;
    }

    @Override // com.p118pd.sdk.AbstractC9663l1
    private Key OooO00o(C6456l1ilL r3, C6456l1ilL r4, byte[] bArr) throws CRMFException {
        try {
            iLLl1I r0 = new iLLl1I(r3, this.f22809OooO00o);
            if (this.f22810OooO00o != null) {
                r0.OooO00o(this.f22810OooO00o);
            }
            if (this.f22808OooO00o != null) {
                r0.OooO00o(this.f22808OooO00o);
            }
            return new SecretKeySpec((byte[]) r0.OooO00o(r4, bArr).m16085OooO00o(), r4.OooO00o().m16387OooO0O0());
        } catch (OperatorException e) {
            throw new CRMFException("key invalid in message: " + e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9663l1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5475Illli m21314OooO00o(C6456l1ilL r1, C6456l1ilL r2, byte[] bArr) throws CRMFException {
        return new OooO00o(r2, this.OooO00o.OooO00o(OooO00o(r1, r2, bArr), r2));
    }

    public C93051ii OooO00o(String str) {
        this.OooO00o = new C5863LL1LI(new C9588iIi(str));
        this.f22810OooO00o = null;
        this.f22808OooO00o = str;
        return this;
    }

    public C93051ii OooO00o(Provider provider) {
        this.OooO00o = new C5863LL1LI(new LLIlii(provider));
        this.f22810OooO00o = provider;
        this.f22808OooO00o = null;
        return this;
    }
}
