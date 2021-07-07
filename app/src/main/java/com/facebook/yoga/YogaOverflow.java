package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public enum YogaOverflow {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);
    
    public final int mIntValue;

    /* access modifiers changed from: public */
    YogaOverflow(int i) {
        this.mIntValue = i;
    }

    public static YogaOverflow fromInt(int i) {
        if (i == 0) {
            return VISIBLE;
        }
        if (i == 1) {
            return HIDDEN;
        }
        if (i == 2) {
            return SCROLL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
