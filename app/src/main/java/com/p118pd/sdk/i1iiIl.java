package com.p118pd.sdk;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.i1iiIl */
public final class i1iiIl {
    public static final i1iiIl OooO00o = new i1iiIl(768, "SSL 3.0");
    public static final i1iiIl OooO0O0 = new i1iiIl(769, "TLS 1.0");
    public static final i1iiIl OooO0OO = new i1iiIl(770, "TLS 1.1");
    public static final i1iiIl OooO0Oo = new i1iiIl(771, "TLS 1.2");
    public static final i1iiIl OooO0o = new i1iiIl(65277, "DTLS 1.2");
    public static final i1iiIl OooO0o0 = new i1iiIl(65279, "DTLS 1.0");

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f17410OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f17411OooO00o;

    public i1iiIl(int i, String str) {
        this.f17410OooO00o = i & 65535;
        this.f17411OooO00o = str;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static i1iiIl OooO00o(int i, int i2) throws IOException {
        String str;
        if (i != 3) {
            if (i == 254) {
                switch (i2) {
                    case TinkerReport.KEY_LOADED_EXCEPTION_DEX_CHECK /*{ENCODED_INT: 253}*/:
                        return OooO0o;
                    case 254:
                        throw new TlsFatalAlert(47);
                    case 255:
                        return OooO0o0;
                    default:
                        str = "DTLS";
                        break;
                }
            } else {
                throw new TlsFatalAlert(47);
            }
        } else if (i2 == 0) {
            return OooO00o;
        } else {
            if (i2 == 1) {
                return OooO0O0;
            }
            if (i2 == 2) {
                return OooO0OO;
            }
            if (i2 == 3) {
                return OooO0Oo;
            }
            str = "TLS";
        }
        return OooO00o(i, i2, str);
    }

    public static i1iiIl OooO00o(int i, int i2, String str) throws IOException {
        L1LL1Ii.m15943OooO0OO(i);
        L1LL1Ii.m15943OooO0OO(i2);
        int i3 = (i << 8) | i2;
        String OooO0O02 = Strings.OooO0O0(Integer.toHexString(65536 | i3).substring(1));
        return new i1iiIl(i3, str + " 0x" + OooO0O02);
    }

    public int OooO00o() {
        return this.f17410OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public i1iiIl m16891OooO00o() {
        return !m16892OooO00o() ? this : this == OooO0o0 ? OooO0OO : OooO0Oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16892OooO00o() {
        return OooO0O0() == 254;
    }

    public boolean OooO00o(i1iiIl i1iiil) {
        return i1iiil != null && this.f17410OooO00o == i1iiil.f17410OooO00o;
    }

    public int OooO0O0() {
        return this.f17410OooO00o >> 8;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16893OooO0O0() {
        return this == OooO00o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO0O0(com.p118pd.sdk.i1iiIl r4) {
        /*
            r3 = this;
            int r0 = r3.OooO0O0()
            int r1 = r4.OooO0O0()
            r2 = 0
            if (r0 == r1) goto L_0x000c
            return r2
        L_0x000c:
            int r4 = r4.OooO0OO()
            int r0 = r3.OooO0OO()
            int r4 = r4 - r0
            boolean r0 = r3.m16892OooO00o()
            r1 = 1
            if (r0 == 0) goto L_0x001f
            if (r4 > 0) goto L_0x0022
            goto L_0x0021
        L_0x001f:
            if (r4 < 0) goto L_0x0022
        L_0x0021:
            r2 = 1
        L_0x0022:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.i1iiIl.OooO0O0(com.pd.sdk.i1iiIl):boolean");
    }

    public int OooO0OO() {
        return this.f17410OooO00o & 255;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m16894OooO0OO() {
        return OooO0O0() == 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO0OO(com.p118pd.sdk.i1iiIl r4) {
        /*
            r3 = this;
            int r0 = r3.OooO0O0()
            int r1 = r4.OooO0O0()
            r2 = 0
            if (r0 == r1) goto L_0x000c
            return r2
        L_0x000c:
            int r4 = r4.OooO0OO()
            int r0 = r3.OooO0OO()
            int r4 = r4 - r0
            boolean r0 = r3.m16892OooO00o()
            r1 = 1
            if (r0 == 0) goto L_0x001f
            if (r4 <= 0) goto L_0x0022
            goto L_0x0021
        L_0x001f:
            if (r4 >= 0) goto L_0x0022
        L_0x0021:
            r2 = 1
        L_0x0022:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.i1iiIl.OooO0OO(com.pd.sdk.i1iiIl):boolean");
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof i1iiIl) && OooO00o((i1iiIl) obj));
    }

    public int hashCode() {
        return this.f17410OooO00o;
    }

    public String toString() {
        return this.f17411OooO00o;
    }
}
