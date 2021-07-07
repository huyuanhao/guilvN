package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Vector;

/* renamed from: com.pd.sdk.lll  reason: case insensitive filesystem */
public class C6789lll extends AbstractC5738Lil {
    public static final LlLI1 o00OoOOo = AbstractC5711LiLli.o0000O00;
    public static final LlLI1 o00OoOo = AbstractC5711LiLli.o0000oO;
    public static final LlLI1 o00OoOo0 = AbstractC5711LiLli.o0000oo;
    public static final LlLI1 o00OoOoo = AbstractC5905LllI.Oooo0OO;
    public static final LlLI1 o00Ooo0 = AbstractC5905LllI.OooOo0;
    public static final LlLI1 o00Ooo00 = AbstractC5905LllI.OooOoo;
    public static final LlLI1 o00Ooo0O = new LlLI1(C1L1l.OooO0OO);
    public static final LlLI1 o00Ooo0o = new LlLI1(C1L1l.OooO0Oo);
    public static final LlLI1 o00OooO = AbstractC5711LiLli.OoooOoo;
    public static final LlLI1 o00OooO0 = new LlLI1("1.3.14.3.2.7");
    public static final LlLI1 o00OooOO = AbstractC5711LiLli.Ooooo00;
    public I11li1 OooO00o;

    public C6789lll(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public static C6789lll OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6789lll)) {
            return (C6789lll) obj;
        }
        if (obj instanceof I11li1) {
            return new C6789lll((I11li1) obj);
        }
        if (obj instanceof C9476LIL1li) {
            return new C6789lll((I11li1) ((C9476LIL1li) obj).OooO00o().OooO00o(0));
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public Vector OooO00o(LlLI1 llLI1) {
        Enumeration OooO00o2 = this.OooO00o.m15236OooO00o();
        Vector vector = new Vector();
        if (llLI1 == null) {
            while (OooO00o2.hasMoreElements()) {
                vector.addElement(I1lLLl1l.OooO00o(OooO00o2.nextElement()));
            }
        } else {
            while (OooO00o2.hasMoreElements()) {
                I1lLLl1l OooO00o3 = I1lLLl1l.OooO00o(OooO00o2.nextElement());
                if (llLI1.equals(OooO00o3.OooO00o())) {
                    vector.addElement(OooO00o3);
                }
            }
        }
        return vector;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
