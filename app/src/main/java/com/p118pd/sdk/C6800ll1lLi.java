package com.p118pd.sdk;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.ll丨1lLi  reason: invalid class name and case insensitive filesystem */
public class C6800ll1lLi {
    public static Map OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Set f18849OooO00o = new HashSet();
    public static Set OooO0O0 = new HashSet();

    /* renamed from: com.pd.sdk.ll丨1lLi$OooO00o */
    public static class OooO00o implements AbstractC6296il1il1 {
        public final /* synthetic */ LlLI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6263iiiL f18850OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6383iLl1 f18851OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ char[] f18852OooO00o;

        public OooO00o(LlLI1 llLI1, C6263iiiL iiil, C6383iLl1 r3, char[] cArr) {
            this.OooO00o = llLI1;
            this.f18850OooO00o = iiil;
            this.f18851OooO00o = r3;
            this.f18852OooO00o = cArr;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        public LIiI11 OooO00o() {
            return new LIiI11(m17933OooO00o(), lLLL1iL.OooO00o(this.f18852OooO00o));
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m17933OooO00o() {
            return new C6456l1ilL(this.OooO00o, this.f18850OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m17934OooO00o() {
            return new LIL1(this.f18851OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m17935OooO00o() {
            byte[] bArr = new byte[this.f18851OooO00o.OooO00o()];
            this.f18851OooO00o.OooO00o(bArr, 0);
            return bArr;
        }
    }

    static {
        OooO00o.put(AbstractC5711LiLli.o000o0OO, I11I.OooO00o(128));
        OooO00o.put(AbstractC5711LiLli.o000o0Oo, I11I.OooO00o(40));
        OooO00o.put(AbstractC5711LiLli.o000o0o0, I11I.OooO00o(192));
        OooO00o.put(AbstractC5711LiLli.o000o0o, I11I.OooO00o(128));
        OooO00o.put(AbstractC5711LiLli.o000o0oO, I11I.OooO00o(128));
        OooO00o.put(AbstractC5711LiLli.o000o0oo, I11I.OooO00o(40));
        f18849OooO00o.add(AbstractC5711LiLli.o000o0OO);
        f18849OooO00o.add(AbstractC5711LiLli.o000o0Oo);
        OooO0O0.add(AbstractC5711LiLli.o000o0o0);
        OooO0O0.add(AbstractC5711LiLli.o000o0o0);
    }

    public static int OooO00o(LlLI1 llLI1) {
        return ((Integer) OooO00o.get(llLI1)).intValue();
    }

    public static AbstractC6296il1il1 OooO00o(LlLI1 llLI1, lIL1i11 r5, C6263iiiL iiil, char[] cArr) {
        Ii1LiIL ii1LiIL = new Ii1LiIL(r5);
        ii1LiIL.OooO00o(lLLL1iL.OooO00o(cArr), iiil.m17277OooO00o(), iiil.OooO00o().intValue());
        C6383iLl1 r1 = new C6383iLl1(r5);
        r1.OooO00o((C6642li1LI) ii1LiIL.OooO00o(r5.OooO0O0() * 8));
        return new OooO00o(llLI1, iiil, r1, cArr);
    }

    public static AbstractC6370iIIIl OooO00o(LlLI1 llLI1, lIL1i11 r2, int i, C6263iiiL iiil, char[] cArr) {
        Ii1LiIL ii1LiIL = new Ii1LiIL(r2);
        ii1LiIL.OooO00o(lLLL1iL.OooO00o(cArr), iiil.m17277OooO00o(), iiil.OooO00o().intValue());
        if (m17932OooO00o(llLI1)) {
            return ii1LiIL.OooO0O0(OooO00o(llLI1));
        }
        AbstractC6370iIIIl OooO00o2 = ii1LiIL.m15555OooO00o(OooO00o(llLI1), i * 8);
        if (OooO0O0(llLI1)) {
            C9841ill1Ii.OooO00o(((C6642li1LI) ((C6274iilL1L) OooO00o2).OooO00o()).OooO00o());
        }
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C6600lLi m17931OooO00o(LlLI1 llLI1) {
        li1l11I1 li1l11i1;
        if (llLI1.equals(AbstractC5711LiLli.o000o0o0) || llLI1.equals(AbstractC5711LiLli.o000o0o)) {
            li1l11i1 = new C1LliI();
        } else if (llLI1.equals(AbstractC5711LiLli.o000o0oO) || llLI1.equals(AbstractC5711LiLli.o000o0oo)) {
            li1l11i1 = new C5591L1l();
        } else {
            throw new IllegalStateException("unknown algorithm");
        }
        return new C6600lLi(new C6927lll1(li1l11i1), new C5346IiIIL());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17932OooO00o(LlLI1 llLI1) {
        return f18849OooO00o.contains(llLI1);
    }

    public static boolean OooO0O0(LlLI1 llLI1) {
        return OooO0O0.contains(llLI1);
    }
}
