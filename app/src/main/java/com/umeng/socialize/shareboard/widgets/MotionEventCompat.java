package com.umeng.socialize.shareboard.widgets;

import android.view.MotionEvent;

public class MotionEventCompat {
    public static final int ACTION_MASK = 255;
    public static final int ACTION_POINTER_DOWN = 5;
    public static final int ACTION_POINTER_INDEX_MASK = 65280;
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;
    public static final int ACTION_POINTER_UP = 6;

    public static int getActionIndex(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }
}
