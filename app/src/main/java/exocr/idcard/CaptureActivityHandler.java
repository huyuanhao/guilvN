package exocr.idcard;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import exocr.exocrengine.EXIDCardResult;

public final class CaptureActivityHandler extends Handler {
    public static final String OooO00o = CaptureActivityHandler.class.getSimpleName();
    public int OooO = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "quit");

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23760OooO00o = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "auto_focus");

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CaptureActivity f23761OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public State f23762OooO00o = State.SUCCESS;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final DecodeThread f23763OooO00o;
    public int OooO0O0 = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "restart_preview");
    public int OooO0OO = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "stop_preview");
    public int OooO0Oo = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "decode");
    public int OooO0o = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "decode_failed");
    public int OooO0o0 = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "decode_succeeded");
    public int OooO0oO = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "return_scan_result");
    public int OooO0oo = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "launch_product_query");

    public enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public CaptureActivityHandler(CaptureActivity captureActivity) {
        this.f23761OooO00o = captureActivity;
        DecodeThread decodeThread = new DecodeThread(captureActivity);
        this.f23763OooO00o = decodeThread;
        decodeThread.start();
        CameraManager.OooO00o().OooO0Oo();
        OooO0o0();
    }

    private void OooO0o0() {
        if (this.f23762OooO00o == State.SUCCESS) {
            this.f23762OooO00o = State.PREVIEW;
            CameraManager.OooO00o().OooO0O0(this.f23763OooO00o.OooO00o(), this.OooO0Oo);
            CameraManager.OooO00o().OooO00o(this, this.f23760OooO00o);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m22047OooO00o() {
        CameraManager.OooO00o().OooO0o0();
    }

    public void OooO0O0() {
        this.f23762OooO00o = State.DONE;
        CameraManager.OooO00o().OooO0o0();
        Message.obtain(this.f23763OooO00o.OooO00o(), this.OooO).sendToTarget();
        try {
            this.f23763OooO00o.join();
        } catch (InterruptedException unused) {
        }
        removeMessages(this.OooO0o0);
        removeMessages(this.OooO0o);
    }

    public void OooO0OO() {
        this.f23762OooO00o = State.PREVIEW;
        CameraManager.OooO00o().OooO0O0(this.f23763OooO00o.OooO00o(), this.OooO0Oo);
        CameraManager.OooO00o().OooO00o(this, this.f23760OooO00o);
    }

    public void OooO0Oo() {
        CameraManager.OooO00o().OooO00o(this.f23761OooO00o);
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == this.f23760OooO00o) {
            if (this.f23762OooO00o == State.PREVIEW) {
                CameraManager.OooO00o().OooO00o(this, this.f23760OooO00o);
            }
        } else if (i == this.OooO0O0) {
            DebugLog.m22048OooO00o("Got restart preview message");
            OooO0o0();
        } else if (i == this.OooO0o0) {
            DebugLog.m22048OooO00o("Got decode succeeded message");
            this.f23762OooO00o = State.SUCCESS;
            this.f23761OooO00o.OooO00o((EXIDCardResult) message.obj);
        } else if (i == this.OooO0o) {
            this.f23762OooO00o = State.PREVIEW;
            CameraManager.OooO00o().OooO0O0(this.f23763OooO00o.OooO00o(), this.OooO0Oo);
        } else if (i == this.OooO0oO) {
            DebugLog.m22048OooO00o("Got return scan result message");
            this.f23761OooO00o.setResult(-1, (Intent) message.obj);
            this.f23761OooO00o.finish();
        } else if (i == this.OooO0oo) {
            DebugLog.m22048OooO00o("Got product query message");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj));
            intent.addFlags(524288);
            this.f23761OooO00o.startActivity(intent);
        }
    }

    public Bitmap OooO00o() {
        return ((DecodeHandler) this.f23763OooO00o.OooO00o()).OooO00o();
    }
}
