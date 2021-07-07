package com.megvii.meglive_sdk.p100e.p103b;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.megvii.meglive_sdk.p100e.p101a.C1542d;
import com.megvii.meglive_sdk.p106f.C1578s;
import com.megvii.meglive_sdk.view.CameraGLView;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.megvii.meglive_sdk.e.b.b */
public final class C1545b implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer {

    /* renamed from: a */
    public SurfaceTexture f2488a;

    /* renamed from: b */
    public int f2489b;

    /* renamed from: c */
    public C1542d f2490c;

    /* renamed from: d */
    public int f2491d;

    /* renamed from: e */
    public boolean f2492e = false;

    /* renamed from: f */
    public boolean f2493f = false;

    /* renamed from: g */
    public final WeakReference<CameraGLView> f2494g;

    /* renamed from: h */
    public final float[] f2495h = new float[16];

    /* renamed from: i */
    public final float[] f2496i = new float[16];

    /* renamed from: j */
    public long f2497j;

    /* renamed from: k */
    public CameraGLView f2498k;

    /* renamed from: l */
    public C1543a f2499l;

    /* renamed from: m */
    public volatile boolean f2500m = false;

    /* renamed from: n */
    public boolean f2501n = true;

    /* renamed from: o */
    public int f2502o = 0;

    public C1545b(CameraGLView cameraGLView) {
        this.f2494g = new WeakReference<>(cameraGLView);
        Matrix.setIdentityM(this.f2496i, 0);
        Matrix.rotateM(this.f2496i, 0, 270.0f, 0.0f, 0.0f, 1.0f);
    }

    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        SurfaceTexture surfaceTexture = this.f2488a;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(this.f2495h);
            this.f2499l.mo17156a(this.f2495h);
            this.f2488a.updateTexImage();
            boolean z = !this.f2501n;
            this.f2501n = z;
            if (z) {
                synchronized (this) {
                }
            }
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        CameraGLView cameraGLView = this.f2498k;
        if (cameraGLView != null) {
            cameraGLView.requestRender();
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        CameraGLView cameraGLView = this.f2494g.get();
        if (cameraGLView != null) {
            cameraGLView.mo17223a();
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        if (GLES20.glGetString(7939).contains("OES_EGL_image_external")) {
            this.f2489b = C1578s.m2671a();
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f2489b);
            this.f2488a = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            GLES20.glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
            CameraGLView cameraGLView = this.f2494g.get();
            this.f2498k = cameraGLView;
            if (cameraGLView != null) {
                cameraGLView.f2662b = true;
            }
            this.f2499l = new C1543a(this.f2489b);
            this.f2497j = System.currentTimeMillis();
            return;
        }
        throw new RuntimeException("This system does not support OES_EGL_image_external.");
    }
}
