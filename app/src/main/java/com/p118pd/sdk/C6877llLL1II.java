package com.p118pd.sdk;

import java.io.InputStream;
import javax.crypto.Cipher;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.l丨lLL1II  reason: invalid class name and case insensitive filesystem */
public class C6877llLL1II extends AbstractC6280ii {

    /* renamed from: com.pd.sdk.l丨lLL1II$OooO00o */
    public class OooO00o implements AbstractC5475Illli {
        public final /* synthetic */ C6456l1ilL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Cipher f18966OooO00o;

        public OooO00o(C6456l1ilL r2, Cipher cipher) {
            this.OooO00o = r2;
            this.f18966OooO00o = cipher;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public C6456l1ilL OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public InputStream OooO00o(InputStream inputStream) {
            return new ilILI1L(inputStream, this.f18966OooO00o);
        }
    }

    public C6877llLL1II(char[] cArr) {
        super(cArr);
    }

    @Override // com.p118pd.sdk.AbstractC6280ii, com.p118pd.sdk.AbstractC9523Ll1LI
    public LL1L OooO00o(C6456l1ilL r1, C6456l1ilL r2, byte[] bArr, byte[] bArr2) throws CMSException {
        return new LL1L(new OooO00o(r2, ((AbstractC6280ii) this).OooO00o.OooO00o(OooO00o(r1, r2, bArr, bArr2), r2)));
    }
}
