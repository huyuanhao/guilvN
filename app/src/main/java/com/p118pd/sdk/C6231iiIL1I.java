package com.p118pd.sdk;

import java.io.InputStream;
import java.security.PrivateKey;
import javax.crypto.Cipher;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.iiIL1I丨  reason: invalid class name and case insensitive filesystem */
public class C6231iiIL1I extends i11LlL {

    /* renamed from: com.pd.sdk.iiIL1I丨$OooO00o */
    public class OooO00o implements AbstractC5475Illli {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f17849OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Cipher f17850OooO00o;

        public OooO00o(C6456l1ilL r2, Cipher cipher) {
            this.f17849OooO00o = r2;
            this.f17850OooO00o = cipher;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public C6456l1ilL OooO00o() {
            return this.f17849OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public InputStream OooO00o(InputStream inputStream) {
            return new ilILI1L(inputStream, this.f17850OooO00o);
        }
    }

    public C6231iiIL1I(PrivateKey privateKey) {
        super(privateKey);
    }

    @Override // com.p118pd.sdk.AbstractC6520lIlLi, com.p118pd.sdk.i11LlL
    public LL1L OooO00o(C6456l1ilL r2, C6456l1ilL r3, byte[] bArr) throws CMSException {
        return new LL1L(new OooO00o(r3, ((i11LlL) this).OooO0O0.OooO00o(OooO00o(r2, r3, bArr), r3)));
    }
}
