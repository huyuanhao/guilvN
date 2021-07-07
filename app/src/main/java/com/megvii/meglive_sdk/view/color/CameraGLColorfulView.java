package com.megvii.meglive_sdk.view.color;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.ExifInterface;
import android.opengl.GLSurfaceView;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.RelativeLayout;
import com.megvii.meglive_sdk.p096b.C1512a;
import com.megvii.meglive_sdk.p100e.p101a.p102a.C1538d;
import com.megvii.meglive_sdk.p100e.p103b.p104a.C1544a;
import com.megvii.meglive_sdk.p106f.C1565g;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.megvii.meglive_sdk.p106f.C1582w;
import com.megvii.meglive_sdk.p106f.C1583x;
import com.p118pd.sdk.C7997oO0ooOO0;
import com.xiaomi.mipush.sdk.Constants;
import exocr.idcard.CameraManager;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import s.h.e.l.l.C;

public final class CameraGLColorfulView extends GLSurfaceView {

    /* renamed from: a */
    public static int f2746a = 1;

    /* renamed from: b */
    public boolean f2747b;

    /* renamed from: c */
    public int f2748c;

    /* renamed from: d */
    public int f2749d;

    /* renamed from: e */
    public int f2750e;

    /* renamed from: f */
    public double f2751f;

    /* renamed from: g */
    public int f2752g;

    /* renamed from: h */
    public int f2753h;

    /* renamed from: i */
    public Context f2754i;

    /* renamed from: j */
    public AbstractC1592c f2755j;

    /* renamed from: k */
    public long f2756k;

    /* renamed from: l */
    public boolean f2757l;

    /* renamed from: m */
    public float f2758m;

    /* renamed from: n */
    public float f2759n;

    /* renamed from: o */
    public C1544a f2760o;

    /* renamed from: p */
    public OooO0O0 f2761p;

    /* renamed from: q */
    public Camera.PreviewCallback f2762q;

    public class OooO00o implements Runnable {
        public final /* synthetic */ C1538d OooO00o;

        public OooO00o(C1538d dVar) {
            this.OooO00o = dVar;
        }

        public final void run() {
            synchronized (CameraGLColorfulView.this.f2760o) {
                if (this.OooO00o != null) {
                    CameraGLColorfulView.this.f2760o.f2478c = this.OooO00o;
                }
            }
        }
    }

    public final class OooO0O0 extends Handler {
        public final int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0OO f15094OooO00o;
        public final int OooO0O0 = 2;
        public final int OooO0OO = 3;
        public final int OooO0Oo = 4;

        public OooO0O0(OooO0OO oooO0OO) {
            this.f15094OooO00o = oooO0OO;
        }

        public final void OooO00o(String str) {
            sendMessage(obtainMessage(3, str));
        }

