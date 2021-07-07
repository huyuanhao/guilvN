package com.megvii.meglive_sdk.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.RelativeLayout;
import com.megvii.meglive_sdk.p100e.p101a.C1542d;
import com.megvii.meglive_sdk.p100e.p103b.C1545b;
import com.megvii.meglive_sdk.p106f.C1582w;
import com.p118pd.sdk.C7997oO0ooOO0;
import exocr.idcard.CameraManager;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import s.h.e.l.l.C;

public final class CameraGLView extends GLSurfaceView {

    /* renamed from: a */
    public static int f2661a = 1;

    /* renamed from: b */
    public boolean f2662b;

    /* renamed from: c */
    public int f2663c;

    /* renamed from: d */
    public int f2664d;

    /* renamed from: e */
    public int f2665e;

    /* renamed from: f */
    public int f2666f;

    /* renamed from: g */
    public int f2667g;

    /* renamed from: h */
    public AbstractC1591c f2668h;

    /* renamed from: i */
    public C1545b f2669i;

    /* renamed from: j */
    public OooO0O0 f2670j;

    /* renamed from: k */
    public Camera.PreviewCallback f2671k;

    public class OooO00o implements Runnable {
        public final /* synthetic */ C1542d OooO00o;

        public OooO00o(C1542d dVar) {
            this.OooO00o = dVar;
        }

        public final void run() {
            synchronized (CameraGLView.this.f2669i) {
                CameraGLView.this.f2669i.f2490c = this.OooO00o;
            }
        }
    }

    public static final class OooO0O0 extends Handler {
        public OooO0OO OooO00o;

        public OooO0O0(OooO0OO oooO0OO) {
            this.OooO00o = oooO0OO;
        }

        public final void OooO00o(boolean z) {
            synchronized (this) {
                sendEmptyMessage(2);
                if (z && this.OooO00o.OooO0O0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                OooO0OO.OooO00o(this.OooO00o, message.arg1, message.arg2);
            } else if (i == 2) {
                OooO0OO.OooO00o(this.OooO00o);
                synchronized (this) {
                    notifyAll();
                }
                Looper.myLooper().quit();
                this.OooO00o = null;
            } else {
                throw new RuntimeException("unknown message:what=" + message.what);
            }
        }
    }

    public static final class OooO0OO extends Thread {
        public Camera OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0O0 f15088OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f15089OooO00o = new Object();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final WeakReference<CameraGLView> f15090OooO00o;
        public volatile boolean OooO0O0 = false;
        public boolean OooO0OO;

        public class OooO00o implements Runnable {
            public final /* synthetic */ Camera.Size OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ CameraGLView f15092OooO00o;

            public OooO00o(CameraGLView cameraGLView, Camera.Size size) {
                this.f15092OooO00o = cameraGLView;
                this.OooO00o = size;
            }

            public final void run() {
                Camera.Size size;
                CameraGLView cameraGLView = this.f15092OooO00o;
                if (cameraGLView != null && (size = this.OooO00o) != null) {
                    int i = size.width;
                    int i2 = size.height;
                    double d = (double) i;
                    Double.isNaN(d);
                    double d2 = (double) i2;
                    Double.isNaN(d2);
                    int i3 = cameraGLView.f2666f;
                    int i4 = ((i3 * 3) / 4) + 40;
                    double d3 = (double) cameraGLView.f2667g;
                    Double.isNaN(d3);
                    double d4 = (double) (((i3 * 3) / 4) / 2);
                    Double.isNaN(d4);
                    int i5 = (int) (((d3 * 0.37d) - d4) - 20.0d);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, (int) (((float) i4) * ((float) ((d * 1.0d) / d2))));
                    layoutParams.addRule(14);
                    layoutParams.setMargins(0, i5, 0, 0);
                    cameraGLView.setLayoutParams(layoutParams);
                    if (cameraGLView.f2665e % 180 == 0) {
                        cameraGLView.f2663c = i;
                        cameraGLView.f2664d = i2;
                        return;
                    }
                    cameraGLView.f2663c = i2;
                    cameraGLView.f2664d = i;
                }
            }
        }

