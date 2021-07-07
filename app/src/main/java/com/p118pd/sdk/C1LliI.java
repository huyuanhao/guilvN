package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.丨1LliI  reason: invalid class name */
public class C1LliI extends C6293il1I {
    public static final int OooO0O0 = 8;
    public boolean OooO00o;
    public int[] OooOO0O = null;
    public int[] OooOO0o = null;
    public int[] OooOOO0 = null;

    @Override // com.p118pd.sdk.C6293il1I, com.p118pd.sdk.C6293il1I, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 8;
    }

    @Override // com.p118pd.sdk.C6293il1I, com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.OooOO0O;
        if (iArr == null) {
            throw new IllegalStateException("DESede engine not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 <= bArr2.length) {
            byte[] bArr3 = new byte[8];
            if (this.OooO00o) {
                OooO00o(iArr, bArr, i, bArr3, 0);
                OooO00o(this.OooOO0o, bArr3, 0, bArr3, 0);
                OooO00o(this.OooOOO0, bArr3, 0, bArr2, i2);
            } else {
                OooO00o(this.OooOOO0, bArr, i, bArr3, 0);
                OooO00o(this.OooOO0o, bArr3, 0, bArr3, 0);
                OooO00o(this.OooOO0O, bArr3, 0, bArr2, i2);
            }
            return 8;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.C6293il1I, com.p118pd.sdk.C6293il1I, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21305OooO00o() {
        return "DESede";
    }

    @Override // com.p118pd.sdk.C6293il1I, com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r8) {
        if (r8 instanceof C6642li1LI) {
            byte[] OooO00o2 = ((C6642li1LI) r8).OooO00o();
            if (OooO00o2.length == 24 || OooO00o2.length == 16) {
                this.OooO00o = z;
                byte[] bArr = new byte[8];
                System.arraycopy(OooO00o2, 0, bArr, 0, 8);
                this.OooOO0O = OooO00o(z, bArr);
                byte[] bArr2 = new byte[8];
                System.arraycopy(OooO00o2, 8, bArr2, 0, 8);
                this.OooOO0o = OooO00o(!z, bArr2);
                if (OooO00o2.length == 24) {
                    byte[] bArr3 = new byte[8];
                    System.arraycopy(OooO00o2, 16, bArr3, 0, 8);
                    this.OooOOO0 = OooO00o(z, bArr3);
                    return;
                }
                this.OooOOO0 = this.OooOO0O;
                return;
            }
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        throw new IllegalArgumentException("invalid parameter passed to DESede init - " + r8.getClass().getName());
    }

    @Override // com.p118pd.sdk.C6293il1I, com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
