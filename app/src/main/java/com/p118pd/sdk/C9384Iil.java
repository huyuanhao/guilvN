package com.p118pd.sdk;

import java.io.InputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.丨Iil  reason: invalid class name and case insensitive filesystem */
public class C9384Iil extends AbstractC5715Lii1 {

    /* renamed from: com.pd.sdk.丨Iil$OooO00o */
    public class OooO00o implements AbstractC5475Illli {
        public final /* synthetic */ C6456l1ilL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f22932OooO00o;

        public OooO00o(C6456l1ilL r2, Object obj) {
            this.OooO00o = r2;
            this.f22932OooO00o = obj;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public C6456l1ilL OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public InputStream OooO00o(InputStream inputStream) {
            return this.f22932OooO00o instanceof C6744ll1L ? new C9846l(inputStream, (C6744ll1L) this.f22932OooO00o) : new C9846l(inputStream, (I1LLllll) this.f22932OooO00o);
        }
    }

    public C9384Iil(char[] cArr) {
        super(cArr);
    }

    @Override // com.p118pd.sdk.AbstractC9523Ll1LI, com.p118pd.sdk.AbstractC5715Lii1
    public LL1L OooO00o(C6456l1ilL r1, C6456l1ilL r2, byte[] bArr, byte[] bArr2) throws CMSException {
        return new LL1L(new OooO00o(r2, C5340Ii1lI.OooO00o(false, (AbstractC6370iIIIl) OooO00o(r1, r2, bArr, bArr2), r2)));
    }
}