        public static class OooO0O0 implements Comparator<Camera.Size> {
            public final /* synthetic */ int o00oO0O;
            public final /* synthetic */ int o0ooOO0;

            public OooO0O0(int i, int i2) {
                this.o00oO0O = i;
                this.o0ooOO0 = i2;
            }

            private int OooO00o(Camera.Size size) {
                return Math.abs(this.o00oO0O - size.width) + Math.abs(this.o0ooOO0 - size.height);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
                return OooO00o(size) - OooO00o(size2);
            }
        }

        public OooO0OO(CameraGLView cameraGLView) {
            super("Camera thread");
            this.f15090OooO00o = new WeakReference<>(cameraGLView);
        }

        public final void run() {
            Looper.prepare();
            synchronized (this.f15089OooO00o) {
                this.f15088OooO00o = new OooO0O0(this);
                this.OooO0O0 = true;
                this.f15089OooO00o.notify();
            }
            Looper.loop();
            synchronized (this.f15089OooO00o) {
                this.f15088OooO00o = null;
                this.OooO0O0 = false;
            }
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.megvii.meglive_sdk.view.CameraGLView.OooO0O0 OooO00o() {
            /*
                r2 = this;
                java.lang.Object r0 = r2.f15089OooO00o
                monitor-enter(r0)
                java.lang.Object r1 = r2.f15089OooO00o     // Catch:{ InterruptedException -> 0x000b }
                r1.wait()     // Catch:{ InterruptedException -> 0x000b }
                goto L_0x000b
            L_0x0009:
                r1 = move-exception
                goto L_0x000f
            L_0x000b:
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                com.megvii.meglive_sdk.view.CameraGLView$OooO0O0 r0 = r2.f15088OooO00o
                return r0
            L_0x000f:
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.view.CameraGLView.OooO0OO.OooO00o():com.megvii.meglive_sdk.view.CameraGLView$OooO0O0");
        }

        public static Camera.Size OooO00o(List<Camera.Size> list, int i, int i2) {
            return (Camera.Size) Collections.min(list, new OooO0O0(i, i2));
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2 A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3 A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8 A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3 A[Catch:{ Exception -> 0x00f5 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void OooO00o(com.megvii.meglive_sdk.view.CameraGLView.OooO0OO r6, int r7, int r8) {
            /*
            // Method dump skipped, instructions count: 257
            */
            throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.view.CameraGLView.OooO0OO.OooO00o(com.megvii.meglive_sdk.view.CameraGLView$OooO0OO, int, int):void");
        }
    }

    /* renamed from: com.megvii.meglive_sdk.view.CameraGLView$c */
    public interface AbstractC1591c {
    }

    static {
        C.i(16777260);
    }

    public CameraGLView(Context context) {
        this(context, null, 0);
    }

    public final native SurfaceTexture getSurfaceTexture();

    public final native void onPause();

    public final native void onResume();

    public final native void setCanVideoRecord(boolean z);

    public final native void setHasFace(boolean z);

    public final void setICameraOpenCallBack(AbstractC1591c cVar) {
        this.f2668h = cVar;
    }

    public final void setPreviewCallback(Camera.PreviewCallback previewCallback) {
        this.f2671k = previewCallback;
    }

    public final native void setVideoEncoder(C1542d dVar);

    public final native void setVideoFps(int i);

    public final native void surfaceDestroyed(SurfaceHolder surfaceHolder);

    public CameraGLView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final synchronized void mo17223a() {
        if (this.f2670j == null) {
            OooO0OO oooO0OO = new OooO0OO(this);
            oooO0OO.start();
            this.f2670j = oooO0OO.OooO00o();
        }
        OooO0O0 oooO0O0 = this.f2670j;
        oooO0O0.sendMessage(oooO0O0.obtainMessage(1, C7997oO0ooOO0.OooOoO, CameraManager.OooO0O0));
    }

    public CameraGLView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f2670j = null;
        this.f2671k = null;
        this.f2669i = new C1545b(this);
        C1582w.m2688a(context);
        this.f2666f = C1582w.f2636e;
        this.f2667g = C1582w.f2637f;
        setEGLContextClientVersion(2);
        setRenderer(this.f2669i);
        setRenderMode(0);
    }
}
