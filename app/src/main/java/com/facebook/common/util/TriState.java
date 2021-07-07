package com.facebook.common.util;

import com.facebook.infer.annotation.Functional;

public enum TriState {
    YES,
    NO,
    UNSET;

    /* renamed from: com.facebook.common.util.TriState$1 */
    public static /* synthetic */ class C04721 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$common$util$TriState;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.common.util.TriState[] r0 = com.facebook.common.util.TriState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.common.util.TriState.C04721.$SwitchMap$com$facebook$common$util$TriState = r0
                com.facebook.common.util.TriState r1 = com.facebook.common.util.TriState.YES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.common.util.TriState.C04721.$SwitchMap$com$facebook$common$util$TriState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.common.util.TriState r1 = com.facebook.common.util.TriState.NO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.common.util.TriState.C04721.$SwitchMap$com$facebook$common$util$TriState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.common.util.TriState r1 = com.facebook.common.util.TriState.UNSET     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.util.TriState.C04721.<clinit>():void");
        }
    }

    @Functional
    public static TriState fromDbValue(int i) {
        if (i == 1) {
            return YES;
        }
        if (i != 2) {
            return UNSET;
        }
        return NO;
    }

    @Functional
    public boolean asBoolean() {
        int i = C04721.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
        throw new IllegalStateException("No boolean equivalent for UNSET");
    }

    @Functional
    public Boolean asBooleanObject() {
        int i = C04721.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i == 2) {
            return Boolean.FALSE;
        }
        if (i == 3) {
            return null;
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    @Functional
    public int getDbValue() {
        int i = C04721.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    @Functional
    public boolean isSet() {
        return this != UNSET;
    }

    @Functional
    public static TriState valueOf(boolean z) {
        return z ? YES : NO;
    }

    @Functional
    public static TriState valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    @Functional
    public boolean asBoolean(boolean z) {
        int i = C04721.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return z;
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }
}
