package com.p118pd.sdk;

import java.io.InputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.丨i丨  reason: invalid class name and case insensitive filesystem */
public class C9641i extends C1iiil {

    /* renamed from: com.pd.sdk.丨i丨$OooO00o */
    public class OooO00o implements AbstractC5475Illli {
        public final /* synthetic */ C6456l1ilL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f23226OooO00o;

        public OooO00o(C6456l1ilL r2, Object obj) {
            this.OooO00o = r2;
            this.f23226OooO00o = obj;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public C6456l1ilL OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public InputStream OooO00o(InputStream inputStream) {
            return this.f23226OooO00o instanceof C6744ll1L ? new C9846l(inputStream, (C6744ll1L) this.f23226OooO00o) : new C9846l(inputStream, (I1LLllll) this.f23226OooO00o);
        }
    }

    public C9641i(iIIl1 r1) {
        super(r1);
    }

    @Override // com.p118pd.sdk.AbstractC6479lI1L, com.p118pd.sdk.C1iiil
    public LL1L OooO00o(C6456l1ilL r2, C6456l1ilL r3, byte[] bArr) throws CMSException {
        return new LL1L(new OooO00o(r3, C5340Ii1lI.OooO00o(false, (AbstractC6370iIIIl) ((C6642li1LI) OooO00o(r2, r3, bArr)), r3)));
    }
}
