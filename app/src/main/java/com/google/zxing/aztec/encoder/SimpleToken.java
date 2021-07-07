package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.p118pd.sdk.C8318oOo0oooo;

public final class SimpleToken extends Token {
    public final short bitCount;
    public final short value;

    public SimpleToken(Token token, int i, int i2) {
        super(token);
        this.value = (short) i;
        this.bitCount = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public void appendTo(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.value, this.bitCount);
    }

    public String toString() {
        short s = this.value;
        short s2 = this.bitCount;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(i | (1 << this.bitCount)).substring(1) + C8318oOo0oooo.OooO0o0;
    }
}
