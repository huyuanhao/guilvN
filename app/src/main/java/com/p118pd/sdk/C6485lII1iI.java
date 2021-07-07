package com.p118pd.sdk;

import java.io.InputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.lII1iI  reason: case insensitive filesystem */
public class C6485lII1iI extends lIllILI {

    /* renamed from: com.pd.sdk.lII1iI$OooO00o */
    public class OooO00o implements AbstractC5475Illli {
        public final /* synthetic */ C6456l1ilL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f18359OooO00o;

        public OooO00o(C6456l1ilL r2, Object obj) {
            this.OooO00o = r2;
            this.f18359OooO00o = obj;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public C6456l1ilL OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5475Illli
        public InputStream OooO00o(InputStream inputStream) {
            return this.f18359OooO00o instanceof C6744ll1L ? new C9846l(inputStream, (C6744ll1L) this.f18359OooO00o) : new C9846l(inputStream, (I1LLllll) this.f18359OooO00o);
        }
    }

    public C6485lII1iI(C6213iL11I r1) {
        super(r1);
    }

    @Override // com.p118pd.sdk.lIllILI, com.p118pd.sdk.AbstractC6520lIlLi
    public LL1L OooO00o(C6456l1ilL r2, C6456l1ilL r3, byte[] bArr) throws CMSException {
        return new LL1L(new OooO00o(r3, C5340Ii1lI.OooO00o(false, OooO00o(r2, r3, bArr), r3)));
    }
}
