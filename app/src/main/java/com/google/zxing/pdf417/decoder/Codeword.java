package com.google.zxing.pdf417.decoder;

public final class Codeword {
    public static final int BARCODE_ROW_UNKNOWN = -1;
    public final int bucket;
    public final int endX;
    public int rowNumber = -1;
    public final int startX;
    public final int value;

    public Codeword(int i, int i2, int i3, int i4) {
        this.startX = i;
        this.endX = i2;
        this.bucket = i3;
        this.value = i4;
    }

    public int getBucket() {
        return this.bucket;
    }

    public int getEndX() {
        return this.endX;
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public int getStartX() {
        return this.startX;
    }

    public int getValue() {
        return this.value;
    }

    public int getWidth() {
        return this.endX - this.startX;
    }

    public boolean hasValidRowNumber() {
        return isValidRowNumber(this.rowNumber);
    }

    public boolean isValidRowNumber(int i) {
        return i != -1 && this.bucket == (i % 3) * 3;
    }

    public void setRowNumber(int i) {
        this.rowNumber = i;
    }

    public void setRowNumberAsRowIndicatorColumn() {
        this.rowNumber = ((this.value / 30) * 3) + (this.bucket / 3);
    }

    public String toString() {
        return this.rowNumber + "|" + this.value;
    }
}
