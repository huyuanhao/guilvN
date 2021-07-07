package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public enum YogaExperimentalFeature {
    WEB_FLEX_BASIS(0);
    
    public final int mIntValue;

    /* access modifiers changed from: public */
    YogaExperimentalFeature(int i) {
        this.mIntValue = i;
    }

    public static YogaExperimentalFeature fromInt(int i) {
        if (i == 0) {
            return WEB_FLEX_BASIS;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
