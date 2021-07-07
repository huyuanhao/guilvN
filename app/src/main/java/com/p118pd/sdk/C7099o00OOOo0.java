package com.p118pd.sdk;

import android.view.MotionEvent;

/* renamed from: com.pd.sdk.o00OOOo0  reason: case insensitive filesystem */
public final class C7099o00OOOo0 {
    @Deprecated
    public static final int OooO = 10;
    @Deprecated
    public static final int OooO00o = 255;
    @Deprecated
    public static final int OooO0O0 = 5;
    @Deprecated
    public static final int OooO0OO = 6;
    @Deprecated
    public static final int OooO0Oo = 7;
    @Deprecated
    public static final int OooO0o = 65280;
    @Deprecated
    public static final int OooO0o0 = 8;
    @Deprecated
    public static final int OooO0oO = 8;
    @Deprecated
    public static final int OooO0oo = 9;
    @Deprecated
    public static final int OooOO0 = 0;
    @Deprecated
    public static final int OooOO0O = 1;
    @Deprecated
    public static final int OooOO0o = 2;
    @Deprecated
    public static final int OooOOO = 4;
    @Deprecated
    public static final int OooOOO0 = 3;
    @Deprecated
    public static final int OooOOOO = 5;
    @Deprecated
    public static final int OooOOOo = 6;
    @Deprecated
    public static final int OooOOo = 8;
    @Deprecated
    public static final int OooOOo0 = 7;
    @Deprecated
    public static final int OooOOoo = 9;
    @Deprecated
    public static final int OooOo = 14;
    @Deprecated
    public static final int OooOo0 = 11;
    @Deprecated
    public static final int OooOo00 = 10;
    @Deprecated
    public static final int OooOo0O = 12;
    @Deprecated
    public static final int OooOo0o = 13;
    @Deprecated
    public static final int OooOoO = 16;
    @Deprecated
    public static final int OooOoO0 = 15;
    @Deprecated
    public static final int OooOoOO = 17;
    @Deprecated
    public static final int OooOoo = 19;
    @Deprecated
    public static final int OooOoo0 = 18;
    @Deprecated
    public static final int OooOooO = 20;
    @Deprecated
    public static final int OooOooo = 21;
    @Deprecated
    public static final int Oooo = 35;
    @Deprecated
    public static final int Oooo0 = 25;
    @Deprecated
    public static final int Oooo000 = 22;
    @Deprecated
    public static final int Oooo00O = 23;
    @Deprecated
    public static final int Oooo00o = 24;
    public static final int Oooo0O0 = 26;
    public static final int Oooo0OO = 27;
    @Deprecated
    public static final int Oooo0o = 32;
    public static final int Oooo0o0 = 28;
    @Deprecated
    public static final int Oooo0oO = 33;
    @Deprecated
    public static final int Oooo0oo = 34;
    @Deprecated
    public static final int OoooO = 39;
    @Deprecated
    public static final int OoooO0 = 37;
    @Deprecated
    public static final int OoooO00 = 36;
    @Deprecated
    public static final int OoooO0O = 38;
    @Deprecated
    public static final int OoooOO0 = 40;
    @Deprecated
    public static final int OoooOOO = 42;
    @Deprecated
    public static final int OoooOOo = 43;
    @Deprecated
    public static final int OoooOo0 = 44;
    @Deprecated
    public static final int OoooOoO = 45;
    @Deprecated
    public static final int OoooOoo = 46;
    @Deprecated
    public static final int Ooooo00 = 47;
    @Deprecated
    public static final int Ooooo0o = 1;
    @Deprecated
    public static final int o000oOoO = 41;

    @Deprecated
    public static int OooO00o(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int OooO0O0(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static float OooO0OO(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    @Deprecated
    public static int OooO0Oo(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    public static int OooO0o0(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m18373OooO00o(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static int m18375OooO0O0(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    public static int OooO0OO(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18374OooO00o(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    @Deprecated
    public static float OooO0O0(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    public static float OooO00o(MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }

    @Deprecated
    public static float OooO00o(MotionEvent motionEvent, int i, int i2) {
        return motionEvent.getAxisValue(i, i2);
    }
}
