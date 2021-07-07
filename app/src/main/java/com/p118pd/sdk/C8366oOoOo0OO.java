package com.p118pd.sdk;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;

/* renamed from: com.pd.sdk.oOoOo0OO  reason: case insensitive filesystem */
public class C8366oOoOo0OO implements AbstractC8292oOo00Oo {
    public WeakReference<AbstractC8194oOOo0OoO> OooO00o;

    public C8366oOoOo0OO(AbstractC8194oOOo0OoO oooo0ooo) {
        this.OooO00o = new WeakReference<>(oooo0ooo);
    }

    @Override // com.p118pd.sdk.AbstractC8292oOo00Oo
    public void OooO00o(Entry entry, C8246oOOoo0oO ooooo0oo) {
        WeakReference<AbstractC8194oOOo0OoO> weakReference = this.OooO00o;
        if (weakReference != null) {
            AbstractC8194oOOo0OoO oooo0ooo = weakReference.get();
            ((RCTEventEmitter) ((ReactContext) oooo0ooo.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(oooo0ooo.getId(), "topSelect", C8370oOoOo0oo.OooO00o(entry));
        }
    }

    @Override // com.p118pd.sdk.AbstractC8292oOo00Oo
    public void OooO00o() {
        WeakReference<AbstractC8194oOOo0OoO> weakReference = this.OooO00o;
        if (weakReference != null) {
            AbstractC8194oOOo0OoO oooo0ooo = weakReference.get();
            ((RCTEventEmitter) ((ReactContext) oooo0ooo.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(oooo0ooo.getId(), "topSelect", null);
        }
    }
}
