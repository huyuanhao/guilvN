package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public enum YogaPositionType {
    RELATIVE(0),
    ABSOLUTE(1);
    
    public final int mIntValue;

    /* access modifiers changed from: public */
    YogaPositionType(int i) {
        this.mIntValue = i;
    }

    public static YogaPositionType fromInt(int i) {
        if (i == 0) {
            return RELATIVE;
        }
        if (i == 1) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
