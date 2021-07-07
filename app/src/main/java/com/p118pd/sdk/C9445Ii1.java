package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.丨I丨i1丨  reason: invalid class name and case insensitive filesystem */
public class C9445Ii1 extends AbstractC5738Lil {
    public static final LlLI1 o00OoOo = new LlLI1("1.3.6.1.5.5.7.48.1");
    public static final LlLI1 o00OoOo0 = new LlLI1("1.3.6.1.5.5.7.48.2");
    public ILI OooO00o = null;
    public LlLI1 o00OoOOo = null;

    public C9445Ii1(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = ILI.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("wrong number of elements in sequence");
    }

    public C9445Ii1(LlLI1 llLI1, ILI ili) {
        this.o00OoOOo = llLI1;
        this.OooO00o = ili;
    }

    public static C9445Ii1 OooO00o(Object obj) {
        if (obj instanceof C9445Ii1) {
            return (C9445Ii1) obj;
        }
        if (obj != null) {
            return new C9445Ii1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public ILI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m21484OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    public String toString() {
        return "AccessDescription: Oid(" + this.o00OoOOo.m16387OooO0O0() + C3848l.f10402t;
    }
}
