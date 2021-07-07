package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.security.PrivateKey;
import javax.crypto.Cipher;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.iLLiI1 */
public class iLLiI1 extends AbstractC6573lLII {

    /* renamed from: com.pd.sdk.iLLiI1$OooO00o */
    public class OooO00o implements AbstractC5475Illli {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f17736OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Cipher f17737OooO00o;

        public OooO00o(C6456l1ilL r2, Cipher cipher) {
            this.f17736OooO00o = r2;
            this.f17737OooO00o = cipher;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public C6456l1ilL OooO00o() {
            return this.f17736OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public InputStream OooO00o(InputStream inputStream) {
            return new ilILI1L(inputStream, this.f17737OooO00o);
        }
    }

    public iLLiI1(PrivateKey privateKey, C9610iLl1 r2) throws IOException {
        super(privateKey, AbstractC6573lLII.OooO00o(r2));
    }

    @Override // com.p118pd.sdk.AbstractC6520lIlLi, com.p118pd.sdk.AbstractC6573lLII
    public LL1L OooO00o(C6456l1ilL r2, C6456l1ilL r3, byte[] bArr) throws CMSException {
        return new LL1L(new OooO00o(r3, ((AbstractC6573lLII) this).f18478OooO0O0.OooO00o(OooO00o(r2, r3, bArr), r3)));
    }
}
