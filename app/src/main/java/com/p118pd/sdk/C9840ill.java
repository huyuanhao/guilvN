package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨ill  reason: invalid class name and case insensitive filesystem */
public class C9840ill {

    /* renamed from: com.pd.sdk.丨丨ill$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public volatile boolean OooO0O0;
        public volatile int o00oO0O;

        public OooO0O0() {
            this.o00oO0O = 0;
            this.OooO0O0 = false;
        }

        public byte[] OooO00o(int i, boolean z) {
            Thread thread = new Thread(this);
            byte[] bArr = new byte[i];
            this.o00oO0O = 0;
            this.OooO0O0 = false;
            thread.start();
            if (!z) {
                i *= 8;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                while (this.o00oO0O == i2) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException unused) {
                    }
                }
                i2 = this.o00oO0O;
                if (z) {
                    bArr[i3] = (byte) (i2 & 255);
                } else {
                    int i4 = i3 / 8;
                    bArr[i4] = (byte) ((bArr[i4] << 1) | (i2 & 1));
                }
            }
            this.OooO0O0 = true;
            return bArr;
        }

        public void run() {
            while (!this.OooO0O0) {
                this.o00oO0O++;
            }
        }
    }

    public byte[] OooO00o(int i, boolean z) {
        return new OooO0O0().OooO00o(i, z);
    }
}
