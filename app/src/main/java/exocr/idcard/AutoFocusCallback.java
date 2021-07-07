package exocr.idcard;

import android.hardware.Camera;
import android.os.Handler;

public final class AutoFocusCallback implements Camera.AutoFocusCallback {
    public static final long OooO00o = 1000;
    public static final String o0ooOOo = AutoFocusCallback.class.getSimpleName();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f23705OooO00o;
    public boolean OooO0O0 = false;
    public int o00oO0O;

    public void OooO00o(Handler handler, int i) {
        this.f23705OooO00o = handler;
        this.o00oO0O = i;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        if (z) {
            DebugLog.OooO0OO("myAutoFocusCallback: success...");
        } else {
            DebugLog.OooO0OO("myAutoFocusCallback: 失败了...");
        }
        Handler handler = this.f23705OooO00o;
        if (handler != null) {
            this.f23705OooO00o.sendMessageDelayed(handler.obtainMessage(this.o00oO0O, Boolean.valueOf(z)), 1000);
            this.f23705OooO00o = null;
            return;
        }
        DebugLog.m22048OooO00o("Got auto-focus callback, but no handler for it");
    }

    public void OooO00o(boolean z) {
        this.OooO0O0 = false;
    }
}
