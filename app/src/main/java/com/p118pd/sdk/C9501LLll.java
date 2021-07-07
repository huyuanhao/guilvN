package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.丨LLll  reason: invalid class name and case insensitive filesystem */
public class C9501LLll implements i11ILLIi {
    public static final int o00oO0O = 0;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 3;
    public final C5309ILiL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final liliiL1 f23068OooO00o;

    public C9501LLll(C5309ILiL iLiL) {
        this.OooO00o = iLiL;
        this.f23068OooO00o = iLiL.m15506OooO00o().m21783OooO00o();
    }

    public C9501LLll(byte[] bArr) throws IOException {
        this(OooO00o(bArr));
    }

    public static C5309ILiL OooO00o(byte[] bArr) throws IOException {
        try {
            return C5309ILiL.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
        } catch (ClassCastException e) {
            throw new CertIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new CertIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    private C6424iL OooO00o(LlLI1 llLI1) {
        liliiL1 liliil1 = this.f23068OooO00o;
        if (liliil1 == null) {
            return null;
        }
        C6424iL[] OooO00o2 = liliil1.OooO00o();
        for (int i = 0; i != OooO00o2.length; i++) {
            if (OooO00o2[i].OooO00o().equals(llLI1)) {
                return OooO00o2[i];
            }
        }
        return null;
    }

    private boolean OooO00o(AbstractC9449II r3, C6435l11IL l11il) throws CRMFException {
        try {
            lliLLL OooO00o2 = r3.OooO00o(l11il.m17548OooO00o());
            C5353IiIl1i.OooO00o(l11il.m17549OooO00o() != null ? l11il.m17549OooO00o() : this.OooO00o.m15506OooO00o(), OooO00o2.m17912OooO00o());
            return OooO00o2.verify(l11il.OooO00o().OooO0O0());
        } catch (OperatorCreationException e) {
            throw new CRMFException("unable to create verifier: " + e.getMessage(), e);
        }
    }

    public int OooO00o() {
        return this.OooO00o.OooO0O0().OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5309ILiL m21554OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5503II11L m21555OooO00o(LlLI1 llLI1) {
        C6424iL OooO00o2 = OooO00o(llLI1);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.OooO00o().equals(LLIl11l.OooO0oO)) {
            return new C6829lILiLl(LIL.OooO00o(OooO00o2.m17537OooO0O0()));
        }
        if (OooO00o2.OooO00o().equals(LLIl11l.OooO0Oo)) {
            return new il1i1Li(LII.OooO00o(OooO00o2.m17537OooO0O0()));
        }
        if (OooO00o2.OooO00o().equals(LLIl11l.OooO0o0)) {
            return new ilI1IIii(LII.OooO00o(OooO00o2.m17537OooO0O0()));
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9502Li m21556OooO00o() {
        return this.OooO00o.m15506OooO00o().m21784OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21557OooO00o() {
        return this.f23068OooO00o != null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21558OooO00o(LlLI1 llLI1) {
        return OooO00o(llLI1) != null;
    }

    public boolean OooO00o(AbstractC9449II r4) throws CRMFException, IllegalStateException {
        Ll11LL11 OooO0O0 = this.OooO00o.OooO0O0();
        if (OooO0O0.OooO0O0() == 1) {
            C6435l11IL OooO00o2 = C6435l11IL.OooO00o(OooO0O0.m16361OooO0O0());
            if (OooO00o2.m17549OooO00o() == null || OooO00o2.m17549OooO00o().m21572OooO00o() == null) {
                return OooO00o(r4, OooO00o2);
            }
            throw new IllegalStateException("verification requires password check");
        }
        throw new IllegalStateException("not Signing Key type of proof of possession");
    }

    public boolean OooO00o(AbstractC9449II r4, C9539LliII r5, char[] cArr) throws CRMFException, IllegalStateException {
        Ll11LL11 OooO0O0 = this.OooO00o.OooO0O0();
        if (OooO0O0.OooO0O0() == 1) {
            C6435l11IL OooO00o2 = C6435l11IL.OooO00o(OooO0O0.m16361OooO0O0());
            if (OooO00o2.m17549OooO00o() == null || OooO00o2.m17549OooO00o().OooO00o() != null) {
                throw new IllegalStateException("no PKMAC present in proof of possession");
            }
            if (new lI1liL1(r5).OooO00o(OooO00o2.m17549OooO00o().m21572OooO00o(), cArr, m21556OooO00o().m21564OooO00o())) {
                return OooO00o(r4, OooO00o2);
            }
            return false;
        }
        throw new IllegalStateException("not Signing Key type of proof of possession");
    }

    public boolean OooO0O0() {
        return this.OooO00o.OooO0O0() != null;
    }

    public boolean OooO0OO() {
        Ll11LL11 OooO0O0 = this.OooO00o.OooO0O0();
        return OooO0O0.OooO0O0() == 1 && C6435l11IL.OooO00o(OooO0O0.m16361OooO0O0()).m17549OooO00o().m21572OooO00o() != null;
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.OooO00o.getEncoded();
    }
}
