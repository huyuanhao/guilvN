package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.l1L丨LiLl  reason: invalid class name */
public class l1LLiLl extends Event<l1LLiLl> {
    public static final Pools.OooO0O0<l1LLiLl> OooO00o = new Pools.OooO0O0<>(3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public WritableArray f18280OooO00o;

    public static l1LLiLl OooO00o(int i, WritableArray writableArray) {
        l1LLiLl acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new l1LLiLl();
        }
        acquire.m17573OooO00o(i, writableArray);
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), OooO00o());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return CameraViewManager.Events.EVENT_ON_TEXT_RECOGNIZED.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m17573OooO00o(int i, WritableArray writableArray) {
        super.init(i);
        this.f18280OooO00o = writableArray;
    }

    private WritableMap OooO00o() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "textBlock");
        createMap.putArray("textBlocks", this.f18280OooO00o);
        createMap.putInt("target", getViewTag());
        return createMap;
    }
}
