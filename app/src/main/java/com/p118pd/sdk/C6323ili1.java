package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.ili1  reason: case insensitive filesystem */
public class C6323ili1 implements li1l11I1 {
    public static final int OooO0O0 = 1;
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18039OooO00o;

    public C6323ili1() {
        this(1);
    }

    public C6323ili1(int i) {
        this.OooO00o = i;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.f18039OooO00o) {
            int i3 = this.OooO00o;
            if (i + i3 > bArr.length) {
                throw new DataLengthException("input buffer too short");
            } else if (i3 + i2 <= bArr2.length) {
                int i4 = 0;
                while (true) {
                    int i5 = this.OooO00o;
                    if (i4 >= i5) {
                        return i5;
                    }
                    bArr2[i2 + i4] = bArr[i + i4];
                    i4++;
                }
            } else {
                throw new OutputLengthException("output buffer too short");
            }
        } else {
            throw new IllegalStateException("Null engine not initialised");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17371OooO00o() {
        return "Null";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) throws IllegalArgumentException {
        this.f18039OooO00o = true;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
