package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.I丨L  reason: invalid class name and case insensitive filesystem */
public class C5514IL extends AbstractC6122iIlLiL {
    public static final C5514IL OooO00o = new C5514IL(false);
    public static final C5514IL OooO0O0 = new C5514IL(true);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final byte[] f16016OooO0O0 = {-1};
    public static final byte[] OooO0OO = {0};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f16017OooO00o;

    public C5514IL(boolean z) {
        this.f16017OooO00o = z ? f16016OooO0O0 : OooO0OO;
    }

    public C5514IL(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        } else if (bArr[0] == 0) {
            this.f16017OooO00o = OooO0OO;
        } else if ((bArr[0] & 255) == 255) {
            this.f16017OooO00o = f16016OooO0O0;
        } else {
            this.f16017OooO00o = C9586iIILl.m21630OooO00o(bArr);
        }
    }

    public static C5514IL OooO00o(int i) {
        return i != 0 ? OooO0O0 : OooO00o;
    }

    public static C5514IL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof C5514IL)) ? OooO00o((Object) OooO0o) : OooO00o(((AbstractC6804llL1ii) OooO0o).m17938OooO00o());
    }

    public static C5514IL OooO00o(Object obj) {
        if (obj == null || (obj instanceof C5514IL)) {
            return (C5514IL) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C5514IL) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    public static C5514IL OooO00o(boolean z) {
        return z ? OooO0O0 : OooO00o;
    }

    public static C5514IL OooO00o(byte[] bArr) {
        if (bArr.length == 1) {
            return bArr[0] == 0 ? OooO00o : (bArr[0] & 255) == 255 ? OooO0O0 : new C5514IL(bArr);
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(1, this.f16017OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        return (iillil instanceof C5514IL) && this.f16017OooO00o[0] == ((C5514IL) iillil).f16017OooO00o[0];
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return 3;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15792OooO0O0() {
        return this.f16017OooO00o[0] != 0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        return this.f16017OooO00o[0];
    }

    public String toString() {
        return this.f16017OooO00o[0] != 0 ? "TRUE" : "FALSE";
    }
}
