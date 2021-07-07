package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

public final class FinderPattern {
    public final ResultPoint[] resultPoints;
    public final int[] startEnd;
    public final int value;

    public FinderPattern(int i, int[] iArr, int i2, int i3, int i4) {
        this.value = i;
        this.startEnd = iArr;
        float f = (float) i4;
        this.resultPoints = new ResultPoint[]{new ResultPoint((float) i2, f), new ResultPoint((float) i3, f)};
    }

    public boolean equals(Object obj) {
        if ((obj instanceof FinderPattern) && this.value == ((FinderPattern) obj).value) {
            return true;
        }
        return false;
    }

    public ResultPoint[] getResultPoints() {
        return this.resultPoints;
    }

    public int[] getStartEnd() {
        return this.startEnd;
    }

    public int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }
}
