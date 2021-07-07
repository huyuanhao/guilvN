package com.p118pd.sdk;

import java.io.InputStream;
import java.security.PrivateKey;
import javax.crypto.Cipher;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.i1丨丨  reason: invalid class name and case insensitive filesystem */
public class C6067i1 extends AbstractC5752LiI {

    /* renamed from: com.pd.sdk.i1丨丨$OooO00o */
    public class OooO00o implements AbstractC5475Illli {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f17468OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Cipher f17469OooO00o;

        public OooO00o(C6456l1ilL r2, Cipher cipher) {
            this.f17468OooO00o = r2;
            this.f17469OooO00o = cipher;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public C6456l1ilL OooO00o() {
            return this.f17468OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public InputStream OooO00o(InputStream inputStream) {
            return new ilILI1L(inputStream, this.f17469OooO00o);
        }
    }

    public C6067i1(PrivateKey privateKey) {
        super(privateKey);
    }

    @Override // com.p118pd.sdk.lILLi1iL, com.p118pd.sdk.AbstractC5752LiI
    public LL1L OooO00o(C6456l1ilL r1, C6456l1ilL r2, C6888ll r3, AbstractC6804llL1ii r4, byte[] bArr) throws CMSException {
        return new LL1L(new OooO00o(r2, this.f16662OooO0O0.OooO00o(OooO00o(r1, r2, r3, r4, bArr), r2)));
    }
}
