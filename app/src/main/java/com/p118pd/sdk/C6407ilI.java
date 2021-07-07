package com.p118pd.sdk;

import com.p118pd.sdk.C6190iLlIl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.i丨lI  reason: invalid class name and case insensitive filesystem */
public final class C6407ilI implements AbstractC6433il1 {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6454l1ii f18222OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<C6190iLlIl> f18223OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f18224OooO00o;

    /* renamed from: com.pd.sdk.i丨lI$OooO0O0 */
    public static class OooO0O0 {
        public long OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C6454l1ii f18225OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<C6190iLlIl> f18226OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f18227OooO00o = null;
        public byte[] OooO0O0 = null;

        public OooO0O0(C6454l1ii l1ii) {
            this.f18225OooO00o = l1ii;
        }

        public OooO0O0 OooO00o(long j) {
            this.OooO00o = j;
            return this;
        }

        public OooO0O0 OooO00o(List<C6190iLlIl> list) {
            this.f18226OooO00o = list;
            return this;
        }

        public OooO0O0 OooO00o(byte[] bArr) {
            this.f18227OooO00o = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public C6407ilI OooO00o() {
            return new C6407ilI(this);
        }

        public OooO0O0 OooO0O0(byte[] bArr) {
            this.OooO0O0 = bArr;
            return this;
        }
    }

    public C6407ilI(OooO0O0 oooO0O0) {
        C6454l1ii l1ii = oooO0O0.f18225OooO00o;
        this.f18222OooO00o = l1ii;
        if (l1ii != null) {
            int OooO00o2 = l1ii.OooO00o();
            byte[] bArr = oooO0O0.OooO0O0;
            if (bArr != null) {
                int OooO0O02 = this.f18222OooO00o.m17578OooO00o().m15837OooO00o().OooO0O0();
                double OooO0O03 = (double) this.f18222OooO00o.OooO0O0();
                Double.isNaN(OooO0O03);
                int ceil = (int) Math.ceil(OooO0O03 / 8.0d);
                int OooO0O04 = ((this.f18222OooO00o.OooO0O0() / this.f18222OooO00o.OooO0OO()) + OooO0O02) * OooO00o2;
                if (bArr.length == ceil + OooO00o2 + (this.f18222OooO00o.OooO0OO() * OooO0O04)) {
                    this.OooO00o = C5532IiIllL.OooO00o(bArr, 0, ceil);
                    if (C5532IiIllL.OooO00o(this.f18222OooO00o.OooO0O0(), this.OooO00o)) {
                        int i = ceil + 0;
                        this.f18224OooO00o = C5532IiIllL.m15807OooO00o(bArr, i, OooO00o2);
                        this.f18223OooO00o = new ArrayList();
                        for (int i2 = i + OooO00o2; i2 < bArr.length; i2 += OooO0O04) {
                            this.f18223OooO00o.add(new C6190iLlIl.OooO00o(this.f18222OooO00o.m17580OooO00o()).OooO00o(C5532IiIllL.m15807OooO00o(bArr, i2, OooO0O04)).OooO00o());
                        }
                        return;
                    }
                    throw new IllegalArgumentException("index out of bounds");
                }
                throw new IllegalArgumentException("signature has wrong size");
            }
            this.OooO00o = oooO0O0.OooO00o;
            byte[] bArr2 = oooO0O0.f18227OooO00o;
            if (bArr2 == null) {
                this.f18224OooO00o = new byte[OooO00o2];
            } else if (bArr2.length == OooO00o2) {
                this.f18224OooO00o = bArr2;
            } else {
                throw new IllegalArgumentException("size of random needs to be equal to size of digest");
            }
            List<C6190iLlIl> list = oooO0O0.f18226OooO00o;
            this.f18223OooO00o = list == null ? new ArrayList<>() : list;
            return;
        }
        throw new NullPointerException("params == null");
    }

    @Override // com.p118pd.sdk.AbstractC6433il1
    public long OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<C6190iLlIl> m17523OooO00o() {
        return this.f18223OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17524OooO00o() {
        int OooO00o2 = this.f18222OooO00o.OooO00o();
        int OooO0O02 = this.f18222OooO00o.m17578OooO00o().m15837OooO00o().OooO0O0();
        double OooO0O03 = (double) this.f18222OooO00o.OooO0O0();
        Double.isNaN(OooO0O03);
        int ceil = (int) Math.ceil(OooO0O03 / 8.0d);
        int OooO0O04 = ((this.f18222OooO00o.OooO0O0() / this.f18222OooO00o.OooO0OO()) + OooO0O02) * OooO00o2;
        byte[] bArr = new byte[(ceil + OooO00o2 + (this.f18222OooO00o.OooO0OO() * OooO0O04))];
        C5532IiIllL.OooO00o(bArr, C5532IiIllL.m15806OooO00o(this.OooO00o, ceil), 0);
        int i = ceil + 0;
        C5532IiIllL.OooO00o(bArr, this.f18224OooO00o, i);
        int i2 = i + OooO00o2;
        for (C6190iLlIl illil : this.f18223OooO00o) {
            C5532IiIllL.OooO00o(bArr, illil.m17159OooO00o(), i2);
            i2 += OooO0O04;
        }
        return bArr;
    }

    public byte[] OooO0O0() {
        return C5532IiIllL.OooO00o(this.f18224OooO00o);
    }
}
