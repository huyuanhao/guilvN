package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.AbstractC3634x;

public enum Gender implements AbstractC3634x {
    MALE(0),
    FEMALE(1),
    UNKNOWN(2);
    
    public final int value;

    /* access modifiers changed from: public */
    Gender(int i) {
        this.value = i;
    }

    public static Gender findByValue(int i) {
        if (i == 0) {
            return MALE;
        }
        if (i == 1) {
            return FEMALE;
        }
        if (i != 2) {
            return null;
        }
        return UNKNOWN;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3634x
    public int getValue() {
        return this.value;
    }
}
