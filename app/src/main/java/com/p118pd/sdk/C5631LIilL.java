package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.LIilL  reason: case insensitive filesystem */
public class C5631LIilL {
    public static int OooO0Oo = 16384;
    public static final int OooO0o = 0;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = 1;
    public static final int OooO0oo = 3;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f16321OooO00o = new OooO0O0(null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5853LLLl f16322OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public i1iiIl f16323OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6892l1 f16324OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C11iil f16325OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9429Il f16326OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9439IL f16327OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ByteArrayOutputStream f16328OooO00o = new ByteArrayOutputStream();

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f16329OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OutputStream f16330OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16331OooO00o = true;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public OooO0O0 f16332OooO0O0 = new OooO0O0(null);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public i1iiIl f16333OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C11iil f16334OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC9429Il f16335OooO0O0 = null;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public C11iil f16336OooO0OO = null;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public AbstractC9429Il f16337OooO0OO = null;

    /* renamed from: com.pd.sdk.LIilL$OooO00o */
    public class OooO00o extends AbstractC5853LLLl {
        public OooO00o() {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            C5631LIilL.this.f16327OooO00o.update(bArr, i, i2);
        }
    }

    /* renamed from: com.pd.sdk.LIilL$OooO0O0 */
    public static class OooO0O0 {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f16338OooO00o;

        public OooO0O0() {
            this.OooO00o = 0;
            this.f16338OooO00o = false;
        }

        public /* synthetic */ OooO0O0(OooO00o oooO00o) {
            this();
        }

        public synchronized long OooO00o(short s) throws TlsFatalAlert {
            long j;
            if (!this.f16338OooO00o) {
                j = this.OooO00o;
                long j2 = this.OooO00o + 1;
                this.OooO00o = j2;
                if (j2 == 0) {
                    this.f16338OooO00o = true;
                }
            } else {
                throw new TlsFatalAlert(s);
            }
            return j;
        }
    }

    public C5631LIilL(AbstractC6892l1 r3, InputStream inputStream, OutputStream outputStream) {
        this.f16324OooO00o = r3;
        this.f16329OooO00o = inputStream;
        this.f16330OooO00o = outputStream;
        C5246IL11i r32 = new C5246IL11i();
        this.f16335OooO0O0 = r32;
        this.f16337OooO0OO = r32;
    }

    public static void OooO00o(int i, int i2, short s) throws IOException {
        if (i > i2) {
            throw new TlsFatalAlert(s);
        }
    }

    public static void OooO00o(short s, short s2) throws IOException {
        switch (s) {
            case 20:
            case 21:
            case 22:
            case 23:
                return;
            default:
                throw new TlsFatalAlert(s2);
        }
    }

    private byte[] OooO00o() {
        byte[] byteArray = this.f16328OooO00o.toByteArray();
        this.f16328OooO00o.reset();
        return byteArray;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16101OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public i1iiIl m16102OooO00o() {
        return this.f16323OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9439IL m16103OooO00o() {
        return this.f16327OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OutputStream m16104OooO00o() {
        return this.f16322OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16105OooO00o() throws IOException {
        C11iil r1;
        AbstractC9429Il r0 = this.f16335OooO0O0;
        AbstractC9429Il r12 = this.f16326OooO00o;
        if (r0 == r12 && this.f16337OooO0OO == r12 && this.f16334OooO0O0 == (r1 = this.f16325OooO00o) && this.f16336OooO0OO == r1) {
            this.f16326OooO00o = null;
            this.f16325OooO00o = null;
            return;
        }
        throw new TlsFatalAlert(40);
    }

    public void OooO00o(int i) {
        this.OooO00o = i;
        int i2 = i + 1024;
        this.OooO0O0 = i2;
        this.OooO0OO = i2 + 1024;
    }

    public void OooO00o(i1iiIl i1iiil) {
        this.f16323OooO00o = i1iiil;
    }

    public void OooO00o(iL1liI il1lii) {
        LLL1lIiI lLL1lIiI = new LLL1lIiI(il1lii);
        this.f16334OooO0O0 = lLL1lIiI;
        this.f16336OooO0OO = lLL1lIiI;
        C6367iI11 r0 = new C6367iI11();
        this.f16327OooO00o = r0;
        r0.OooO00o(il1lii);
        OooO00o(OooO0Oo);
    }

    public void OooO00o(AbstractC9429Il r1, C11iil r2) {
        this.f16326OooO00o = r1;
        this.f16325OooO00o = r2;
    }

    public void OooO00o(short s, byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        if (this.f16333OooO0O0 != null) {
            OooO00o(s, (short) 80);
            OooO00o(i2, this.OooO00o, (short) 80);
            if (i2 >= 1 || s == 23) {
                OutputStream OooO0O02 = this.f16337OooO0OO.OooO0O0(this.f16328OooO00o);
                long OooO00o2 = this.f16332OooO0O0.OooO00o(80);
                if (OooO0O02 == this.f16328OooO00o) {
                    bArr2 = this.f16336OooO0OO.OooO0O0(OooO00o2, s, bArr, i, i2);
                } else {
                    OooO0O02.write(bArr, i, i2);
                    OooO0O02.flush();
                    byte[] OooO00o3 = OooO00o();
                    OooO00o(OooO00o3.length, i2 + 1024, (short) 80);
                    bArr2 = this.f16336OooO0OO.OooO0O0(OooO00o2, s, OooO00o3, 0, OooO00o3.length);
                }
                OooO00o(bArr2.length, this.OooO0OO, (short) 80);
                byte[] bArr3 = new byte[(bArr2.length + 5)];
                L1LL1Ii.OooO00o(s, bArr3, 0);
                L1LL1Ii.OooO00o(this.f16333OooO0O0, bArr3, 1);
                L1LL1Ii.OooO00o(bArr2.length, bArr3, 3);
                System.arraycopy(bArr2, 0, bArr3, 5, bArr2.length);
                this.f16330OooO00o.write(bArr3);
                this.f16330OooO00o.flush();
                return;
            }
            throw new TlsFatalAlert(80);
        }
    }

    public void OooO00o(boolean z) {
        this.f16331OooO00o = z;
    }

    public void OooO00o(byte[] bArr) throws IOException {
        OooO00o(L1LL1Ii.m15924OooO00o(bArr, 0), (short) 10);
        if (this.f16331OooO00o) {
            i1iiIl OooO00o2 = L1LL1Ii.m15918OooO00o(bArr, 1);
            i1iiIl i1iiil = this.f16323OooO00o;
            if (i1iiil != null && !OooO00o2.OooO00o(i1iiil)) {
                throw new TlsFatalAlert(47);
            }
        } else if ((L1LL1Ii.OooO0OO(bArr, 1) & -256) != 768) {
            throw new TlsFatalAlert(47);
        }
        OooO00o(L1LL1Ii.OooO00o(bArr, 3), this.OooO0OO, (short) 22);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16106OooO00o() throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(5, this.f16329OooO00o);
        if (OooO00o2 == null) {
            return false;
        }
        short OooO00o3 = L1LL1Ii.m15924OooO00o(OooO00o2, 0);
        OooO00o(OooO00o3, (short) 10);
        if (this.f16331OooO00o) {
            i1iiIl OooO00o4 = L1LL1Ii.m15918OooO00o(OooO00o2, 1);
            i1iiIl i1iiil = this.f16323OooO00o;
            if (i1iiil == null) {
                this.f16323OooO00o = OooO00o4;
            } else if (!OooO00o4.OooO00o(i1iiil)) {
                throw new TlsFatalAlert(47);
            }
        } else if ((L1LL1Ii.OooO0OO(OooO00o2, 1) & -256) != 768) {
            throw new TlsFatalAlert(47);
        }
        int OooO00o5 = L1LL1Ii.OooO00o(OooO00o2, 3);
        OooO00o(OooO00o5, this.OooO0OO, (short) 22);
        byte[] OooO00o6 = OooO00o(OooO00o3, this.f16329OooO00o, OooO00o5);
        this.f16324OooO00o.OooO00o(OooO00o3, OooO00o6, 0, OooO00o6.length);
        return true;
    }

    public byte[] OooO00o(short s, InputStream inputStream, int i) throws IOException {
        byte[] OooO0O02 = L1LL1Ii.OooO0O0(i, inputStream);
        byte[] OooO00o2 = this.f16334OooO0O0.OooO00o(this.f16321OooO00o.OooO00o(10), s, OooO0O02, 0, OooO0O02.length);
        OooO00o(OooO00o2.length, this.OooO0O0, (short) 22);
        OutputStream OooO00o3 = this.f16335OooO0O0.OooO00o(this.f16328OooO00o);
        if (OooO00o3 != this.f16328OooO00o) {
            OooO00o3.write(OooO00o2, 0, OooO00o2.length);
            OooO00o3.flush();
            OooO00o2 = OooO00o();
        }
        OooO00o(OooO00o2.length, this.OooO00o, (short) 30);
        if (OooO00o2.length >= 1 || s == 23) {
            return OooO00o2;
        }
        throw new TlsFatalAlert(47);
    }

    public AbstractC9439IL OooO0O0() {
        AbstractC9439IL r0 = this.f16327OooO00o;
        this.f16327OooO00o = r0.m21477OooO00o();
        return r0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m16107OooO0O0() throws IOException {
        this.f16330OooO00o.flush();
    }

    public void OooO0O0(i1iiIl i1iiil) {
        this.f16333OooO0O0 = i1iiil;
    }

    public void OooO0OO() {
        this.f16327OooO00o = this.f16327OooO00o.OooO0O0();
    }

    public void OooO0Oo() throws IOException {
        C11iil r1;
        AbstractC9429Il r0 = this.f16326OooO00o;
        if (r0 == null || (r1 = this.f16325OooO00o) == null) {
            throw new TlsFatalAlert(40);
        }
        this.f16335OooO0O0 = r0;
        this.f16334OooO0O0 = r1;
        this.f16321OooO00o = new OooO0O0(null);
    }

    public void OooO0o() throws IOException {
        C11iil r1;
        AbstractC9429Il r0 = this.f16326OooO00o;
        if (r0 == null || (r1 = this.f16325OooO00o) == null) {
            throw new TlsFatalAlert(40);
        }
        this.f16337OooO0OO = r0;
        this.f16336OooO0OO = r1;
        this.f16332OooO0O0 = new OooO0O0(null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|1|2|3|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0o0() {
        /*
            r1 = this;
            java.io.InputStream r0 = r1.f16329OooO00o     // Catch:{ IOException -> 0x0005 }
            r0.close()     // Catch:{ IOException -> 0x0005 }
        L_0x0005:
            java.io.OutputStream r0 = r1.f16330OooO00o     // Catch:{ IOException -> 0x000a }
            r0.close()     // Catch:{ IOException -> 0x000a }
        L_0x000a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5631LIilL.OooO0o0():void");
    }
}
