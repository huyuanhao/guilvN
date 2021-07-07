package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.丨i1I  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9563i1I implements li1l11I1, I1LLllll {
    public final li1l11I1 OooO00o;

    public AbstractC9563i1I(li1l11I1 li1l11i1) {
        this.OooO00o = li1l11i1;
    }

    @Override // com.p118pd.sdk.I1LLllll
    public final byte OooO00o(byte b) {
        return OooO0O0(b);
    }

    @Override // com.p118pd.sdk.I1LLllll
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        int i4 = i + i2;
        if (i4 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        } else if (i3 + i2 <= bArr2.length) {
            while (i < i4) {
                bArr2[i3] = OooO0O0(bArr[i]);
                i3++;
                i++;
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public li1l11I1 OooO00o() {
        return this.OooO00o;
    }

    public abstract byte OooO0O0(byte b);
}