        public final void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (this.f15094OooO00o != null) {
                                    OooO0OO.OooO00o(this.f15094OooO00o);
                                }
                                Looper.myLooper().quit();
                                this.f15094OooO00o = null;
                            } else {
                                throw new RuntimeException("unknown message:what=" + message.what);
                            }
                        } else if (this.f15094OooO00o != null) {
                            OooO0OO oooO0OO = this.f15094OooO00o;
                            String str = (String) message.obj;
                            if (oooO0OO.OooO0Oo) {
                                return;
                            }
                            if (oooO0OO.OooO00o != null) {
                                C1571m.m2656b("CameraGLColorfulView", "<~~~~~ START CAPTURING  LUX ~~~~~>");
                                oooO0OO.OooO0Oo = true;
                                if (oooO0OO.OooO00o != null) {
                                    try {
                                        oooO0OO.OooO00o(false, -1.0d);
                                    } catch (Throwable th) {
                                        th.printStackTrace();
                                    }
                                    C1571m.m2656b("CameraGLColorfulView", "camera unlock");
                                    try {
                                        oooO0OO.OooO00o.takePicture(null, null, new OooO0OO.OooO0O0(str));
                                        return;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        CameraGLColorfulView.this.f2751f = -101.0d;
                                        C1512a.m2287a(str);
                                        C1583x.m2690a(C1512a.m2289a("fail_ev:" + C1512a.f2088b[0], C1565g.m2630a(CameraGLColorfulView.this.f2754i), 3));
                                        oooO0OO.OooO0Oo = false;
                                        oooO0OO.m15132OooO00o();
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (this.f15094OooO00o != null) {
                        OooO0OO.OooO0O0(this.f15094OooO00o);
                    }
                    synchronized (this) {
                        notifyAll();
                    }
                } else if (this.f15094OooO00o != null) {
                    OooO0OO.OooO00o(this.f15094OooO00o, message.arg1, message.arg2);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        public final void OooO00o(boolean z) {
            synchronized (this) {
                sendEmptyMessage(2);
                if (z && this.f15094OooO00o.OooO0O0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public final class OooO0OO extends Thread {
        public Camera OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0O0 f15096OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f15098OooO00o = new Object();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final WeakReference<CameraGLColorfulView> f15099OooO00o;
        public volatile boolean OooO0O0 = false;
        public boolean OooO0OO;
        public volatile boolean OooO0Oo;
        public boolean OooO0o0 = false;

        public class OooO00o implements Runnable {
            public final /* synthetic */ Camera.Size OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ CameraGLColorfulView f15101OooO00o;

            public OooO00o(CameraGLColorfulView cameraGLColorfulView, Camera.Size size) {
                this.f15101OooO00o = cameraGLColorfulView;
                this.OooO00o = size;
            }

            public final void run() {
                Camera.Size size;
                CameraGLColorfulView cameraGLColorfulView = this.f15101OooO00o;
                if (cameraGLColorfulView != null && (size = this.OooO00o) != null) {
                    int i = size.width;
                    int i2 = size.height;
                    double d = (double) i;
                    Double.isNaN(d);
                    double d2 = (double) i2;
                    Double.isNaN(d2);
                    int a = ((int) (((float) cameraGLColorfulView.f2752g) * 0.58f)) + C1582w.m2687a(cameraGLColorfulView.f2754i, 12.0f);
                    int i3 = (int) (((float) a) * ((float) ((d * 1.0d) / d2)));
                    double d3 = (double) cameraGLColorfulView.f2753h;
                    Double.isNaN(d3);
                    double d4 = (double) (a / 2);
                    Double.isNaN(d4);
                    double d5 = (d3 * 0.37d) - d4;
                    double a2 = (double) C1582w.m2687a(cameraGLColorfulView.f2754i, 30.0f);
                    Double.isNaN(a2);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, i3);
                    layoutParams.addRule(14);
                    layoutParams.setMargins(0, (int) (d5 - a2), 0, 0);
                    cameraGLColorfulView.setLayoutParams(layoutParams);
                    if (cameraGLColorfulView.f2750e % 180 == 0) {
                        cameraGLColorfulView.f2748c = i;
                        cameraGLColorfulView.f2749d = i2;
                        return;
                    }
                    cameraGLColorfulView.f2748c = i2;
                    cameraGLColorfulView.f2749d = i;
                }
            }
        }

        public class OooO0O0 implements Camera.PictureCallback {
            public final /* synthetic */ String o0ooOOo;

            public OooO0O0(String str) {
                this.o0ooOOo = str;
            }

            public final void onPictureTaken(byte[] bArr, Camera camera) {
                C1571m.m2656b("CameraGLColorfulView", "camera.takePicture() success");
                try {
                    File OooO00o2 = OooO0OO.OooO00o();
                    FileOutputStream fileOutputStream = new FileOutputStream(OooO00o2);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    ExifInterface exifInterface = new ExifInterface(OooO00o2.getPath());
                    String attribute = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.f14239OoooOOo);
                    String attribute2 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.f14237OoooOOO);
                    String attribute3 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.f14245OoooOoo);
                    if (!(attribute == null || attribute2 == null)) {
                        if (attribute3 != null) {
                            double OooO00o3 = OooO0OO.OooO00o(Double.valueOf(attribute).doubleValue(), Double.valueOf(attribute2).doubleValue(), 1.0d * Double.valueOf(attribute3.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[0]).doubleValue());
                            C1571m.m2656b("CameraGLColorfulView", "cameraLux:".concat(String.valueOf(OooO00o3)));
                            CameraGLColorfulView.this.f2751f = OooO00o3;
                            OooO0OO.this.OooO00o(true, OooO00o3);
                            OooO00o2.delete();
                            OooO0OO.this.OooO0Oo = false;
                            OooO0OO.this.m15132OooO00o();
                        }
                    }
                    C1571m.m2656b("CameraGLColorfulView", "C.Lux error: one of the values were null!");
                    C1512a.m2287a(this.o0ooOOo);
                    C1583x.m2690a(C1512a.m2289a("fail_ev:" + C1512a.f2088b[1], C1565g.m2630a(CameraGLColorfulView.this.f2754i), 3));
                    CameraGLColorfulView.this.f2751f = -102.0d;
                    OooO00o2.delete();
                } catch (Throwable th) {
                    OooO0OO.this.OooO0Oo = false;
                    OooO0OO.this.m15132OooO00o();
                    throw th;
                }
                OooO0OO.this.OooO0Oo = false;
                OooO0OO.this.m15132OooO00o();
            }
        }

        /* renamed from: com.megvii.meglive_sdk.view.color.CameraGLColorfulView$OooO0OO$OooO0OO  reason: collision with other inner class name */
        public class C4903OooO0OO implements Comparator<Camera.Size> {
            public final /* synthetic */ int o00oO0O;
            public final /* synthetic */ int o0ooOO0;

            public C4903OooO0OO(int i, int i2) {
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

        public OooO0OO(CameraGLColorfulView cameraGLColorfulView) {
            super("Camera thread");
            this.f15099OooO00o = new WeakReference<>(cameraGLColorfulView);
        }

        public final void run() {
            Looper.prepare();
            synchronized (this.f15098OooO00o) {
                this.f15096OooO00o = new OooO0O0(this);
                this.OooO0O0 = true;
                this.f15098OooO00o.notify();
            }
            Looper.loop();
            synchronized (this.f15098OooO00o) {
                this.f15096OooO00o = null;
                this.OooO0O0 = false;
            }
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000b */
        /* renamed from: OooO00o  reason: collision with other method in class */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.megvii.meglive_sdk.view.color.CameraGLColorfulView.OooO0O0 m15131OooO00o() {
            /*
                r2 = this;
                java.lang.Object r0 = r2.f15098OooO00o
                monitor-enter(r0)
                java.lang.Object r1 = r2.f15098OooO00o     // Catch:{ InterruptedException -> 0x000b }
                r1.wait()     // Catch:{ InterruptedException -> 0x000b }
                goto L_0x000b
            L_0x0009:
                r1 = move-exception
                goto L_0x000f
            L_0x000b:
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                com.megvii.meglive_sdk.view.color.CameraGLColorfulView$OooO0O0 r0 = r2.f15096OooO00o
                return r0
            L_0x000f:
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.view.color.CameraGLColorfulView.OooO0OO.m15131OooO00o():com.megvii.meglive_sdk.view.color.CameraGLColorfulView$OooO0O0");
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final void m15132OooO00o() {
            if (this.OooO00o != null) {
                try {
                    if (CameraGLColorfulView.this.f2762q != null) {
                        this.OooO00o.setPreviewCallback(CameraGLColorfulView.this.f2762q);
                    }
                    this.OooO00o.startPreview();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public final void OooO00o(boolean z, double d) {
            try {
                if (d >= ((double) CameraGLColorfulView.this.f2759n)) {
                    this.OooO0o0 = false;
                } else if (this.OooO00o != null) {
                    Camera.Parameters parameters = this.OooO00o.getParameters();
                    C1571m.m2656b("CameraGLColorfulView", z ? "**** LOCKING CAMERA ****" : "**** UNLOCKING CAMERA ****");
                    if (parameters.isAutoExposureLockSupported()) {
                        parameters.setAutoExposureLock(z);
                    }
                    if (parameters.isAutoWhiteBalanceLockSupported()) {
                        parameters.setAutoWhiteBalanceLock(z);
                    }
                    this.OooO0o0 = z;
                    this.OooO00o.setParameters(parameters);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public static File OooO00o() {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "flashImage");
            file.mkdirs();
            if (file.canWrite()) {
                return new File(file, "evcheck");
            }
            return null;
        }

        private Camera.Size OooO00o(List<Camera.Size> list, int i, int i2) {
            return (Camera.Size) Collections.min(list, new C4903OooO0OO(i, i2));
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3 A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5 A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4 A[Catch:{ Exception -> 0x00f5 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void OooO00o(com.megvii.meglive_sdk.view.color.CameraGLColorfulView.OooO0OO r8, int r9, int r10) {
            /*
            // Method dump skipped, instructions count: 294
            */
            throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.view.color.CameraGLColorfulView.OooO0OO.OooO00o(com.megvii.meglive_sdk.view.color.CameraGLColorfulView$OooO0OO, int, int):void");
        }

        public static /* synthetic */ double OooO00o(double d, double d2, double d3) {
            return (Math.log(Math.pow(d, 2.0d) / d2) / Math.log(2.0d)) - (Math.log(d3 / 100.0d) / Math.log(2.0d));
        }
    }

    /* renamed from: com.megvii.meglive_sdk.view.color.CameraGLColorfulView$c */
    public interface AbstractC1592c {
        /* renamed from: a */
        void mo17047a(boolean z);
    }

    static {
        C.i(16777261);
    }

    public CameraGLColorfulView(Context context) {
        this(context, null, 0);
    }

    public final native SurfaceTexture getSurfaceTexture();

    public final native void onPause();

    public final native void onResume();

    public final void setICameraOpenCallBack(AbstractC1592c cVar) {
        this.f2755j = cVar;
    }

    public final void setPreviewCallback(Camera.PreviewCallback previewCallback) {
        this.f2762q = previewCallback;
    }

    public final native void setVideoEncoder(C1538d dVar);

    public final native void surfaceDestroyed(SurfaceHolder surfaceHolder);

    public CameraGLColorfulView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final synchronized void mo17255a() {
        if (this.f2761p == null) {
            OooO0OO oooO0OO = new OooO0OO(this);
            oooO0OO.start();
            this.f2761p = oooO0OO.m15131OooO00o();
        }
        OooO0O0 oooO0O0 = this.f2761p;
        oooO0O0.sendMessage(oooO0O0.obtainMessage(1, C7997oO0ooOO0.OooOoO, CameraManager.OooO0O0));
    }

    /* renamed from: b */
    public final synchronized void mo17257b() {
        if (this.f2761p != null) {
            this.f2761p.OooO00o(false);
        }
    }

    /* renamed from: c */
    public final synchronized void mo17258c() {
        if (this.f2761p != null) {
            this.f2761p.sendEmptyMessage(4);
            this.f2761p = null;
        }
    }

    public CameraGLColorfulView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f2761p = null;
        this.f2762q = null;
        this.f2756k = 0;
        this.f2757l = true;
        this.f2754i = context.getApplicationContext();
        this.f2760o = new C1544a(this);
        C1582w.m2688a(context);
        this.f2752g = C1582w.f2636e;
        this.f2753h = C1582w.f2637f;
        setEGLContextClientVersion(2);
        setRenderer(this.f2760o);
        setRenderMode(0);
        this.f2756k = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo17256a(float f, float f2, String str) {
        this.f2759n = f2;
        this.f2758m = f;
        if (this.f2757l) {
            this.f2756k = System.currentTimeMillis();
            this.f2757l = false;
        } else if (System.currentTimeMillis() - this.f2756k < 3000) {
            return;
        }
        if (this.f2761p != null) {
            C1512a.m2287a(str);
            C1583x.m2690a(C1512a.m2289a("enter_ev", C1565g.m2630a(this.f2754i), 3));
            this.f2761p.OooO00o(str);
            this.f2756k = System.currentTimeMillis();
        }
    }
}
