package com.p118pd.sdk;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.ooOooO0O  reason: case insensitive filesystem */
public class C9080ooOooO0O extends ReactRootView {
    @Nullable
    public ReactInstanceManager OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9084ooOooOo f22432OooO00o;

    public C9080ooOooO0O(Context context) {
        super(context);
    }

    public void OooO00o() {
        if (this.f22432OooO00o == null) {
            this.f22432OooO00o = new C9084ooOooOo(this.OooO00o.getCurrentReactContext(), this);
            return;
        }
        throw new IllegalStateException("GestureHandler already initialized for root view " + this);
    }

    public void OooO0O0() {
        C9084ooOooOo ooooooo = this.f22432OooO00o;
        if (ooooooo != null) {
            ooooooo.m20761OooO00o();
            this.f22432OooO00o = null;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C9084ooOooOo ooooooo = this.f22432OooO00o;
        if (ooooooo == null || !ooooooo.OooO00o(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // com.facebook.react.ReactRootView
    public void requestDisallowInterceptTouchEvent(boolean z) {
        C9084ooOooOo ooooooo = this.f22432OooO00o;
        if (ooooooo != null) {
            ooooooo.OooO00o(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // com.facebook.react.ReactRootView
    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str, @Nullable Bundle bundle) {
        super.startReactApplication(reactInstanceManager, str, bundle);
        this.OooO00o = reactInstanceManager;
    }
}
