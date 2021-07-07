package com.p118pd.sdk;

import java.io.InputStream;

/* renamed from: com.pd.sdk.Il11 */
public class Il11 {
    public lIL1i11 OooO00o;

    /* renamed from: com.pd.sdk.Il11$OooO00o */
    public class OooO00o implements AbstractC6429iliL {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ char[] f15778OooO00o;

        /* renamed from: com.pd.sdk.Il11$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4915OooO00o implements AbstractC5475Illli {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C6456l1ilL f15779OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C6600lLi f15780OooO00o;

            public C4915OooO00o(C6456l1ilL r2, C6600lLi r3) {
                this.f15779OooO00o = r2;
                this.f15780OooO00o = r3;
            }

            @Override // com.p118pd.sdk.AbstractC5475Illli
            public LIiI11 OooO00o() {
                return new LIiI11(lLLL1iL.OooO00o(OooO00o.this.f15778OooO00o));
            }

            @Override // com.p118pd.sdk.AbstractC5475Illli
            /* renamed from: OooO00o  reason: collision with other method in class */
            public C6456l1ilL m15641OooO00o() {
                return this.f15779OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC5475Illli
            public InputStream OooO00o(InputStream inputStream) {
                return new C9846l(inputStream, this.f15780OooO00o);
            }
        }

        public OooO00o(char[] cArr) {
            this.f15778OooO00o = cArr;
        }

        @Override // com.p118pd.sdk.AbstractC6429iliL
        public AbstractC5475Illli OooO00o(C6456l1ilL r7) {
            C6600lLi OooO00o2 = C6800ll1lLi.m17931OooO00o(r7.OooO00o());
            OooO00o2.OooO00o(false, C6800ll1lLi.OooO00o(r7.OooO00o(), Il11.this.OooO00o, OooO00o2.OooO00o(), C6263iiiL.OooO00o(r7.m17587OooO0O0()), this.f15778OooO00o));
            return new C4915OooO00o(r7, OooO00o2);
        }
    }

    public Il11() {
        this(new C6461l1liI());
    }

    public Il11(lIL1i11 r1) {
        this.OooO00o = r1;
    }

    public AbstractC6429iliL OooO00o(char[] cArr) {
        return new OooO00o(cArr);
    }
}
