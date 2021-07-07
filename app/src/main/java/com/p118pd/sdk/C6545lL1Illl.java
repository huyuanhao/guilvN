package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.lL1Ill丨l  reason: invalid class name and case insensitive filesystem */
public class C6545lL1Illl extends Event<C6545lL1Illl> {
    public static final Pools.OooO0O0<C6545lL1Illl> OooO00o = new Pools.OooO0O0<>(5);

    /* renamed from: OooO00o  reason: collision with other field name */
    public WritableMap f18449OooO00o;

    public static C6545lL1Illl OooO00o(int i, WritableMap writableMap) {
        C6545lL1Illl acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new C6545lL1Illl();
        }
        acquire.m17660OooO00o(i, writableMap);
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f18449OooO00o);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) (this.f18449OooO00o.getMap("data").getString("uri").hashCode() % 32767);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return CameraViewManager.Events.EVENT_ON_PICTURE_SAVED.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m17660OooO00o(int i, WritableMap writableMap) {
        super.init(i);
        this.f18449OooO00o = writableMap;
    }
}
