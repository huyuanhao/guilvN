package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public enum YogaNodeType {
    DEFAULT(0),
    TEXT(1);
    
    public final int mIntValue;

    /* access modifiers changed from: public */
    YogaNodeType(int i) {
        this.mIntValue = i;
    }

    public static YogaNodeType fromInt(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return TEXT;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
