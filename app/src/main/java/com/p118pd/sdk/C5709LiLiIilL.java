package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.LiLiIilL  reason: case insensitive filesystem */
public class C5709LiLiIilL extends Event<C5709LiLiIilL> {
    public static final Pools.OooO0O0<C5709LiLiIilL> OooO00o = new Pools.OooO0O0<>(3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public WritableArray f16607OooO00o;

    public static C5709LiLiIilL OooO00o(int i, WritableArray writableArray) {
        C5709LiLiIilL acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new C5709LiLiIilL();
        }
        acquire.m16307OooO00o(i, writableArray);
        return acquire;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "barcode");
        createMap.putArray("barcodes", this.f16607OooO00o);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        if (this.f16607OooO00o.size() > 32767) {
            return o0OO0000.f20115OooO0O0;
        }
        return (short) this.f16607OooO00o.size();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return CameraViewManager.Events.EVENT_ON_BARCODES_DETECTED.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m16307OooO00o(int i, WritableArray writableArray) {
        super.init(i);
        this.f16607OooO00o = writableArray;
    }
}
