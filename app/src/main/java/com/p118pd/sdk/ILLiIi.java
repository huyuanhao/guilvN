package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.ILL丨iIi  reason: invalid class name */
public class ILLiIi extends Event<ILLiIi> {
    public static final Pools.OooO0O0<ILLiIi> OooO00o = new Pools.OooO0O0<>(3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f15596OooO00o;

    public static ILLiIi OooO00o(int i, String str) {
        ILLiIi acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new ILLiIi();
        }
        acquire.m15503OooO00o(i, str);
        return acquire;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", this.f15596OooO00o);
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
        return CameraViewManager.Events.EVENT_ON_MOUNT_ERROR.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m15503OooO00o(int i, String str) {
        super.init(i);
        this.f15596OooO00o = str;
    }
}
