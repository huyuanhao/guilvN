package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IlIL丨il  reason: invalid class name */
public class IlILil extends AbstractC5738Lil {
    public final I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6518lIlIl f15814OooO00o;
    public final LlLI1 o00OoOOo;

    public IlILil(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            this.f15814OooO00o = C6518lIlIl.OooO00o(i11li1.OooO00o(0));
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(1));
            this.OooO00o = I11L.OooO00o((Object) i11li1.OooO00o(2));
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public IlILil(C6518lIlIl lilil, LlLI1 llLI1, I11L i11l) {
        this.f15814OooO00o = lilil;
        this.o00OoOOo = llLI1;
        this.OooO00o = i11l;
    }

    public static IlILil OooO00o(Object obj) {
        if (obj instanceof IlILil) {
            return (IlILil) obj;
        }
        if (obj != null) {
            return new IlILil(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11L OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m15662OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6518lIlIl m15663OooO00o() {
        return this.f15814OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(new AbstractC6854lLi1LL[]{this.f15814OooO00o, this.o00OoOOo, this.OooO00o});
    }
}
