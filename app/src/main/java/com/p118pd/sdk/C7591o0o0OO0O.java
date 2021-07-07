package com.p118pd.sdk;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.beefe.picker.view.LoopView;

/* renamed from: com.pd.sdk.o0o0OO0O  reason: case insensitive filesystem */
public final class C7591o0o0OO0O extends GestureDetector.SimpleOnGestureListener {
    public final LoopView OooO00o;

    public C7591o0o0OO0O(LoopView loopView) {
        this.OooO00o = loopView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.OooO00o.OooO00o(f2);
        return true;
    }
}
