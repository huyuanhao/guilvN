package com.p118pd.sdk;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: com.pd.sdk.o00OoO  reason: case insensitive filesystem */
public final class C7116o00OoO {
    public static final int OooO = 32768;
    @Deprecated
    public static final int OooO00o = 128;
    @Deprecated
    public static final int OooO0O0 = 256;
    @Deprecated
    public static final int OooO0OO = 512;
    @Deprecated
    public static final int OooO0Oo = 1024;
    @Deprecated
    public static final int OooO0o = 4096;
    @Deprecated
    public static final int OooO0o0 = 2048;
    @Deprecated
    public static final int OooO0oO = 8192;
    public static final int OooO0oo = 16384;
    public static final int OooOO0 = 65536;
    public static final int OooOO0O = 131072;
    public static final int OooOO0o = 262144;
    public static final int OooOOO = 1048576;
    public static final int OooOOO0 = 524288;
    public static final int OooOOOO = 2097152;
    public static final int OooOOOo = 4194304;
    public static final int OooOOo = 16777216;
    public static final int OooOOo0 = 8388608;
    public static final int OooOOoo = 0;
    public static final int OooOo0 = 2;
    public static final int OooOo00 = 1;
    public static final int OooOo0O = 4;
    public static final int OooOo0o = -1;

    @Deprecated
    public static void OooO00o(AccessibilityEvent accessibilityEvent, C7126o00OoOOo o00ooooo) {
        accessibilityEvent.appendRecord((AccessibilityRecord) o00ooooo.m18459OooO00o());
    }

    public static void OooO0O0(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static void OooO0OO(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityEvent.setMovementGranularity(i);
        }
    }

    @Deprecated
    public static int OooO0Oo(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    @Deprecated
    public static C7126o00OoOOo OooO00o(AccessibilityEvent accessibilityEvent, int i) {
        return new C7126o00OoOOo(accessibilityEvent.getRecord(i));
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C7126o00OoOOo m18390OooO00o(AccessibilityEvent accessibilityEvent) {
        return new C7126o00OoOOo(accessibilityEvent);
    }

    public static int OooO0O0(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    public static int OooO0OO(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return accessibilityEvent.getMovementGranularity();
        }
        return 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18391OooO00o(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityEvent.setAction(i);
        }
    }

    public static int OooO00o(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return accessibilityEvent.getAction();
        }
        return 0;
    }
}
