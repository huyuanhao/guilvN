package com.google.zxing.qrcode.encoder;

public final class BlockPair {
    public final byte[] dataBytes;
    public final byte[] errorCorrectionBytes;

    public BlockPair(byte[] bArr, byte[] bArr2) {
        this.dataBytes = bArr;
        this.errorCorrectionBytes = bArr2;
    }

    public byte[] getDataBytes() {
        return this.dataBytes;
    }

    public byte[] getErrorCorrectionBytes() {
        return this.errorCorrectionBytes;
    }
}
