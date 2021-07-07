package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.LII */
public class LII extends AbstractC6122iIlLiL implements AbstractC98681 {
    public final byte[] OooO00o;

    public LII(String str) {
        this.OooO00o = Strings.m22987OooO0O0(str);
    }

    public LII(byte[] bArr) {
        this.OooO00o = bArr;
    }

    public static LII OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof LII)) ? OooO00o((Object) OooO0o) : new LII(AbstractC6804llL1ii.OooO00o((Object) OooO0o).m17938OooO00o());
    }

    public static LII OooO00o(Object obj) {
        if (obj == null || (obj instanceof LII)) {
            return (LII) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (LII) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    public String OooO00o() {
        return Strings.OooO0O0(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(12, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16024OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof LII)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.OooO00o, ((LII) iillil).OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() throws IOException {
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
