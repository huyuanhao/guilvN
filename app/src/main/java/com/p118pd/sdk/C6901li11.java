package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.l丨丨i11  reason: invalid class name and case insensitive filesystem */
public class C6901li11 extends AbstractC6122iIlLiL implements AbstractC98681 {
    public final char[] OooO00o;

    public C6901li11(String str) {
        this.OooO00o = str.toCharArray();
    }

    public C6901li11(byte[] bArr) {
        int length = bArr.length / 2;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            int i2 = i * 2;
            cArr[i] = (char) ((bArr[i2 + 1] & 255) | (bArr[i2] << 8));
        }
        this.OooO00o = cArr;
    }

    public C6901li11(char[] cArr) {
        this.OooO00o = cArr;
    }

    public static C6901li11 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof C6901li11)) ? OooO00o((Object) OooO0o) : new C6901li11(AbstractC6804llL1ii.OooO00o((Object) OooO0o).m17938OooO00o());
    }

    public static C6901li11 OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6901li11)) {
            return (C6901li11) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C6901li11) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    public String OooO00o() {
        return new String(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(30);
        iii1.OooO0O0(this.OooO00o.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.OooO00o;
            if (i != cArr.length) {
                char c = cArr[i];
                iii1.OooO00o((byte) (c >> '\b'));
                iii1.OooO00o((byte) c);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18068OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof C6901li11)) {
            return false;
        }
        return C9586iIILl.OooO00o(this.OooO00o, ((C6901li11) iillil).OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return L1li1.OooO00o(this.OooO00o.length * 2) + 1 + (this.OooO00o.length * 2);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        return C9586iIILl.OooO00o(this.OooO00o);
    }

    public String toString() {
        return OooO00o();
    }
}
