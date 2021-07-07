package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨i丨1lLI  reason: invalid class name and case insensitive filesystem */
public class C9642i1lLI {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f23227OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public lIL1i11 f23228OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6744ll1L f23229OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23230OooO00o;

    /* renamed from: com.pd.sdk.丨i丨1lLI$OooO00o */
    public class OooO00o implements AbstractC5650LIL {
        public final /* synthetic */ C6263iiiL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ char[] f23232OooO00o;

        public OooO00o(C6263iiiL iiil, char[] cArr) {
            this.OooO00o = iiil;
            this.f23232OooO00o = cArr;
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        public LIiI11 OooO00o() {
            return new LIiI11(new C6456l1ilL(C9642i1lLI.this.f23227OooO00o, this.OooO00o), lLLL1iL.OooO00o(this.f23232OooO00o));
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m21700OooO00o() {
            return new C6456l1ilL(C9642i1lLI.this.f23227OooO00o, this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL
        public OutputStream OooO00o(OutputStream outputStream) {
            return new li1LI1l(outputStream, C9642i1lLI.this.f23229OooO00o);
        }
    }

    public C9642i1lLI(LlLI1 llLI1, li1l11I1 li1l11i1) {
        this(llLI1, li1l11i1, new C6461l1liI());
    }

    public C9642i1lLI(LlLI1 llLI1, li1l11I1 li1l11i1, lIL1i11 r4) {
        this.OooO00o = 1024;
        this.f23227OooO00o = llLI1;
        this.f23229OooO00o = new C6600lLi(li1l11i1, new C5346IiIIL());
        this.f23228OooO00o = r4;
    }

    public AbstractC5650LIL OooO00o(char[] cArr) {
        if (this.f23230OooO00o == null) {
            this.f23230OooO00o = new SecureRandom();
        }
        byte[] bArr = new byte[20];
        this.f23230OooO00o.nextBytes(bArr);
        C6263iiiL iiil = new C6263iiiL(bArr, this.OooO00o);
        this.f23229OooO00o.OooO00o(true, C6800ll1lLi.OooO00o(this.f23227OooO00o, this.f23228OooO00o, this.f23229OooO00o.OooO00o(), iiil, cArr));
        return new OooO00o(iiil, cArr);
    }

    public C9642i1lLI OooO00o(int i) {
        this.OooO00o = i;
        return this;
    }
}
