package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.ooOooO0o  reason: case insensitive filesystem */
public class C9081ooOooO0o extends Event<C9081ooOooO0o> {
    public static final int OooO00o = 7;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Pools.OooO0O0<C9081ooOooO0o> f22433OooO00o = new Pools.OooO0O0<>(7);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22434OooO00o = "onGestureHandlerEvent";

    /* renamed from: OooO00o  reason: collision with other field name */
    public WritableMap f22435OooO00o;

    public static C9081ooOooO0o OooO00o(C9063ooOoOooo oooooooo, @Nullable AbstractC9087ooOooo oooooo) {
        C9081ooOooO0o acquire = f22433OooO00o.acquire();
        if (acquire == null) {
            acquire = new C9081ooOooO0o();
        }
        acquire.m20758OooO00o(oooooooo, oooooo);
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), f22434OooO00o, this.f22435OooO00o);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return f22434OooO00o;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f22435OooO00o = null;
        f22433OooO00o.release(this);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m20758OooO00o(C9063ooOoOooo oooooooo, @Nullable AbstractC9087ooOooo oooooo) {
        super.init(oooooooo.m20731OooO00o().getId());
        WritableMap createMap = Arguments.createMap();
        this.f22435OooO00o = createMap;
        if (oooooo != null) {
            oooooo.OooO00o(oooooooo, createMap);
        }
        this.f22435OooO00o.putInt("handlerTag", oooooooo.m20740OooO0OO());
        this.f22435OooO00o.putInt("state", oooooooo.m20737OooO0O0());
    }
}
