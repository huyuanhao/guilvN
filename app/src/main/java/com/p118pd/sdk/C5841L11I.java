package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.L丨1丨1丨I  reason: invalid class name and case insensitive filesystem */
public class C5841L11I extends AbstractC6122iIlLiL {
    public static C5841L11I[] OooO00o = new C5841L11I[12];

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f16808OooO00o;

    public C5841L11I(int i) {
        this.f16808OooO00o = BigInteger.valueOf((long) i).toByteArray();
    }

    public C5841L11I(BigInteger bigInteger) {
        this.f16808OooO00o = bigInteger.toByteArray();
    }

    public C5841L11I(byte[] bArr) {
        if (C9358II1.m21422OooO00o("org.bouncycastle.asn1.allow_unsafe_integer") || !C6513lIiI.OooO00o(bArr)) {
            this.f16808OooO00o = C9586iIILl.m21630OooO00o(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed enumerated");
    }

    public static C5841L11I OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof C5841L11I)) ? OooO00o((Object) OooO0o) : OooO00o(((AbstractC6804llL1ii) OooO0o).m17938OooO00o());
    }

    public static C5841L11I OooO00o(Object obj) {
        if (obj == null || (obj instanceof C5841L11I)) {
            return (C5841L11I) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C5841L11I) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    public static C5841L11I OooO00o(byte[] bArr) {
        if (bArr.length > 1) {
            return new C5841L11I(bArr);
        }
        if (bArr.length != 0) {
            int i = bArr[0] & 255;
            C5841L11I[] r1 = OooO00o;
            if (i >= r1.length) {
                return new C5841L11I(C9586iIILl.m21630OooO00o(bArr));
            }
            C5841L11I r2 = r1[i];
            if (r2 != null) {
                return r2;
            }
            C5841L11I r22 = new C5841L11I(C9586iIILl.m21630OooO00o(bArr));
            r1[i] = r22;
            return r22;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public BigInteger OooO00o() {
        return new BigInteger(this.f16808OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(10, this.f16808OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16426OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof C5841L11I)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.f16808OooO00o, ((C5841L11I) iillil).f16808OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return L1li1.OooO00o(this.f16808OooO00o.length) + 1 + this.f16808OooO00o.length;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        return C9586iIILl.OooO00o(this.f16808OooO00o);
    }
}
