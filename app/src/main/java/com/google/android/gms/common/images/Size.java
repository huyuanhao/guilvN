package com.google.android.gms.common.images;

import com.facebook.react.views.text.FontMetricsUtil;

public final class Size {
    public final int zand;
    public final int zane;

    public Size(int i, int i2) {
        this.zand = i;
        this.zane = i2;
    }

    public static Size parseSize(String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw zah(str);
                }
            } else {
                throw zah(str);
            }
        } else {
            throw new IllegalArgumentException("string must not be null");
        }
    }

    public static NumberFormatException zah(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
        sb.append("Invalid Size: \"");
        sb.append(str);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.zand == size.zand && this.zane == size.zane;
        }
    }

    public final int getHeight() {
        return this.zane;
    }

    public final int getWidth() {
        return this.zand;
    }

    public final int hashCode() {
        int i = this.zane;
        int i2 = this.zand;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.zand;
        int i2 = this.zane;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT);
        sb.append(i2);
        return sb.toString();
    }
}
