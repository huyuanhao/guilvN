package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    
    public final int mIntValue;

    /* access modifiers changed from: public */
    YogaUnit(int i) {
        this.mIntValue = i;
    }

    public static YogaUnit fromInt(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return POINT;
        }
        if (i == 2) {
            return PERCENT;
        }
        if (i == 3) {
            return AUTO;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
