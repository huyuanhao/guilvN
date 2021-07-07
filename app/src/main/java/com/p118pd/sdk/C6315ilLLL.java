package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.ilLLL  reason: case insensitive filesystem */
public class C6315ilLLL extends Event<C6315ilLLL> {
    public static final Pools.OooO0O0<C6315ilLLL> OooO00o = new Pools.OooO0O0<>(3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public WritableArray f18025OooO00o;

    public static C6315ilLLL OooO00o(int i, WritableArray writableArray) {
        C6315ilLLL acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new C6315ilLLL();
        }
        acquire.m17357OooO00o(i, writableArray);
        return acquire;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "face");
        createMap.putArray("faces", this.f18025OooO00o);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        if (this.f18025OooO00o.size() > 32767) {
            return o0OO0000.f20115OooO0O0;
        }
        return (short) this.f18025OooO00o.size();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return CameraViewManager.Events.EVENT_ON_FACES_DETECTED.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m17357OooO00o(int i, WritableArray writableArray) {
        super.init(i);
        this.f18025OooO00o = writableArray;
    }
}
