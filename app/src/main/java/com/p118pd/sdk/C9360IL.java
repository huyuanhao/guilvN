package com.p118pd.sdk;

import com.p118pd.sdk.C5736Liiil;
import com.p118pd.sdk.C6643li1l;
import java.security.SecureRandom;
import java.text.ParseException;

/* renamed from: com.pd.sdk.丨IL  reason: invalid class name and case insensitive filesystem */
public final class C9360IL {
    public C5736Liiil OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6454l1ii f22901OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6643li1l f22902OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9341I1iilI1 f22903OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f22904OooO00o;

    public C9360IL(C6454l1ii l1ii, SecureRandom secureRandom) {
        if (l1ii != null) {
            this.f22901OooO00o = l1ii;
            this.f22903OooO00o = l1ii.m17580OooO00o();
            this.f22904OooO00o = secureRandom;
            this.f22902OooO00o = new C6643li1l.OooO0O0(l1ii).OooO00o();
            this.OooO00o = new C5736Liiil.OooO0O0(l1ii).OooO00o();
            return;
        }
        throw new NullPointerException("params == null");
    }

    private void OooO00o(C6643li1l r4, C5736Liiil r5) {
        this.f22903OooO00o.m21385OooO00o().OooO00o(new byte[this.f22901OooO00o.OooO00o()], this.f22902OooO00o.OooO0O0());
        this.f22902OooO00o = r4;
        this.OooO00o = r5;
    }

    public C6454l1ii OooO00o() {
        return this.f22901OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9341I1iilI1 m21423OooO00o() {
        return this.f22903OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21424OooO00o() {
        C6619lLll llll = new C6619lLll();
        llll.OooO00o(new C6366iI1(OooO00o(), this.f22904OooO00o));
        i1LLl1L OooO00o2 = llll.OooO00o();
        this.f22902OooO00o = (C6643li1l) OooO00o2.OooO00o();
        C5736Liiil r0 = (C5736Liiil) OooO00o2.OooO0O0();
        this.OooO00o = r0;
        OooO00o(this.f22902OooO00o, r0);
    }

    public void OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("privateKey == null");
        } else if (bArr2 != null) {
            C6643li1l OooO00o2 = new C6643li1l.OooO0O0(this.f22901OooO00o).OooO00o(bArr, this.f22903OooO00o).OooO00o();
            C5736Liiil OooO00o3 = new C5736Liiil.OooO0O0(this.f22901OooO00o).OooO00o(bArr2).OooO00o();
            if (!C9586iIILl.m21627OooO00o(OooO00o2.OooO0OO(), OooO00o3.OooO0OO())) {
                throw new IllegalStateException("root of private key and public key do not match");
            } else if (C9586iIILl.m21627OooO00o(OooO00o2.OooO0O0(), OooO00o3.OooO0O0())) {
                this.f22903OooO00o.m21385OooO00o().OooO00o(new byte[this.f22901OooO00o.OooO00o()], OooO00o2.OooO0O0());
                this.f22902OooO00o = OooO00o2;
                this.OooO00o = OooO00o3;
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
            C5602L1l r0 = new C5602L1l();
            r0.OooO00o(false, (AbstractC6370iIIIl) new C5736Liiil.OooO0O0(OooO00o()).OooO00o(bArr3).OooO00o());
            return r0.OooO00o(bArr, bArr2);
        } else {
            throw new NullPointerException("publicKey == null");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21425OooO00o() {
        return this.f22902OooO00o.m17736OooO00o();
    }

    public byte[] OooO00o(byte[] bArr) {
        if (bArr != null) {
            C5602L1l r0 = new C5602L1l();
            r0.OooO00o(true, (AbstractC6370iIIIl) this.f22902OooO00o);
            byte[] OooO00o2 = r0.OooO00o(bArr);
            C6643li1l r02 = (C6643li1l) r0.OooO00o();
            this.f22902OooO00o = r02;
            OooO00o(r02, this.OooO00o);
            return OooO00o2;
        }
        throw new NullPointerException("message == null");
    }

    public byte[] OooO0O0() {
        return this.OooO00o.m16315OooO00o();
    }

    public byte[] OooO0OO() {
        return this.f22902OooO00o.OooO0O0();
    }
}
