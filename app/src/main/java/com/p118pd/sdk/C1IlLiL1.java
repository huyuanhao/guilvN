package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.丨1IlLiL1  reason: invalid class name */
public class C1IlLiL1 implements AbstractC6681liLI {
    public static final int OooO0O0 = 13;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final long f22762OooO0O0 = 120000;
    public static final int OooO0OO = 16384;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final long f22763OooO0OO = 240000;
    public volatile int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f22764OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5802Llli f22765OooO00o = new C5802Llli();

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile i1iiIl f22766OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final iL1liI f22767OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6333illiL f22768OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6681liLI f22769OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C931611Ii f22770OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9686lL1 f22771OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile boolean f22772OooO00o = false;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public volatile i1iiIl f22773OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C931611Ii f22774OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public volatile boolean f22775OooO0O0 = false;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public C931611Ii f22776OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public volatile boolean f22777OooO0OO;
    public C931611Ii OooO0Oo;
    public C931611Ii OooO0o0 = null;

    public C1IlLiL1(AbstractC6681liLI r4, iL1liI il1lii, AbstractC6333illiL illil, short s) {
        this.f22769OooO00o = r4;
        this.f22767OooO00o = il1lii;
        this.f22768OooO00o = illil;
        this.f22777OooO0OO = true;
        C931611Ii r42 = new C931611Ii(0, new LLL1lIiI(il1lii));
        this.f22770OooO00o = r42;
        this.f22774OooO0O0 = null;
        this.f22776OooO0OO = r42;
        this.OooO0Oo = r42;
        OooO00o(16384);
    }

    public static long OooO00o(int i, long j) {
        return j | ((((long) i) & 4294967295L) << 48);
    }

    private void OooO00o(short s, short s2, String str, Throwable th) throws IOException {
        this.f22768OooO00o.OooO00o(s, s2, str, th);
        OooO00o((short) 21, new byte[]{(byte) s, (byte) s2}, 0, 2);
    }

    private void OooO00o(short s, byte[] bArr, int i, int i2) throws IOException {
        if (this.f22773OooO0O0 != null) {
            if (i2 > this.OooO00o) {
                throw new TlsFatalAlert(80);
            } else if (i2 >= 1 || s == 23) {
                int OooO00o2 = this.OooO0Oo.OooO00o();
                long OooO00o3 = this.OooO0Oo.m21342OooO00o();
                byte[] OooO0O02 = this.OooO0Oo.m21344OooO00o().OooO0O0(OooO00o(OooO00o2, OooO00o3), s, bArr, i, i2);
                int length = OooO0O02.length + 13;
                byte[] bArr2 = new byte[length];
                L1LL1Ii.OooO00o(s, bArr2, 0);
                L1LL1Ii.OooO00o(this.f22773OooO0O0, bArr2, 1);
                L1LL1Ii.OooO00o(OooO00o2, bArr2, 3);
                L1LL1Ii.OooO0O0(OooO00o3, bArr2, 5);
                L1LL1Ii.OooO00o(OooO0O02.length, bArr2, 11);
                System.arraycopy(OooO0O02, 0, bArr2, 13, OooO0O02.length);
                this.f22769OooO00o.OooO00o(bArr2, 0, length);
            } else {
                throw new TlsFatalAlert(80);
            }
        }
    }

    private int OooO0O0(byte[] bArr, int i, int i2, int i3) throws IOException {
        int OooO00o2;
        int i4;
        if (this.f22765OooO00o.OooO00o() > 0) {
            if (this.f22765OooO00o.OooO00o() >= 13) {
                byte[] bArr2 = new byte[2];
                this.f22765OooO00o.OooO00o(bArr2, 0, 2, 11);
                i4 = L1LL1Ii.OooO00o(bArr2, 0);
            } else {
                i4 = 0;
            }
            int min = Math.min(this.f22765OooO00o.OooO00o(), i4 + 13);
            this.f22765OooO00o.OooO0O0(bArr, i, min, 0);
            return min;
        }
        int OooO00o3 = this.f22769OooO00o.OooO00o(bArr, i, i2, i3);
        if (OooO00o3 < 13 || OooO00o3 <= (OooO00o2 = L1LL1Ii.OooO00o(bArr, i + 11) + 13)) {
            return OooO00o3;
        }
        this.f22765OooO00o.OooO00o(bArr, i + OooO00o2, OooO00o3 - OooO00o2);
        return OooO00o2;
    }

