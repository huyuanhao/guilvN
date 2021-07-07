package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.pd.sdk.ooO000  reason: case insensitive filesystem */
public class C8792ooO000 {
    public static final int OooO00o = 25;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static OooO0O0 f21998OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f21999OooO00o;
    public static int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f22000OooO0O0;

    /* renamed from: com.pd.sdk.ooO000$OooO0O0 */
    public static class OooO0O0 implements Comparable<OooO0O0> {
        public byte[] OooO00o;
        public int o00oO0O;
        public int o0ooOO0;
        public int o0ooOOo = 18;

        public OooO0O0(byte[] bArr, int i, int i2) {
            this.OooO00o = bArr;
            this.o00oO0O = i2;
            this.o0ooOO0 = i;
            this.o0ooOOo = Math.min(18, i2);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m20429OooO00o() {
            return this.OooO00o;
        }

        public int OooO0OO() {
            return this.o00oO0O;
        }

        public int OooO0Oo() {
            return this.o0ooOO0;
        }

        public int OooO00o() {
            return this.o0ooOOo;
        }

        /* renamed from: OooO00o */
        public int compareTo(OooO0O0 oooO0O0) {
            if (oooO0O0 == null) {
                return 1;
            }
            if (OooO00o() != oooO0O0.OooO00o()) {
                return this.o0ooOOo - oooO0O0.OooO00o();
            }
            int OooO0Oo = oooO0O0.OooO0Oo();
            for (int i = 0; i < this.o0ooOOo; i++) {
                byte b = this.OooO00o[this.o0ooOO0 + i];
                byte b2 = oooO0O0.m20429OooO00o()[i + OooO0Oo];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b A[SYNTHETIC, Splitter:B:42:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085 A[SYNTHETIC, Splitter:B:47:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009e A[SYNTHETIC, Splitter:B:59:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00a8 A[SYNTHETIC, Splitter:B:64:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00b2 A[SYNTHETIC, Splitter:B:69:0x00b2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8792ooO000.OooO00o(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: com.pd.sdk.ooO000$OooO00o */
    public static class OooO00o {
        public static final byte OooO00o = 0;
        public static final byte OooO0O0 = 10;
        public static final int OooO0Oo = 8192;
        public static final int OooO0o = 18;
        public static final int OooO0o0 = 131072;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f22001OooO00o = 8192;

        /* renamed from: OooO00o  reason: collision with other field name */
        public InputStream f22002OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<Integer> f22003OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f22004OooO00o = new byte[8192];

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int f22005OooO0O0 = -1;
        public int OooO0OO = 0;

        public OooO00o(InputStream inputStream) {
            this.f22002OooO00o = inputStream;
            this.f22003OooO00o = new LinkedList();
        }

        private int OooO0O0() throws IOException {
            while (this.f22003OooO00o.size() == 0) {
                int OooO00o2 = OooO00o();
                if (OooO00o2 < 0) {
                    return -1;
                }
                int read = this.f22002OooO00o.read(this.f22004OooO00o, OooO00o2, this.f22001OooO00o - OooO00o2);
                this.OooO0OO = read;
                if (read <= 0 || OooO0O0(OooO00o2, read)) {
                    return -1;
                }
                OooO00o(OooO00o2);
                this.f22005OooO0O0 = -1;
            }
            return this.OooO0OO;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO0O0 m20428OooO00o() {
            while (OooO0O0() > 0) {
                try {
                    int intValue = this.f22003OooO00o.remove(0).intValue();
                    int i = intValue - this.f22005OooO0O0;
                    if (i >= 18) {
                        if (OooO00o(this.f22005OooO0O0, i)) {
                            this.f22005OooO0O0 = intValue;
                        } else {
                            int i2 = intValue + 1;
                            if (i2 == this.f22001OooO00o || this.f22004OooO00o[i2] == 48 || this.f22004OooO00o[i2] == 49 || this.f22004OooO00o[i2] == 0) {
                                OooO0O0 oooO0O0 = new OooO0O0(this.f22004OooO00o, this.f22005OooO0O0 + 1, i);
                                this.f22005OooO0O0 = intValue;
                                return oooO0O0;
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        private boolean OooO0O0(int i, int i2) {
            byte[] bArr = this.f22004OooO00o;
            return bArr[i] == 0 && bArr[(i2 / 2) + i] == 0 && bArr[(this.OooO0OO + i) - 1] == 0;
        }

        private void OooO00o(int i) {
            int i2 = this.OooO0OO + i;
            while (i < i2) {
                if (this.f22004OooO00o[i] == 10) {
                    this.f22003OooO00o.add(Integer.valueOf(i));
                    i += 54;
                }
                i++;
            }
        }

        private boolean OooO00o(int i, int i2) {
            byte[] bArr = this.f22004OooO00o;
            return bArr[i + 1] == 0 || bArr[(i2 / 2) + i] == 0 || bArr[(i + i2) - 1] == 0;
        }

        private int OooO00o() {
            if (this.OooO0OO <= 0) {
                return 0;
            }
            int i = this.f22001OooO00o;
            int i2 = this.f22005OooO0O0;
            int i3 = (i - i2) - 1;
            if (i2 == -1) {
                if (i >= 131072) {
                    return -1;
                }
                this.f22001OooO00o = i << 1;
            }
            byte[] bArr = new byte[this.f22001OooO00o];
            System.arraycopy(this.f22004OooO00o, this.f22005OooO0O0 + 1, bArr, 0, i3);
            this.f22004OooO00o = bArr;
            return i3;
        }
    }

    public static void OooO00o() {
        f21998OooO00o = null;
        f21999OooO00o = false;
        f22000OooO0O0 = false;
        OooO0O0 = 0;
    }

    public static OooO0O0 OooO00o(OooO00o oooO00o, OooO00o oooO00o2) {
        if (f22000OooO0O0) {
            if (!f21999OooO00o) {
                oooO00o = oooO00o2;
            }
            return oooO00o.m20428OooO00o();
        }
        boolean z = false;
        if (f21998OooO00o == null) {
            OooO0O0 OooO00o2 = oooO00o.m20428OooO00o();
            OooO0O0 OooO00o3 = oooO00o2.m20428OooO00o();
            if (OooO00o2.compareTo(OooO00o3) <= 0) {
                z = true;
            }
            f21999OooO00o = z;
            f21998OooO00o = z ? OooO00o3 : OooO00o2;
            return f21999OooO00o ? OooO00o2 : OooO00o3;
        }
        OooO0O0 OooO00o4 = f21999OooO00o ? oooO00o.m20428OooO00o() : oooO00o2.m20428OooO00o();
        if (OooO00o4 == null) {
            f22000OooO0O0 = true;
            OooO0O0 oooO0O0 = f21998OooO00o;
            f21999OooO00o = !f21999OooO00o;
            return oooO0O0;
        } else if (OooO0O0 >= 25 || OooO00o4.compareTo(f21998OooO00o) > 0) {
            OooO0O0 oooO0O02 = f21998OooO00o;
            f21998OooO00o = OooO00o4;
            f21999OooO00o = !f21999OooO00o;
            OooO0O0 = 0;
            return oooO0O02;
        } else {
            OooO0O0++;
            return OooO00o4;
        }
    }
}
