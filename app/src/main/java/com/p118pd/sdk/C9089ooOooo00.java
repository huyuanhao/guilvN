package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.ooOooo00  reason: case insensitive filesystem */
public class C9089ooOooo00 extends Event<C9089ooOooo00> {
    public static final int OooO00o = 7;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Pools.OooO0O0<C9089ooOooo00> f22441OooO00o = new Pools.OooO0O0<>(7);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22442OooO00o = "onGestureHandlerStateChange";

    /* renamed from: OooO00o  reason: collision with other field name */
    public WritableMap f22443OooO00o;

    public static C9089ooOooo00 OooO00o(C9063ooOoOooo oooooooo, int i, int i2, @Nullable AbstractC9087ooOooo oooooo) {
        C9089ooOooo00 acquire = f22441OooO00o.acquire();
        if (acquire == null) {
            acquire = new C9089ooOooo00();
        }
        acquire.m20762OooO00o(oooooooo, i, i2, oooooo);
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), f22442OooO00o, this.f22443OooO00o);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return f22442OooO00o;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f22443OooO00o = null;
        f22441OooO00o.release(this);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m20762OooO00o(C9063ooOoOooo oooooooo, int i, int i2, @Nullable AbstractC9087ooOooo oooooo) {
        super.init(oooooooo.m20731OooO00o().getId());
        WritableMap createMap = Arguments.createMap();
        this.f22443OooO00o = createMap;
        if (oooooo != null) {
            oooooo.OooO00o(oooooooo, createMap);
        }
        this.f22443OooO00o.putInt("handlerTag", oooooooo.m20740OooO0OO());
        this.f22443OooO00o.putInt("state", i);
        this.f22443OooO00o.putInt("oldState", i2);
    }
}
