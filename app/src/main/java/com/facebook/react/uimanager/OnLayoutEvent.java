package com.facebook.react.uimanager;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.text.FontMetricsUtil;

public class OnLayoutEvent extends Event<OnLayoutEvent> {
    public static final Pools.OooO0O0<OnLayoutEvent> EVENTS_POOL = new Pools.OooO0O0<>(20);
    public int mHeight;
    public int mWidth;

    /* renamed from: mX */
    public int f980mX;

    /* renamed from: mY */
    public int f981mY;

    public static OnLayoutEvent obtain(int i, int i2, int i3, int i4, int i5) {
        OnLayoutEvent acquire = EVENTS_POOL.acquire();
        if (acquire == null) {
            acquire = new OnLayoutEvent();
        }
        acquire.init(i, i2, i3, i4, i5);
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, (double) PixelUtil.toDIPFromPixel((float) this.f980mX));
        createMap.putDouble("y", (double) PixelUtil.toDIPFromPixel((float) this.f981mY));
        createMap.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mWidth));
        createMap.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mHeight));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", getViewTag());
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap2);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topLayout";
    }

    public void init(int i, int i2, int i3, int i4, int i5) {
        super.init(i);
        this.f980mX = i2;
        this.f981mY = i3;
        this.mWidth = i4;
        this.mHeight = i5;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        EVENTS_POOL.release(this);
    }
}
