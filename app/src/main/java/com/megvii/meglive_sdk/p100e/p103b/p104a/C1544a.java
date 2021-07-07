package com.megvii.meglive_sdk.p100e.p103b.p104a;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.megvii.meglive_sdk.p100e.p101a.p102a.C1538d;
import com.megvii.meglive_sdk.p100e.p103b.C1543a;
import com.megvii.meglive_sdk.p106f.C1578s;
import com.megvii.meglive_sdk.view.color.CameraGLColorfulView;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.megvii.meglive_sdk.e.b.a.a */
public final class C1544a implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer {

    /* renamed from: a */
    public SurfaceTexture f2476a;

    /* renamed from: b */
    public int f2477b;

    /* renamed from: c */
    public C1538d f2478c;

    /* renamed from: d */
    public final WeakReference<CameraGLColorfulView> f2479d;

    /* renamed from: e */
    public final float[] f2480e = new float[16];

    /* renamed from: f */
    public final float[] f2481f = new float[16];

    /* renamed from: g */
    public long f2482g;

    /* renamed from: h */
    public CameraGLColorfulView f2483h;

    /* renamed from: i */
    public C1543a f2484i;

    /* renamed from: j */
    public volatile boolean f2485j = false;

    /* renamed from: k */
    public boolean f2486k = true;

    /* renamed from: l */
    public int f2487l = 0;

    public C1544a(CameraGLColorfulView cameraGLColorfulView) {
        this.f2479d = new WeakReference<>(cameraGLColorfulView);
        Matrix.setIdentityM(this.f2481f, 0);
        Matrix.rotateM(this.f2481f, 0, 270.0f, 0.0f, 0.0f, 1.0f);
    }

    public final void onDrawFrame(GL10 gl10) {
        try {
            GLES20.glClear(16640);
            if (this.f2476a != null) {
                this.f2476a.getTransformMatrix(this.f2480e);
                this.f2484i.mo17156a(this.f2480e);
                this.f2476a.updateTexImage();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        CameraGLColorfulView cameraGLColorfulView = this.f2483h;
        if (cameraGLColorfulView != null) {
            cameraGLColorfulView.requestRender();
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        CameraGLColorfulView cameraGLColorfulView = this.f2479d.get();
        if (cameraGLColorfulView != null) {
            cameraGLColorfulView.mo17255a();
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        if (GLES20.glGetString(7939).contains("OES_EGL_image_external")) {
            this.f2477b = C1578s.m2671a();
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f2477b);
            this.f2476a = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            GLES20.glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
            CameraGLColorfulView cameraGLColorfulView = this.f2479d.get();
            this.f2483h = cameraGLColorfulView;
            if (cameraGLColorfulView != null) {
                cameraGLColorfulView.f2747b = true;
            }
            this.f2484i = new C1543a(this.f2477b);
            this.f2482g = System.currentTimeMillis();
            return;
        }
        throw new RuntimeException("This system does not support OES_EGL_image_external.");
    }
}
