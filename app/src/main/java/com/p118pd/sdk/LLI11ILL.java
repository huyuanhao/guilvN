package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.LLI11ILL */
public class LLI11ILL extends Event<LLI11ILL> {
    public static final Pools.OooO0O0<LLI11ILL> OooO00o = new Pools.OooO0O0<>(3);

    public static LLI11ILL OooO00o(int i) {
        LLI11ILL acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new LLI11ILL();
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
        return CameraViewManager.Events.EVENT_CAMERA_READY.toString();
    }
}
