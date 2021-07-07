package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨lL  reason: invalid class name and case insensitive filesystem */
public class C5559IlL extends AbstractC5738Lil {
    public static final int o0OOO0o = 2;
    public static final int o0Oo0oo = 3;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 0;
    public static final int o0ooOoO = 1;
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I11li1 f16078OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public II1LL f16079OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5509IIiI f16080OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6052i1l f16081OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6207iLLILi f16082OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f16083OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16084OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9879iI f16085OooO00o;
    public int o00oO0O = 1;

    public C5559IlL(I11li1 i11li1) {
        int i;
        AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(0);
        try {
            this.o00oO0O = C6513lIiI.OooO00o(OooO00o2).m17647OooO0O0().intValue();
            try {
                OooO00o2 = i11li1.OooO00o(1);
            } catch (IllegalArgumentException unused) {
            }
            i = 2;
        } catch (IllegalArgumentException unused2) {
            i = 1;
        }
        this.f16082OooO00o = C6207iLLILi.OooO00o(OooO00o2);
        int i2 = i + 1;
        this.f16081OooO00o = C6052i1l.OooO00o(i11li1.OooO00o(i));
        int i3 = i2 + 1;
        this.f16084OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(i2));
        int i4 = i3 + 1;
        this.f16080OooO00o = C5509IIiI.OooO00o(i11li1.OooO00o(i3));
        while (i4 < i11li1.size()) {
            int i5 = i4 + 1;
            AbstractC6854lLi1LL OooO00o3 = i11li1.OooO00o(i4);
            if (OooO00o3 instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL OooO00o4 = AbstractC5903LlLLL.OooO00o(OooO00o3);
                int OooO00o5 = OooO00o4.OooO00o();
                if (OooO00o5 == 0) {
                    this.f16079OooO00o = II1LL.OooO00o(OooO00o4, false);
                } else if (OooO00o5 == 1) {
                    this.f16085OooO00o = C9879iI.OooO00o(I11li1.OooO00o(OooO00o4, false));
                } else if (OooO00o5 == 2) {
                    this.OooO00o = I11L.OooO00o(OooO00o4, false);
                } else if (OooO00o5 == 3) {
                    this.f16078OooO00o = I11li1.OooO00o(OooO00o4, false);
                } else {
                    throw new IllegalArgumentException("Unknown tag encountered: " + OooO00o5);
                }
            } else {
                try {
                    this.f16083OooO00o = iI11IL.OooO00o(OooO00o3);
                } catch (IllegalArgumentException unused3) {
                }
            }
            i4 = i5;
        }
    }

    public C5559IlL(C6207iLLILi r2, C6052i1l r3, C6513lIiI r4, C5509IIiI r5) {
        this.f16082OooO00o = r2;
        this.f16081OooO00o = r3;
        this.f16084OooO00o = r4;
        this.f16080OooO00o = r5;
    }

    public static C5559IlL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5559IlL OooO00o(Object obj) {
        if (obj instanceof C5559IlL) {
            return (C5559IlL) obj;
        }
        if (obj != null) {
            return new C5559IlL(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(int i) {
        this.o00oO0O = i;
    }

    private void OooO00o(C6052i1l r1) {
        this.f16081OooO00o = r1;
    }

    private void OooO00o(C6207iLLILi r1) {
        this.f16082OooO00o = r1;
    }

    public I11L OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public II1LL m15851OooO00o() {
        return this.f16079OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5509IIiI m15852OooO00o() {
        return this.f16080OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6052i1l m15853OooO00o() {
        return this.f16081OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6207iLLILi m15854OooO00o() {
        return this.f16082OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m15855OooO00o() {
        return this.f16083OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m15856OooO00o() {
        return this.f16084OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9879iI m15857OooO00o() {
        return this.f16085OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1706l[] m15858OooO00o() {
        I11li1 i11li1 = this.f16078OooO00o;
        if (i11li1 != null) {
            return C1706l.OooO00o(i11li1);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15859OooO0O0() {
        iILLL1 r0 = new iILLL1();
        int i = this.o00oO0O;
        if (i != 1) {
            r0.OooO00o(new C6513lIiI((long) i));
        }
        r0.OooO00o(this.f16082OooO00o);
        r0.OooO00o(this.f16081OooO00o);
        r0.OooO00o(this.f16084OooO00o);
        r0.OooO00o(this.f16080OooO00o);
        if (this.f16079OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f16079OooO00o));
        }
        if (this.f16085OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.f16085OooO00o));
        }
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 2, this.OooO00o));
        }
        if (this.f16078OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 3, this.f16078OooO00o));
        }
        iI11IL r1 = this.f16083OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DVCSCertInfo {\n");
        if (this.o00oO0O != 1) {
            stringBuffer.append("version: " + this.o00oO0O + "\n");
        }
        stringBuffer.append("dvReqInfo: " + this.f16082OooO00o + "\n");
        stringBuffer.append("messageImprint: " + this.f16081OooO00o + "\n");
        stringBuffer.append("serialNumber: " + this.f16084OooO00o + "\n");
        stringBuffer.append("responseTime: " + this.f16080OooO00o + "\n");
        if (this.f16079OooO00o != null) {
            stringBuffer.append("dvStatus: " + this.f16079OooO00o + "\n");
        }
        if (this.f16085OooO00o != null) {
            stringBuffer.append("policy: " + this.f16085OooO00o + "\n");
        }
        if (this.OooO00o != null) {
            stringBuffer.append("reqSignature: " + this.OooO00o + "\n");
        }
        if (this.f16078OooO00o != null) {
            stringBuffer.append("certs: " + this.f16078OooO00o + "\n");
        }
        if (this.f16083OooO00o != null) {
            stringBuffer.append("extensions: " + this.f16083OooO00o + "\n");
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }
}
