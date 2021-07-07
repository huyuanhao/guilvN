package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.LI11 */
public class LI11 extends AbstractC6122iIlLiL implements AbstractC98681 {
    public final byte[] OooO00o;

    public LI11(String str) {
        this(str, false);
    }

    public LI11(String str, boolean z) {
        if (!z || OooO00o(str)) {
            this.OooO00o = Strings.m22985OooO00o(str);
            return;
        }
        throw new IllegalArgumentException("string contains illegal characters");
    }

    public LI11(byte[] bArr) {
        this.OooO00o = bArr;
    }

    public static LI11 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof LI11)) ? OooO00o((Object) OooO0o) : new LI11(AbstractC6804llL1ii.OooO00o((Object) OooO0o).m17938OooO00o());
    }

    public static LI11 OooO00o(Object obj) {
        if (obj == null || (obj instanceof LI11)) {
            return (LI11) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (LI11) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    public static boolean OooO00o(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (charAt > 127) {
                return false;
            }
            if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && !(('0' <= charAt && charAt <= '9') || charAt == ' ' || charAt == ':' || charAt == '=' || charAt == '?'))) {
                switch (charAt) {
                    case '\'':
                    case '(':
                    case ')':
                        continue;
                    default:
                        switch (charAt) {
                            default:
                                return false;
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                                continue;
                        }
                }
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
        iii1.OooO00o(19, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16010OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof LI11)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.OooO00o, ((LI11) iillil).OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16011OooO00o() {
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
