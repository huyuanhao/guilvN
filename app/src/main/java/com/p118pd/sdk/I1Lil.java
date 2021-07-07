package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.I丨1Lil  reason: invalid class name */
public class I1Lil extends Event<I1Lil> {
    public static final Pools.OooO0O0<I1Lil> OooO00o = new Pools.OooO0O0<>(3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6321ilLLl f15949OooO00o;

    public static I1Lil OooO00o(int i, C6321ilLLl r2) {
        I1Lil acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new I1Lil();
        }
        acquire.m15736OooO00o(i, r2);
        return acquire;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        C6321ilLLl r1 = this.f15949OooO00o;
        createMap.putBoolean("isOperational", r1 != null && r1.m17367OooO00o());
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
        return CameraViewManager.Events.EVENT_ON_BARCODE_DETECTION_ERROR.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m15736OooO00o(int i, C6321ilLLl r2) {
        super.init(i);
        this.f15949OooO00o = r2;
    }
}
