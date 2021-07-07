package com.p118pd.sdk;

import com.p118pd.sdk.C5844LI1L;
import com.p118pd.sdk.C6394iiIlI;
import java.security.SecureRandom;
import java.text.ParseException;

/* renamed from: com.pd.sdk.丨l1丨l1L  reason: invalid class name and case insensitive filesystem */
public class C9673l1l1L {
    public C5558Il1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5844LI1L f23275OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6394iiIlI f23276OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9341I1iilI1 f23277OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23278OooO00o;

    public C9673l1l1L(C9341I1iilI1 r1, SecureRandom secureRandom) {
        if (r1 != null) {
            this.f23277OooO00o = r1;
            this.OooO00o = r1.m21385OooO00o();
            this.f23278OooO00o = secureRandom;
            return;
        }
        throw new NullPointerException("params == null");
    }

    public int OooO00o() {
        return this.f23275OooO00o.OooO00o();
    }

    public I1LLIII OooO00o(byte[] bArr, iL1iI1L il1ii1l) {
        if (bArr.length != this.f23277OooO00o.OooO00o()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        } else if (il1ii1l != null) {
            C5558Il1l r0 = this.OooO00o;
            r0.OooO00o(r0.m15841OooO00o(this.f23275OooO00o.OooO0o0(), il1ii1l), OooO0OO());
            return this.OooO00o.OooO00o(bArr, il1ii1l);
        } else {
            throw new NullPointerException("otsHashAddress == null");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5558Il1l m21718OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5844LI1L m21719OooO00o() {
        return this.f23275OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9341I1iilI1 m21720OooO00o() {
        return this.f23277OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21721OooO00o() {
        C9699li1LL r0 = new C9699li1LL();
        r0.OooO00o(new C9589iIi(m21720OooO00o(), this.f23278OooO00o));
        i1LLl1L OooO00o2 = r0.OooO00o();
        this.f23275OooO00o = (C5844LI1L) OooO00o2.OooO00o();
        this.f23276OooO00o = (C6394iiIlI) OooO00o2.OooO0O0();
        this.OooO00o.OooO00o(new byte[this.f23277OooO00o.OooO00o()], this.f23275OooO00o.OooO0O0());
    }

    public void OooO00o(int i) {
        this.f23275OooO00o = new C5844LI1L.OooO0O0(this.f23277OooO00o).OooO0Oo(this.f23275OooO00o.OooO0o0()).OooO0OO(this.f23275OooO00o.OooO0Oo()).OooO00o(this.f23275OooO00o.OooO0O0()).OooO0O0(this.f23275OooO00o.OooO0OO()).OooO00o(this.f23275OooO00o.m16429OooO00o()).OooO00o();
    }

    public void OooO00o(C5844LI1L r3, C6394iiIlI r4) {
        if (!C9586iIILl.m21627OooO00o(r3.OooO0OO(), r4.OooO0OO())) {
            throw new IllegalStateException("root of private key and public key do not match");
        } else if (C9586iIILl.m21627OooO00o(r3.OooO0O0(), r4.OooO0O0())) {
            this.f23275OooO00o = r3;
            this.f23276OooO00o = r4;
            this.OooO00o.OooO00o(new byte[this.f23277OooO00o.OooO00o()], this.f23275OooO00o.OooO0O0());
        } else {
            throw new IllegalStateException("public seed of private key and public key do not match");
        }
    }

    public void OooO00o(byte[] bArr) {
        this.f23275OooO00o = new C5844LI1L.OooO0O0(this.f23277OooO00o).OooO0Oo(this.f23275OooO00o.OooO0o0()).OooO0OO(this.f23275OooO00o.OooO0Oo()).OooO00o(bArr).OooO0O0(OooO0Oo()).OooO00o(this.f23275OooO00o.m16429OooO00o()).OooO00o();
        this.f23276OooO00o = new C6394iiIlI.OooO0O0(this.f23277OooO00o).OooO0OO(OooO0Oo()).OooO0O0(bArr).OooO00o();
        this.OooO00o.OooO00o(new byte[this.f23277OooO00o.OooO00o()], bArr);
    }

    public void OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("privateKey == null");
        } else if (bArr2 != null) {
            C5844LI1L OooO00o2 = new C5844LI1L.OooO0O0(this.f23277OooO00o).OooO00o(bArr, m21720OooO00o()).OooO00o();
            C6394iiIlI OooO00o3 = new C6394iiIlI.OooO0O0(this.f23277OooO00o).OooO00o(bArr2).OooO00o();
            if (!C9586iIILl.m21627OooO00o(OooO00o2.OooO0OO(), OooO00o3.OooO0OO())) {
                throw new IllegalStateException("root of private key and public key do not match");
            } else if (C9586iIILl.m21627OooO00o(OooO00o2.OooO0O0(), OooO00o3.OooO0O0())) {
                this.f23275OooO00o = OooO00o2;
                this.f23276OooO00o = OooO00o3;
                this.OooO00o.OooO00o(new byte[this.f23277OooO00o.OooO00o()], this.f23275OooO00o.OooO0O0());
            } else {
                throw new IllegalStateException("public seed of private key and public key do not match");
            }
        } else {
            throw new NullPointerException("publicKey == null");
        }
    }

    public boolean OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ParseException {
        if (bArr == null) {
            throw new NullPointerException("message == null");
        } else if (bArr2 == null) {
            throw new NullPointerException("signature == null");
        } else if (bArr3 != null) {
            l1L1i l1l1i = new l1L1i();
            l1l1i.OooO00o(false, (AbstractC6370iIIIl) new C6394iiIlI.OooO0O0(m21720OooO00o()).OooO00o(bArr3).OooO00o());
            return l1l1i.OooO00o(bArr, bArr2);
        } else {
            throw new NullPointerException("publicKey == null");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21722OooO00o() {
        return this.f23275OooO00o.m16430OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21723OooO00o(byte[] bArr) {
        if (bArr != null) {
            l1L1i l1l1i = new l1L1i();
            l1l1i.OooO00o(true, (AbstractC6370iIIIl) this.f23275OooO00o);
            byte[] OooO00o2 = l1l1i.OooO00o(bArr);
            C5844LI1L r0 = (C5844LI1L) l1l1i.OooO00o();
            this.f23275OooO00o = r0;
            OooO00o(r0, this.f23276OooO00o);
            return OooO00o2;
        }
        throw new NullPointerException("message == null");
    }

    public void OooO0O0(byte[] bArr) {
        this.f23275OooO00o = new C5844LI1L.OooO0O0(this.f23277OooO00o).OooO0Oo(this.f23275OooO00o.OooO0o0()).OooO0OO(this.f23275OooO00o.OooO0Oo()).OooO00o(OooO0OO()).OooO0O0(bArr).OooO00o(this.f23275OooO00o.m16429OooO00o()).OooO00o();
        this.f23276OooO00o = new C6394iiIlI.OooO0O0(this.f23277OooO00o).OooO0OO(bArr).OooO0O0(OooO0OO()).OooO00o();
    }

    public byte[] OooO0O0() {
        return this.f23276OooO00o.m17515OooO00o();
    }

    public byte[] OooO0OO() {
        return this.f23275OooO00o.OooO0O0();
    }

    public byte[] OooO0Oo() {
        return this.f23275OooO00o.OooO0OO();
    }
}
