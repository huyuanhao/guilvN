package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.L1iI1 */
public class L1iI1 extends AbstractC6122iIlLiL implements AbstractC98681 {
    public final byte[] OooO00o;

    public L1iI1(String str) {
        this(str, false);
    }

    public L1iI1(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("string cannot be null");
        } else if (!z || OooO00o(str)) {
            this.OooO00o = Strings.m22985OooO00o(str);
        } else {
            throw new IllegalArgumentException("string contains illegal characters");
        }
    }

    public L1iI1(byte[] bArr) {
        this.OooO00o = bArr;
    }

    public static L1iI1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof L1iI1)) ? OooO00o((Object) OooO0o) : new L1iI1(((AbstractC6804llL1ii) OooO0o).m17938OooO00o());
    }

    public static L1iI1 OooO00o(Object obj) {
        if (obj == null || (obj instanceof L1iI1)) {
            return (L1iI1) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (L1iI1) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    public static boolean OooO00o(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    public String OooO00o() {
        return Strings.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(22, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15974OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof L1iI1)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.OooO00o, ((L1iI1) iillil).OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15975OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return L1li1.OooO00o(this.OooO00o.length) + 1 + this.OooO00o.length;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        return C9586iIILl.OooO00o(this.OooO00o);
    }

    public String toString() {
        return OooO00o();
    }
}
