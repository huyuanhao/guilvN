package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IL1 */
public class IL1 extends AbstractC5738Lil {
    public final Il1iLLi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6456l1ilL f15526OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6804llL1ii f15527OooO00o;

    public IL1(I11li1 i11li1) {
        this.f15526OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = Il1iLLi.OooO00o(i11li1.OooO00o(1));
        this.f15527OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(2));
    }

    public IL1(C6456l1ilL r1, Il1iLLi il1iLLi, byte[] bArr) {
        this.f15526OooO00o = r1;
        this.OooO00o = il1iLLi;
        this.f15527OooO00o = new C6487lIIiIlL(C9586iIILl.m21630OooO00o(bArr));
    }

    public static IL1 OooO00o(Object obj) {
        if (obj instanceof IL1) {
            return (IL1) obj;
        }
        if (obj != null) {
            return new IL1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public Il1iLLi OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m15465OooO00o() {
        return this.f15526OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15466OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f15527OooO00o.m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15526OooO00o);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f15527OooO00o);
        return new C5707LiL1(r0);
    }
}
