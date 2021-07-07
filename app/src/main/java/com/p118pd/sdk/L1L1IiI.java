package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.L丨1L1IiI  reason: invalid class name */
public class L1L1IiI extends Event<L1L1IiI> {
    public static final Pools.OooO0O0<L1L1IiI> OooO00o = new Pools.OooO0O0<>(3);

    public static L1L1IiI OooO00o(int i) {
        L1L1IiI acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new L1L1IiI();
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
        return CameraViewManager.Events.EVENT_ON_PICTURE_TAKEN.toString();
    }
}
