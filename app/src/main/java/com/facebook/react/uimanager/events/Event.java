package com.facebook.react.uimanager.events;

import com.facebook.react.common.SystemClock;
import com.facebook.react.uimanager.events.Event;

public abstract class Event<T extends Event> {
    public static int sUniqueID;
    public boolean mInitialized;
    public long mTimestampMs;
    public int mUniqueID;
    public int mViewTag;

    public Event() {
        int i = sUniqueID;
        sUniqueID = i + 1;
        this.mUniqueID = i;
    }

    public boolean canCoalesce() {
        return true;
    }

    public T coalesce(T t) {
        return getTimestampMs() >= t.getTimestampMs() ? this : t;
    }

    public abstract void dispatch(RCTEventEmitter rCTEventEmitter);

    public final void dispose() {
        this.mInitialized = false;
        onDispose();
    }

    public short getCoalescingKey() {
        return 0;
    }

    public abstract String getEventName();

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public int getUniqueID() {
        return this.mUniqueID;
    }

    public final int getViewTag() {
        return this.mViewTag;
    }

    public void init(int i) {
        this.mViewTag = i;
        this.mTimestampMs = SystemClock.uptimeMillis();
        this.mInitialized = true;
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }

    public void onDispose() {
    }

    public Event(int i) {
        int i2 = sUniqueID;
        sUniqueID = i2 + 1;
        this.mUniqueID = i2;
        init(i);
    }
}
