package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;

/* renamed from: com.pd.sdk.I丨1I1  reason: invalid class name and case insensitive filesystem */
public final class C5495I1I1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6827lIIi1I1 f15942OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short f15943OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15944OooO00o;
    public byte[] OooO0O0;
    public byte[] OooO0OO;
    public byte[] OooO0Oo;

    /* renamed from: com.pd.sdk.I丨1I1$OooO0O0 */
    public static final class OooO0O0 {
        public int OooO00o = -1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6827lIIi1I1 f15945OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public short f15946OooO00o = -1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f15947OooO00o = null;
        public byte[] OooO0O0 = null;
        public byte[] OooO0OO = null;
        public byte[] OooO0Oo = null;

        private void OooO00o(boolean z, String str) {
            if (!z) {
                throw new IllegalStateException("Required session parameter '" + str + "' not configured");
            }
        }

        public OooO0O0 OooO00o(int i) {
            this.OooO00o = i;
            return this;
        }

        public OooO0O0 OooO00o(C6827lIIi1I1 r1) {
            this.f15945OooO00o = r1;
            return this;
        }

        public OooO0O0 OooO00o(Hashtable hashtable) throws IOException {
            if (hashtable == null) {
                this.OooO0Oo = null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                AbstractC6892l1.OooO00o(byteArrayOutputStream, hashtable);
                this.OooO0Oo = byteArrayOutputStream.toByteArray();
            }
            return this;
        }

        public OooO0O0 OooO00o(short s) {
            this.f15946OooO00o = s;
            return this;
        }

        public OooO0O0 OooO00o(byte[] bArr) {
            this.f15947OooO00o = bArr;
            return this;
        }

        public C5495I1I1 OooO00o() {
            boolean z = true;
            OooO00o(this.OooO00o >= 0, "cipherSuite");
            OooO00o(this.f15946OooO00o >= 0, "compressionAlgorithm");
            if (this.f15947OooO00o == null) {
                z = false;
            }
            OooO00o(z, "masterSecret");
            return new C5495I1I1(this.OooO00o, this.f15946OooO00o, this.f15947OooO00o, this.f15945OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo);
        }

        public OooO0O0 OooO0O0(byte[] bArr) {
            this.OooO0O0 = bArr;
            return this;
        }

        public OooO0O0 OooO0OO(byte[] bArr) {
            this.OooO0O0 = bArr;
            return this;
        }

        public OooO0O0 OooO0Oo(byte[] bArr) {
            this.OooO0OO = bArr;
            return this;
        }
    }

    public C5495I1I1(int i, short s, byte[] bArr, C6827lIIi1I1 r5, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.OooO0O0 = null;
        this.OooO0OO = null;
        this.OooO00o = i;
        this.f15943OooO00o = s;
        this.f15944OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.f15942OooO00o = r5;
        this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
        this.OooO0OO = C9586iIILl.m21630OooO00o(bArr3);
        this.OooO0Oo = bArr4;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5495I1I1 m15726OooO00o() {
        return new C5495I1I1(this.OooO00o, this.f15943OooO00o, this.f15944OooO00o, this.f15942OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6827lIIi1I1 m15727OooO00o() {
        return this.f15942OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Hashtable m15728OooO00o() throws IOException {
        if (this.OooO0Oo == null) {
            return null;
        }
        return AbstractC6892l1.OooO00o(new ByteArrayInputStream(this.OooO0Oo));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short m15729OooO00o() {
        return this.f15943OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15730OooO00o() {
        byte[] bArr = this.f15944OooO00o;
        if (bArr != null) {
            C9586iIILl.OooO00o(bArr, (byte) 0);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15731OooO00o() {
        return this.f15944OooO00o;
    }

    public byte[] OooO0O0() {
        return this.OooO0O0;
    }

    public byte[] OooO0OO() {
        return this.OooO0O0;
    }

    public byte[] OooO0Oo() {
        return this.OooO0OO;
    }
}
