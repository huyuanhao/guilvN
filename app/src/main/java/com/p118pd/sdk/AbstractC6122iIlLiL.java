package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.iIlLiL  reason: case insensitive filesystem */
public abstract class AbstractC6122iIlLiL extends AbstractC5738Lil {
    public static AbstractC6122iIlLiL OooO00o(byte[] bArr) throws IOException {
        C5805Ll1 r0 = new C5805Ll1(bArr);
        try {
            AbstractC6122iIlLiL OooO00o = r0.OooO00o();
            if (r0.available() == 0) {
                return OooO00o;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract void OooO00o(C6103iIi1 iii1) throws IOException;

    public abstract boolean OooO00o();

    public abstract boolean OooO00o(AbstractC6122iIlLiL iillil);

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public abstract int OooO0O0() throws IOException;

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17017OooO0O0() {
        return this;
    }

    public AbstractC6122iIlLiL OooO0Oo() {
        return this;
    }

    public AbstractC6122iIlLiL OooO0o0() {
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC6854lLi1LL) && OooO00o(((AbstractC6854lLi1LL) obj).OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public abstract int hashCode();
}
