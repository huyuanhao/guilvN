package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.iI丨il  reason: invalid class name and case insensitive filesystem */
public class C6140iIil extends AbstractC5873LiliL1 {
    public static final Map OooO00o;
    public static final C6456l1ilL OooO0O0 = new C6456l1ilL(AbstractC5711LiLli.Oooooo, C6452l1Lll.OooO00o);
    public static final C6456l1ilL OooO0OO = new C6456l1ilL(AbstractC5711LiLli.Ooooooo, C6452l1Lll.OooO00o);
    public static final C6456l1ilL OooO0Oo = new C6456l1ilL(AbstractC5711LiLli.ooOO, C6452l1Lll.OooO00o);
    public static final C6456l1ilL OooO0o = new C6456l1ilL(AbstractC5905LllI.OooOOo, C6452l1Lll.OooO00o);
    public static final C6456l1ilL OooO0o0 = new C6456l1ilL(AbstractC5905LllI.OooOOOo, C6452l1Lll.OooO00o);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f17644OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6456l1ilL f17645OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int f17646OooO0O0;

    /* renamed from: com.pd.sdk.iI丨il$OooO0O0 */
    public static class OooO0O0 {
        public int OooO00o = 1024;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6456l1ilL f17647OooO00o = C6140iIil.OooO0O0;
        public int OooO0O0 = -1;

        public OooO0O0 OooO00o(int i) {
            this.OooO00o = i;
            return this;
        }

        public OooO0O0 OooO00o(C6456l1ilL r1) {
            this.f17647OooO00o = r1;
            return this;
        }

        public C6140iIil OooO00o() {
            return new C6140iIil(this);
        }

        public OooO0O0 OooO0O0(int i) {
            this.OooO0O0 = i;
            return this;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        OooO00o = hashMap;
        hashMap.put(AbstractC5711LiLli.Oooooo, I11I.OooO00o(20));
        OooO00o.put(AbstractC5711LiLli.Ooooooo, I11I.OooO00o(32));
        OooO00o.put(AbstractC5711LiLli.ooOO, I11I.OooO00o(64));
        OooO00o.put(AbstractC5711LiLli.OoooooO, I11I.OooO00o(28));
        OooO00o.put(AbstractC5711LiLli.o0OoOo0, I11I.OooO00o(48));
        OooO00o.put(AbstractC5905LllI.OooOOOO, I11I.OooO00o(28));
        OooO00o.put(AbstractC5905LllI.OooOOOo, I11I.OooO00o(32));
        OooO00o.put(AbstractC5905LllI.OooOOo0, I11I.OooO00o(48));
        OooO00o.put(AbstractC5905LllI.OooOOo, I11I.OooO00o(64));
        OooO00o.put(AbstractC5331ILi.OooO0OO, I11I.OooO00o(32));
        OooO00o.put(LLiII.OooO0o0, I11I.OooO00o(32));
        OooO00o.put(LLiII.OooO0o, I11I.OooO00o(64));
        OooO00o.put(AbstractC6041i1l.Ooooo0o, I11I.OooO00o(32));
    }

    public C6140iIil(OooO0O0 oooO0O0) {
        super(AbstractC5711LiLli.OoooOo0);
        this.f17644OooO00o = oooO0O0.OooO00o;
        this.f17645OooO00o = oooO0O0.f17647OooO00o;
        this.f17646OooO0O0 = oooO0O0.OooO0O0 < 0 ? OooO00o(this.f17645OooO00o.OooO00o()) : oooO0O0.OooO0O0;
    }

    public static int OooO00o(LlLI1 llLI1) {
        if (OooO00o.containsKey(llLI1)) {
            return ((Integer) OooO00o.get(llLI1)).intValue();
        }
        throw new IllegalStateException("no salt size for algorithm: " + llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC5873LiliL1
    public int OooO00o() {
        return this.f17644OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5873LiliL1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17042OooO00o() {
        return this.f17645OooO00o;
    }

    public int OooO0O0() {
        return this.f17646OooO0O0;
    }
}
