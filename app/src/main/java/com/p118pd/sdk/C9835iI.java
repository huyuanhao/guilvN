package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.text.FontMetricsUtil;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.丨丨iI丨  reason: invalid class name and case insensitive filesystem */
public class C9835iI extends Event<C9835iI> {
    public static final Pools.OooO0O0<C9835iI> OooO00o = new Pools.OooO0O0<>(3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23429OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23430OooO00o;
    public int OooO0O0;

    public static C9835iI OooO00o(int i, boolean z, int i2, int i3) {
        C9835iI acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new C9835iI();
        }
        acquire.m21920OooO00o(i, z, i2, i3);
        return acquire;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, this.f23429OooO00o);
        createMap2.putInt("y", this.OooO0O0);
        createMap.putBoolean("isDoubleTap", this.f23430OooO00o);
        createMap.putMap("touchOrigin", createMap2);
        return createMap;
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
        return CameraViewManager.Events.EVENT_ON_TOUCH.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m21920OooO00o(int i, boolean z, int i2, int i3) {
        super.init(i);
        this.f23429OooO00o = i2;
        this.OooO0O0 = i3;
        this.f23430OooO00o = z;
    }
}
