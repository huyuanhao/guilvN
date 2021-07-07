package exocr.idcard;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

public final class DecodeThread extends Thread {
    public Handler OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CaptureActivity f23768OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CountDownLatch f23769OooO00o = new CountDownLatch(1);

    public DecodeThread(CaptureActivity captureActivity) {
        this.f23768OooO00o = captureActivity;
    }

    public Handler OooO00o() {
        try {
            this.f23769OooO00o.await();
        } catch (InterruptedException unused) {
        }
        return this.OooO00o;
    }

    public void run() {
        Looper.prepare();
        this.OooO00o = new DecodeHandler(this.f23768OooO00o);
        this.f23769OooO00o.countDown();
        Looper.loop();
    }
}
