package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.l丨111  reason: invalid class name and case insensitive filesystem */
public class C6813l111 extends Event<C6813l111> {
    public static final Pools.OooO0O0<C6813l111> OooO00o = new Pools.OooO0O0<>(3);

    public static C6813l111 OooO00o(int i) {
        C6813l111 acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new C6813l111();
        }
        acquire.init(i);
        return acquire;
    }

    private WritableMap serializeEventData() {
        return Arguments.createMap();
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
        return CameraViewManager.Events.EVENT_ON_RECORDING_END.toString();
    }
}
