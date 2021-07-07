package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.pd.sdk.iI */
public class C1687iI extends AbstractC6122iIlLiL {
    public AbstractC6122iIlLiL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17470OooO00o;
    public AbstractC6122iIlLiL OooO0O0;
    public LlLI1 o00OoOOo;
    public int o00oO0O;

    public C1687iI(LlLI1 llLI1, C6513lIiI r2, AbstractC6122iIlLiL iillil, int i, AbstractC6122iIlLiL iillil2) {
        OooO00o(llLI1);
        OooO00o(r2);
        OooO00o(iillil);
        OooO00o(i);
        OooO0O0(iillil2.m17017OooO0O0());
    }

    public C1687iI(LlLI1 llLI1, C6513lIiI r8, AbstractC6122iIlLiL iillil, ILI1Ll iLI1Ll) {
        this(llLI1, r8, iillil, iLI1Ll.OooO00o(), iLI1Ll.m17017OooO0O0());
    }

    public C1687iI(iILLL1 r5) {
        int i = 0;
        AbstractC6122iIlLiL OooO00o2 = OooO00o(r5, 0);
        if (OooO00o2 instanceof LlLI1) {
            this.o00OoOOo = (LlLI1) OooO00o2;
            OooO00o2 = OooO00o(r5, 1);
            i = 1;
        }
        if (OooO00o2 instanceof C6513lIiI) {
            this.f17470OooO00o = (C6513lIiI) OooO00o2;
            i++;
            OooO00o2 = OooO00o(r5, i);
        }
        if (!(OooO00o2 instanceof AbstractC5903LlLLL)) {
            this.OooO00o = OooO00o2;
            i++;
            OooO00o2 = OooO00o(r5, i);
        }
        if (r5.OooO00o() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        } else if (OooO00o2 instanceof AbstractC5903LlLLL) {
            AbstractC5903LlLLL r1 = (AbstractC5903LlLLL) OooO00o2;
            OooO00o(r1.OooO00o());
            this.OooO0O0 = r1.OooO0o();
        } else {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    private AbstractC6122iIlLiL OooO00o(iILLL1 r2, int i) {
        if (r2.OooO00o() > i) {
            return r2.OooO00o(i).OooO0O0();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    private void OooO00o(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("invalid encoding value: " + i);
        }
        this.o00oO0O = i;
    }

    private void OooO00o(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    private void OooO00o(AbstractC6122iIlLiL iillil) {
        this.OooO00o = iillil;
    }

    private void OooO00o(C6513lIiI r1) {
        this.f17470OooO00o = r1;
    }

    private void OooO0O0(AbstractC6122iIlLiL iillil) {
        this.OooO0O0 = iillil;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16927OooO00o() {
        return this.f17470OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        LlLI1 llLI1 = this.o00OoOOo;
        if (llLI1 != null) {
            byteArrayOutputStream.write(llLI1.OooO00o(AbstractC5533IiL.OooO00o));
        }
        C6513lIiI r1 = this.f17470OooO00o;
        if (r1 != null) {
            byteArrayOutputStream.write(r1.OooO00o(AbstractC5533IiL.OooO00o));
        }
        AbstractC6122iIlLiL iillil = this.OooO00o;
        if (iillil != null) {
            byteArrayOutputStream.write(iillil.OooO00o(AbstractC5533IiL.OooO00o));
        }
        byteArrayOutputStream.write(new ILI1Ll(true, this.o00oO0O, this.OooO0O0).OooO00o(AbstractC5533IiL.OooO00o));
        iii1.OooO00o(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16928OooO00o() {
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16929OooO00o(AbstractC6122iIlLiL iillil) {
        AbstractC6122iIlLiL iillil2;
        C6513lIiI r2;
        LlLI1 llLI1;
        if (!(iillil instanceof C1687iI)) {
            return false;
        }
        if (this == iillil) {
            return true;
        }
        C1687iI iIVar = (C1687iI) iillil;
        LlLI1 llLI12 = this.o00OoOOo;
        if (llLI12 != null && ((llLI1 = iIVar.o00OoOOo) == null || !llLI1.equals(llLI12))) {
            return false;
        }
        C6513lIiI r0 = this.f17470OooO00o;
        if (r0 != null && ((r2 = iIVar.f17470OooO00o) == null || !r2.equals(r0))) {
            return false;
        }
        AbstractC6122iIlLiL iillil3 = this.OooO00o;
        if (iillil3 == null || ((iillil2 = iIVar.OooO00o) != null && iillil2.equals(iillil3))) {
            return this.OooO0O0.equals(iIVar.OooO0O0);
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() throws IOException {
        return getEncoded().length;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() {
        return this.o00oO0O;
    }

    public AbstractC6122iIlLiL OooO0o() {
        return this.OooO00o;
    }

    public AbstractC6122iIlLiL OooO0oO() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        LlLI1 llLI1 = this.o00OoOOo;
        int hashCode = llLI1 != null ? llLI1.hashCode() : 0;
        C6513lIiI r1 = this.f17470OooO00o;
        if (r1 != null) {
            hashCode ^= r1.hashCode();
        }
        AbstractC6122iIlLiL iillil = this.OooO00o;
        if (iillil != null) {
            hashCode ^= iillil.hashCode();
        }
        return hashCode ^ this.OooO0O0.hashCode();
    }
}
