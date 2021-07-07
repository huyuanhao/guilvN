package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.l1lI1i丨1  reason: invalid class name */
public class l1lI1i1 extends Event<l1lI1i1> {
    public static final Pools.OooO0O0<l1lI1i1> OooO00o = new Pools.OooO0O0<>(3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public WritableMap f18299OooO00o;

    public static l1lI1i1 OooO00o(int i, WritableMap writableMap) {
        l1lI1i1 acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new l1lI1i1();
        }
        acquire.m17588OooO00o(i, writableMap);
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f18299OooO00o);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return CameraViewManager.Events.EVENT_ON_RECORDING_START.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m17588OooO00o(int i, WritableMap writableMap) {
        super.init(i);
        this.f18299OooO00o = writableMap;
    }
}
