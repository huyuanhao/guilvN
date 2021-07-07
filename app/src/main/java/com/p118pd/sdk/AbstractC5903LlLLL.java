package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Exception;

/* renamed from: com.pd.sdk.L丨lLLL  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5903LlLLL extends AbstractC6122iIlLiL implements AbstractC6532lIII {
    public AbstractC6854lLi1LL OooO00o = null;
    public boolean OooO0O0 = false;
    public boolean OooO0OO = true;
    public int o00oO0O;

    public AbstractC5903LlLLL(boolean z, int i, AbstractC6854lLi1LL r5) {
        if (r5 instanceof AbstractC5462Ilil) {
            this.OooO0OO = true;
        } else {
            this.OooO0OO = z;
        }
        this.o00oO0O = i;
        if (!this.OooO0OO) {
            boolean z2 = r5.OooO0O0() instanceof I11L;
        }
        this.OooO00o = r5;
    }

    public static AbstractC5903LlLLL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        if (z) {
            return (AbstractC5903LlLLL) r0.OooO0o();
        }
        throw new IllegalArgumentException("implicitly tagged tagged object");
    }

    public static AbstractC5903LlLLL OooO00o(Object obj) {
        if (obj == null || (obj instanceof AbstractC5903LlLLL)) {
            return (AbstractC5903LlLLL) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return OooO00o((Object) AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
    }

    @Override // com.p118pd.sdk.AbstractC6532lIII, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    public int OooO00o() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC6532lIII, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16487OooO00o() {
        return m17017OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC6532lIII
    public AbstractC6854lLi1LL OooO00o(int i, boolean z) throws IOException {
        if (i == 4) {
            return AbstractC6804llL1ii.OooO00o(this, z).m17936OooO00o();
        }
        if (i == 16) {
            return I11li1.OooO00o(this, z).OooO00o();
        }
        if (i == 17) {
            return I11L.OooO00o(this, z).OooO00o();
        }
        if (z) {
            return OooO0o();
        }
        throw new ASN1Exception("implicit tagging not implemented for tag: " + i);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public abstract void OooO00o(C6103iIi1 iii1) throws IOException;

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof AbstractC5903LlLLL)) {
            return false;
        }
        AbstractC5903LlLLL r4 = (AbstractC5903LlLLL) iillil;
        if (this.o00oO0O != r4.o00oO0O || this.OooO0O0 != r4.OooO0O0 || this.OooO0OO != r4.OooO0OO) {
            return false;
        }
        AbstractC6854lLi1LL r0 = this.OooO00o;
        return r0 == null ? r4.OooO00o == null : r0.OooO0O0().equals(r4.OooO00o.OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public boolean OooO0O0() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO0Oo() {
        return new ILI1Ll(this.OooO0OO, this.o00oO0O, this.OooO00o);
    }

    public AbstractC6122iIlLiL OooO0o() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        if (r0 != null) {
            return r0.OooO0O0();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO0o0() {
        return new lLIL1(this.OooO0OO, this.o00oO0O, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        int i = this.o00oO0O;
        AbstractC6854lLi1LL r1 = this.OooO00o;
        return r1 != null ? i ^ r1.hashCode() : i;
    }

    public boolean isEmpty() {
        return this.OooO0O0;
    }

    public String toString() {
        return "[" + this.o00oO0O + "]" + this.OooO00o;
    }
}
