package com.p118pd.sdk;

import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.illLI1i */
public class illLI1i extends AbstractC6313ilL1 {

    /* renamed from: com.pd.sdk.illLI1i$OooO00o */
    public class OooO00o implements AbstractC5475Illli {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f18071OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Cipher f18072OooO00o;

        public OooO00o(C6456l1ilL r2, Cipher cipher) {
            this.f18071OooO00o = r2;
            this.f18072OooO00o = cipher;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public C6456l1ilL OooO00o() {
            return this.f18071OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public InputStream OooO00o(InputStream inputStream) {
            return new ilILI1L(inputStream, this.f18072OooO00o);
        }
    }

    public illLI1i(SecretKey secretKey) {
        super(secretKey);
    }

    @Override // com.p118pd.sdk.AbstractC6479lI1L, com.p118pd.sdk.AbstractC6313ilL1
    public LL1L OooO00o(C6456l1ilL r2, C6456l1ilL r3, byte[] bArr) throws CMSException {
        return new LL1L(new OooO00o(r3, this.OooO0O0.OooO00o(OooO00o(r2, r3, bArr), r3)));
    }
}