    private void OooO0OO() {
        if (!this.f22772OooO00o) {
            try {
                if (!this.f22775OooO0O0) {
                    OooO00o((short) 0, (String) null);
                }
                this.f22769OooO00o.close();
            } catch (Exception unused) {
            }
            this.f22772OooO00o = true;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public int OooO00o() throws IOException {
        return Math.min(this.OooO00o, this.OooO0Oo.m21344OooO00o().OooO00o(this.f22769OooO00o.OooO00o() - 13));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:91:0x0004 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:98:0x0004 */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.pd.sdk.丨lL1, com.pd.sdk.丨1丨1I丨i] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076 A[Catch:{ IOException -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0077 A[Catch:{ IOException -> 0x013e }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p118pd.sdk.AbstractC6681liLI
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int OooO00o(byte[] r19, int r20, int r21, int r22) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 350
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C1IlLiL1.OooO00o(byte[], int, int, int):int");
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public i1iiIl m21296OooO00o() {
        return this.f22766OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21297OooO00o() {
        if (!this.f22772OooO00o) {
            this.f22775OooO0O0 = true;
            OooO0OO();
        }
    }

    public void OooO00o(int i) {
        this.OooO00o = i;
    }

    public void OooO00o(i1iiIl i1iiil) {
        this.f22766OooO00o = i1iiil;
    }

    public void OooO00o(C11iil r3) {
        if (this.f22774OooO0O0 == null) {
            this.f22774OooO0O0 = new C931611Ii(this.OooO0Oo.OooO00o() + 1, r3);
            return;
        }
        throw new IllegalStateException();
    }

    public void OooO00o(AbstractC9686lL1 r5) {
        C931611Ii r0 = this.f22776OooO0OO;
        C931611Ii r1 = this.f22770OooO00o;
        if (r0 == r1 || this.OooO0Oo == r1) {
            throw new IllegalStateException();
        }
        if (r5 != null) {
            this.f22771OooO00o = r5;
            this.OooO0o0 = r1;
            this.f22764OooO00o = System.currentTimeMillis() + f22763OooO0OO;
        }
        this.f22777OooO0OO = false;
        this.f22770OooO00o = this.f22774OooO0O0;
        this.f22774OooO0O0 = null;
    }

    public void OooO00o(short s) {
        if (!this.f22772OooO00o) {
            try {
                OooO00o((short) 2, s, (String) null, (Throwable) null);
            } catch (Exception unused) {
            }
            this.f22775OooO0O0 = true;
            OooO0OO();
        }
    }

    public void OooO00o(short s, String str) throws IOException {
        OooO00o((short) 1, s, str, (Throwable) null);
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public void OooO00o(byte[] bArr, int i, int i2) throws IOException {
        short s;
        if (this.f22777OooO0OO || this.OooO0Oo == this.OooO0o0) {
            s = 22;
            if (L1LL1Ii.m15924OooO00o(bArr, i) == 20) {
                C931611Ii r1 = null;
                if (this.f22777OooO0OO) {
                    r1 = this.f22774OooO0O0;
                } else if (this.OooO0Oo == this.OooO0o0) {
                    r1 = this.f22770OooO00o;
                }
                if (r1 != null) {
                    OooO00o((short) 20, new byte[]{1}, 0, 1);
                    this.OooO0Oo = r1;
                } else {
                    throw new IllegalStateException();
                }
            }
        } else {
            s = 23;
        }
        OooO00o(s, bArr, i, i2);
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public int OooO0O0() throws IOException {
        return Math.min(this.OooO00o, this.f22776OooO0OO.m21344OooO00o().OooO00o(this.f22769OooO00o.OooO0O0() - 13));
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m21298OooO0O0() {
        C931611Ii r0 = this.OooO0o0;
        if (r0 == null) {
            r0 = this.f22770OooO00o;
        }
        this.OooO0Oo = r0;
    }

    public void OooO0O0(i1iiIl i1iiil) {
        this.f22773OooO0O0 = i1iiil;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public int m21299OooO0OO() {
        return this.f22776OooO0OO.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6681liLI
    public void close() throws IOException {
        if (!this.f22772OooO00o) {
            if (this.f22777OooO0OO) {
                OooO00o((short) 90, "User canceled handshake");
            }
            OooO0OO();
        }
    }
}
