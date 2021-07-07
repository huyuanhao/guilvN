package exocr.idcard;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;

public final class PreviewCallback implements Camera.PreviewCallback {
    public static final String o0ooOOo = PreviewCallback.class.getSimpleName();
    public Handler OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CameraConfigurationManager f23809OooO00o;
    public final boolean OooO0O0;
    public int o00oO0O;

    public PreviewCallback(CameraConfigurationManager cameraConfigurationManager, boolean z) {
        this.f23809OooO00o = cameraConfigurationManager;
        this.OooO0O0 = z;
    }

    public void OooO00o(Handler handler, int i) {
        this.OooO00o = handler;
        this.o00oO0O = i;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point OooO00o2 = this.f23809OooO00o.m22031OooO00o();
        if (!this.OooO0O0) {
            camera.setPreviewCallback(null);
        }
        Handler handler = this.OooO00o;
        if (handler != null) {
            handler.obtainMessage(this.o00oO0O, OooO00o2.x, OooO00o2.y, bArr).sendToTarget();
            this.OooO00o = null;
            return;
        }
        DebugLog.m22048OooO00o("Got preview callback, but no handler for it");
    }
}
