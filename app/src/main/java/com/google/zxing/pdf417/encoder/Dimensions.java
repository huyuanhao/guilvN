package com.google.zxing.pdf417.encoder;

public final class Dimensions {
    public final int maxCols;
    public final int maxRows;
    public final int minCols;
    public final int minRows;

    public Dimensions(int i, int i2, int i3, int i4) {
        this.minCols = i;
        this.maxCols = i2;
        this.minRows = i3;
        this.maxRows = i4;
    }

    public int getMaxCols() {
        return this.maxCols;
    }

    public int getMaxRows() {
        return this.maxRows;
    }

    public int getMinCols() {
        return this.minCols;
    }

    public int getMinRows() {
        return this.minRows;
    }
}
