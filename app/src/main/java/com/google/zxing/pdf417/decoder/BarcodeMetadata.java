package com.google.zxing.pdf417.decoder;

public final class BarcodeMetadata {
    public final int columnCount;
    public final int errorCorrectionLevel;
    public final int rowCount;
    public final int rowCountLowerPart;
    public final int rowCountUpperPart;

    public BarcodeMetadata(int i, int i2, int i3, int i4) {
        this.columnCount = i;
        this.errorCorrectionLevel = i4;
        this.rowCountUpperPart = i2;
        this.rowCountLowerPart = i3;
        this.rowCount = i2 + i3;
    }

    public int getColumnCount() {
        return this.columnCount;
    }

    public int getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowCountLowerPart() {
        return this.rowCountLowerPart;
    }

    public int getRowCountUpperPart() {
        return this.rowCountUpperPart;
    }
}
