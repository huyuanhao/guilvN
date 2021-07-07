package com.p118pd.sdk;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;

/* renamed from: com.pd.sdk.ooOooOo  reason: case insensitive filesystem */
public class C9084ooOooOo {
    public static final float OooO00o = 0.1f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ReactRootView f22436OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ReactContext f22437OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9063ooOoOooo f22438OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9066ooOoo00 f22439OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22440OooO00o = false;
    public boolean OooO0O0 = false;

    /* renamed from: com.pd.sdk.ooOooOo$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            C9084ooOooOo.this.OooO0O0();
        }
    }

    /* renamed from: com.pd.sdk.ooOooOo$OooO0O0 */
    public class OooO0O0 extends C9063ooOoOooo {
        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.C9063ooOoOooo
        public void OooO0OO(MotionEvent motionEvent) {
            if (m20737OooO0O0() == 0) {
                m20738OooO0O0();
                C9084ooOooOo.this.f22440OooO00o = false;
            }
            if (motionEvent.getActionMasked() == 1) {
                m20744OooO0Oo();
            }
        }

        @Override // com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo
        public void OooO0o() {
            C9084ooOooOo.this.f22440OooO00o = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            C9084ooOooOo.this.f22436OooO00o.onChildStartedNativeGesture(obtain);
        }

        public /* synthetic */ OooO0O0(C9084ooOooOo ooooooo, OooO00o oooO00o) {
            this();
        }
    }

    public C9084ooOooOo(ReactContext reactContext, ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        if (id >= 1) {
            RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) reactContext.getNativeModule(RNGestureHandlerModule.class);
            C9082ooOooOO registry = rNGestureHandlerModule.getRegistry();
            this.f22436OooO00o = OooO00o(viewGroup);
            Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Initialize gesture handler for root view " + this.f22436OooO00o);
            this.f22437OooO00o = reactContext;
            C9066ooOoo00 ooooo00 = new C9066ooOoo00(viewGroup, registry, new C9088ooOooo0());
            this.f22439OooO00o = ooooo00;
            ooooo00.OooO00o(0.1f);
            OooO0O0 oooO0O0 = new OooO0O0(this, null);
            this.f22438OooO00o = oooO0O0;
            oooO0O0.m20734OooO00o(-id);
            registry.OooO00o(this.f22438OooO00o);
            registry.OooO00o(this.f22438OooO00o.m20740OooO0OO(), id);
            rNGestureHandlerModule.registerRootHelper(this);
            return;
        }
        throw new IllegalStateException("Expect view tag to be set for " + viewGroup);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0O0() {
        C9063ooOoOooo oooooooo = this.f22438OooO00o;
        if (oooooooo != null && oooooooo.m20737OooO0O0() == 2) {
            this.f22438OooO00o.m20733OooO00o();
            this.f22438OooO00o.m20744OooO0Oo();
        }
    }

    public static ReactRootView OooO00o(ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        ViewParent viewParent = viewGroup;
        while (viewParent != null && !(viewParent instanceof ReactRootView)) {
            viewParent = viewParent.getParent();
        }
        if (viewParent != null) {
            return (ReactRootView) viewParent;
        }
        throw new IllegalStateException("View " + viewGroup + " has not been mounted under ReactRootView");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20761OooO00o() {
        Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f22436OooO00o);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) this.f22437OooO00o.getNativeModule(RNGestureHandlerModule.class);
        rNGestureHandlerModule.getRegistry().m20760OooO00o(this.f22438OooO00o.m20740OooO0OO());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }

    public ReactRootView OooO00o() {
        return this.f22436OooO00o;
    }

    public void OooO00o(boolean z) {
        if (this.f22439OooO00o != null && !this.OooO0O0) {
            OooO0O0();
        }
    }

    public boolean OooO00o(MotionEvent motionEvent) {
        this.OooO0O0 = true;
        this.f22439OooO00o.m20748OooO00o(motionEvent);
        this.OooO0O0 = false;
        if (this.f22440OooO00o) {
            return true;
        }
        return false;
    }

    public void OooO00o(int i, boolean z) {
        if (z) {
            UiThreadUtil.runOnUiThread(new OooO00o());
        }
    }
}
