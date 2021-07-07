package com.facebook.react.views.scroll;

import androidx.core.util.Pools;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.text.FontMetricsUtil;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import javax.annotation.Nullable;

public class ScrollEvent extends Event<ScrollEvent> {
    public static final Pools.OooO0O0<ScrollEvent> EVENTS_POOL = new Pools.OooO0O0<>(3);
    public int mContentHeight;
    public int mContentWidth;
    @Nullable
    public ScrollEventType mScrollEventType;
    public int mScrollViewHeight;
    public int mScrollViewWidth;
    public int mScrollX;
    public int mScrollY;
    public double mXVelocity;
    public double mYVelocity;

    private void init(int i, ScrollEventType scrollEventType, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        super.init(i);
        this.mScrollEventType = scrollEventType;
        this.mScrollX = i2;
        this.mScrollY = i3;
        this.mXVelocity = (double) f;
        this.mYVelocity = (double) f2;
        this.mContentWidth = i4;
        this.mContentHeight = i5;
        this.mScrollViewWidth = i6;
        this.mScrollViewHeight = i7;
    }

    public static ScrollEvent obtain(int i, ScrollEventType scrollEventType, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        ScrollEvent acquire = EVENTS_POOL.acquire();
        if (acquire == null) {
            acquire = new ScrollEvent();
        }
        acquire.init(i, scrollEventType, i2, i3, f, f2, i4, i5, i6, i7);
        return acquire;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", AbstractC8352oOoOOoO0.OooO0O0);
        createMap.putDouble("bottom", AbstractC8352oOoOOoO0.OooO0O0);
        createMap.putDouble("left", AbstractC8352oOoOOoO0.OooO0O0);
        createMap.putDouble("right", AbstractC8352oOoOOoO0.OooO0O0);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, (double) PixelUtil.toDIPFromPixel((float) this.mScrollX));
        createMap2.putDouble("y", (double) PixelUtil.toDIPFromPixel((float) this.mScrollY));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mContentWidth));
        createMap3.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mContentHeight));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mScrollViewWidth));
        createMap4.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mScrollViewHeight));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, this.mXVelocity);
        createMap5.putDouble("y", this.mYVelocity);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt("target", getViewTag());
        createMap6.putBoolean("responderIgnoreScroll", true);
        return createMap6;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return this.mScrollEventType == ScrollEventType.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return ScrollEventType.getJSEventName((ScrollEventType) Assertions.assertNotNull(this.mScrollEventType));
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        EVENTS_POOL.release(this);
    }
}
