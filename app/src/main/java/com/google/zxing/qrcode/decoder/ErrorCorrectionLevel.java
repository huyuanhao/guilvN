package com.google.zxing.qrcode.decoder;

public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    public static final ErrorCorrectionLevel[] FOR_BITS;
    public final int bits;

    /* access modifiers changed from: public */
    static {
        ErrorCorrectionLevel errorCorrectionLevel;
        ErrorCorrectionLevel errorCorrectionLevel2 = L;
        FOR_BITS = new ErrorCorrectionLevel[]{M, errorCorrectionLevel2, errorCorrectionLevel, Q};
    }

    /* access modifiers changed from: public */
    ErrorCorrectionLevel(int i) {
        this.bits = i;
    }

    public static ErrorCorrectionLevel forBits(int i) {
        if (i >= 0) {
            ErrorCorrectionLevel[] errorCorrectionLevelArr = FOR_BITS;
            if (i < errorCorrectionLevelArr.length) {
                return errorCorrectionLevelArr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}
