package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIi1L丨丨1  reason: invalid class name */
public class LIi1L1 extends C5240IIiI {
    public C5585L1L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ll111 f16311OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6051i1lli f16312OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public llILLI1 f16313OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5585L1L[] f16314OooO00o;
    public C6051i1lli OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public llILLI1 f16315OooO0O0;
    public int o00oO0O;
    public int o0ooOO0;
    public String o0ooOOo;

    public LIi1L1(int i, int i2, Ll111 ll111, C5585L1L r6, C6051i1lli i1lli, C6051i1lli i1lli2, llILLI1 r9) {
        super(true, null);
        this.o0ooOO0 = i2;
        this.o00oO0O = i;
        this.f16311OooO00o = ll111;
        this.OooO00o = r6;
        this.f16313OooO00o = r9;
        this.f16312OooO00o = i1lli;
        this.OooO0O0 = i1lli2;
        this.f16315OooO0O0 = C5786LlL.OooO00o(ll111, r6);
        this.f16314OooO00o = new ILI1i(ll111, r6).m15484OooO00o();
    }

    public LIi1L1(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[][] bArr7) {
        super(true, null);
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        Ll111 ll111 = new Ll111(bArr);
        this.f16311OooO00o = ll111;
        this.OooO00o = new C5585L1L(ll111, bArr2);
        this.f16313OooO00o = new llILLI1(bArr3);
        this.f16312OooO00o = new C6051i1lli(bArr4);
        this.OooO0O0 = new C6051i1lli(bArr5);
        this.f16315OooO0O0 = new llILLI1(bArr6);
        this.f16314OooO00o = new C5585L1L[bArr7.length];
        for (int i3 = 0; i3 < bArr7.length; i3++) {
            this.f16314OooO00o[i3] = new C5585L1L(this.f16311OooO00o, bArr7[i3]);
        }
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.C5240IIiI
    public int OooO00o() {
        return this.o0ooOO0;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.C5240IIiI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5585L1L m16069OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.C5240IIiI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Ll111 m16070OooO00o() {
        return this.f16311OooO00o;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.C5240IIiI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6051i1lli m16071OooO00o() {
        return this.f16312OooO00o;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.C5240IIiI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public llILLI1 m16072OooO00o() {
        return this.f16315OooO0O0;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.C5240IIiI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5585L1L[] m16073OooO00o() {
        return this.f16314OooO00o;
    }

    public int OooO0O0() {
        return this.o00oO0O;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6051i1lli m16074OooO0O0() {
        return this.OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public llILLI1 m16075OooO0O0() {
        return this.f16313OooO00o;
    }
}
