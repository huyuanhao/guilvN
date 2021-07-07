package com.shockwave.pdfium.util;

import com.facebook.react.views.text.FontMetricsUtil;

public class SizeF {
    public final float height;
    public final float width;

    public SizeF(float f, float f2) {
        this.width = f;
        this.height = f2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeF)) {
            return false;
        }
        SizeF sizeF = (SizeF) obj;
        if (this.width == sizeF.width && this.height == sizeF.height) {
            return true;
        }
        return false;
    }

    public float getHeight() {
        return this.height;
    }

    public float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.width) ^ Float.floatToIntBits(this.height);
    }

    public Size toSize() {
        return new Size((int) this.width, (int) this.height);
    }

    public String toString() {
        return this.width + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + this.height;
    }
}
