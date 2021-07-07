package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.丨IIl  reason: invalid class name and case insensitive filesystem */
public class C9353IIl extends Event<C9353IIl> {
    public static final Pools.OooO0O0<C9353IIl> OooO00o = new Pools.OooO0O0<>(3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1 f22884OooO00o;

    public static C9353IIl OooO00o(int i, I1 r2) {
        C9353IIl acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new C9353IIl();
        }
        acquire.m21412OooO00o(i, r2);
        return acquire;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        I1 r1 = this.f22884OooO00o;
        createMap.putBoolean("isOperational", r1 != null && r1.m15337OooO00o());
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
        return CameraViewManager.Events.EVENT_ON_FACE_DETECTION_ERROR.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m21412OooO00o(int i, I1 r2) {
        super.init(i);
        this.f22884OooO00o = r2;
    }
}
