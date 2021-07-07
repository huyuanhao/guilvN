package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

public abstract class Token {
    public static final Token EMPTY = new SimpleToken(null, 0, 0);
    public final Token previous;

    public Token(Token token) {
        this.previous = token;
    }

    public final Token add(int i, int i2) {
        return new SimpleToken(this, i, i2);
    }

    public final Token addBinaryShift(int i, int i2) {
        return new BinaryShiftToken(this, i, i2);
    }

    public abstract void appendTo(BitArray bitArray, byte[] bArr);

    public final Token getPrevious() {
        return this.previous;
    }
}
